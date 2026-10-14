package GenericsInJava;

enum DAY{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class G3 {
    public static void main(String[] args) {
        DAY day =DAY.MONDAY;
//        day = "HELLO"; // This line will cause a compilation error because you cannot assign a String to an enum type.
        System.out.println(day);
    }
}
