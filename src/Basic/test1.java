package Basic;

class Myclass2{

    void greet(){
        var a = 10;
    }
}
public class test1 {
    static final String name = "Dheeraj";
    public static void main(String[] args) {
        final String name = "Dheeraj";
//        name = "Joshi"; // This line will cause a compilation error because 'name' is declared as final
        System.out.println(name);
    }
}
