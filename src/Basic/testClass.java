package Basic;

class MyClass{
    static class InnerClass{
        public void greet(){
            System.out.println("Hello from InnerClass");
        }

        static void display(){
            System.out.println("Static method in InnerClass");
        }
    }
}


public class testClass {
    public static void main(String[] args) {
        MyClass.InnerClass inner = new MyClass.InnerClass();
        inner.greet();
        MyClass.InnerClass.display();
    }
}
