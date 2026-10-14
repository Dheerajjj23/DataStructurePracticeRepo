package Basic;
class temp1{

    public static String name;
    String className;
    int age;
    boolean flag;

    public int sum(int a, int b){
        return a+b;
    }

    public static int sum2(int a, int b){
        return a+b;
    }

}
public class staticKeyword {

    public static void main(String[] args) {
        temp1.name= "Dheeraj";
        System.out.println(temp1.name);
        System.out.println(temp1.sum2(10, 20));
    }

}
