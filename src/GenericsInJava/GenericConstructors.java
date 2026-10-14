package GenericsInJava;

public class GenericConstructors<T> {

    public GenericConstructors(T obj) {
        System.out.println("Constructor called with: " + obj);
    }
}

class GenericConstructors2{
    //Creating a generic constructor in a non-generic class
    public <T extends Number> GenericConstructors2(T obj) {
        System.out.println("Constructor called with: " + obj);
    }
}

class TestGenericConstructors {
    public static void main(String[] args) {
        GenericConstructors<Integer> intConstructor = new GenericConstructors<>(42);
        GenericConstructors<String> stringConstructor = new GenericConstructors<>("Hello, Generics!");

        GenericConstructors2 genericConstructor2 = new GenericConstructors2(3.14);
        GenericConstructors2 genericConstructor22 = new GenericConstructors2(100);


    }
}
