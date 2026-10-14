package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class clientClass {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            System.out.println("Connected to server!");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            PrintWriter output = new PrintWriter(
                    socket.getOutputStream(), true
            );

            // Thread for receiving messages
            Thread receiveThread = new Thread(() -> {
                try {
                    String message;

                    while ((message = input.readLine()) != null) {
                        System.out.println("Server: " + message);
                    }

                } catch (IOException e) {
                    System.out.println("Connection closed.");
                }
            });

            receiveThread.start();

            // Main thread sends messages
            BufferedReader keyboard = new BufferedReader(
                    new InputStreamReader(System.in)
            );

            String message;

            while ((message = keyboard.readLine()) != null) {

                if (message.equalsIgnoreCase("exit")) {
                    break;
                }

                output.println(message);
            }

            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
