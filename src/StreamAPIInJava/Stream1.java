package StreamAPIInJava;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<String> names = List.of("Jay", "Dheeraj", "Amit", "Rohit", "Amit", "Dheeraj");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream()
                .filter(n -> n % 2 == 0)//This is called predicate function
                .forEach(System.out::println);

        List<String> uniqueNames = names.stream()
                .distinct().collect(Collectors.toList());

        System.out.println(uniqueNames);
    }
}
