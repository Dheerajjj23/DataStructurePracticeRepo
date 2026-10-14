package CollectionsInJava.ArrayLists;

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone p1 = new landline();
        p1.greet();
    }
}

class Phone{
    public void greet(){
        System.out.println("Hello this class is called phone");
    }
}

class landline extends Phone{
    String name;
    public void greet(){
        super.greet();
        System.out.println("Hello this class is called landline");
    }
}

class Smartphone extends Phone{
    String name;
    public void greet(){
        System.out.println("Hello this class is called smartphone");
    }
}
