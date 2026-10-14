package Basic.interfacePractice;

abstract class testAbstractClass {
    abstract void greet();
}
interface testInterface {
    //The static method of this interface belongs to the interface and not to the class that implements it.
    static void greet1(){
        System.out.println("Hello, This is a test Interface");
    }
    default void greet2(){
        System.out.println("Hello, This is a default method of test Interface");
    }
    void greet();
}
