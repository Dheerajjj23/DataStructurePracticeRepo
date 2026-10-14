package LinearSearchQuestions;

//Searching a character in a string using linear search
public class SearchingInString {
    public static void main(String[] args) {
        String name = "Dheeraj Joshi";
        char key = 'J';
        int result = searchCharacterInString(name, key);
        if (result == -1) {
            System.out.println("Character not found in the string");
        } else {
            System.out.println("Character found at index: " + result);
        }
    }

    static int searchCharacterInString(String str, char key) {
        if (str.length() == 0) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == key) {
                return i;
            }
        }
        return -1;
    }
}
