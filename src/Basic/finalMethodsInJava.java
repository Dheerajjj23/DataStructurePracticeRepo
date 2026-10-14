package Basic;

class Parent{

    public final void display(){
        System.out.println("This is a final method in the parent class");
    }

    public final void display(int a){
        System.out.println("This is a final method in the parent class with an integer parameter: " + a);
    }

    private void greet(){
        System.out.println("This is a private method in the parent class");
    }

    //As method overloading is based on runtime polymorphism, and static methods are resolved at compile time, we cannot override a static method in the child class. Instead, we can define a static method with the same name in the child class, which is called method hiding.
    static void show(){
        System.out.println("This is a static method in the parent class");
    }
}

class Child1 extends Parent{
    //this will throw an error because we cannot override a final method in the child class
//    public void display(){
//        System.out.println("This is a method in the child class");
//    }

    //Private methods are not inherited by the child class, so we can define a method with the same name in the child class
    private void greet(){
        System.out.println("This is a method in the child class");
    }

    //this is called method hiding because we cannot override a static method in the child class
    static void show(){
        System.out.println("This is a static method in the child class");
    }
}
public class finalMethodsInJava {
    public static void main(String... args) {

        Parent parent = new Parent();
        parent.display();
        parent.display(10);
    }

}
