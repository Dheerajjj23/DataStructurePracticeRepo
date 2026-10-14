package GenericsInJava;

public class OverloadingInGenericMethods {
    public static void main(String[] args) {
            display(22);
//            display(2);

    }

    public static void display(Integer a){
        System.out.println("Integer method is running " + a);
    }

    public static <T> void display(T a){
        System.out.println("Generic method is running " + a);
    }
}
