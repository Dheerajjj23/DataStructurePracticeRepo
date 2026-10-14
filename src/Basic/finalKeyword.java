package Basic;

class finalTest{

    private final int age;

    public finalTest(int age) {
        this.age = age;
    }

}
public class finalKeyword {
    public static void main(String[] args) {

//        private final int age;
//
//        public finalKeyword(int age) {
//            this.age = age;
//        }
        doSum2(2,3); //output will be 30 because we are changing the value of a and b inside the method
    }
    public static int doSum(final int a, final int b){
//        a= 10;
//        b= 20;
        return a+b;
    }

    public static int doSum2(int a, int b){
        a= 10;
        b= 20;
        return a+b;
    }

}
