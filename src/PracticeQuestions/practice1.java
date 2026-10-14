package PracticeQuestions;

public class practice1 {
    public static void main(String[] args) {
        String name = "Dheeraj Joshi";
        String reversedName = reverseString(name);
        System.out.println(reversedName);
    }

    static String reverseString(String str) {
//        StringBuilder reversed = new StringBuilder();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed.append(str.charAt(i));
//        }
//        return reversed.toString();

        String rev = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                continue;
            }
            rev = str.charAt(i) + rev;
        }
        return rev;
    }
}
