package Basic.interfacePractice;

class testImplInterfaceClass implements testInterface{

    @Override
    public void greet2() {
        testInterface.super.greet2();
    }

    @Override
    public void greet() {
        System.out.println("Hello from testImplInterfaceClass");
    }
}

public class testInterfaceImpl{
    public static void main(String[] args) {
        testImplInterfaceClass obj = new testImplInterfaceClass();
        obj.greet();
        obj.greet2();
    }
}
