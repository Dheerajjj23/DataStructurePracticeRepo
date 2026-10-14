package Basic;

class Person {
    String name;
    Integer id;

    void greet() {
        System.out.println("Hello, my name is " + name);
    }
}

class Child implements Runnable {
    String name;
    Integer id;

    void greet() {
        System.out.println("Hello, my name is " + name);
    }

    @Override
    public void run() {
        System.out.println("Child is running");
    }
}
public class InstanceOfInJava {

    static Person p1 = new Person();

    public static void main(String[] args) {
        System.out.println(p1 instanceof Person);
    }

}
