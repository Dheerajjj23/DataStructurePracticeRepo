package LinearSearchQuestions;

public class HigherOrderFunctions{

        static int multiplySum(TestInterface t1, int a, int b, TestInterface t2, int a2, int b2){
            return t1.sum(a, b) * t2.sum(a2, b2);
        }

    public static void main(String[] args) {
        TestInterface t1 = (x, y) -> x + y;
        TestInterface t2 = (x, y) -> x + y;

        int result = multiplySum(t1, 2, 3, t2, 4, 5);
        System.out.println(result);
    }

}

