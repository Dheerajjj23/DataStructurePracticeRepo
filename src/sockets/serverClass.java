package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class serverClass {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);

            System.out.println("Waiting for client...");

            Socket socket = serverSocket.accept();

            System.out.println("Client connected!");

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
                        System.out.println("Client: " + message);
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
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
