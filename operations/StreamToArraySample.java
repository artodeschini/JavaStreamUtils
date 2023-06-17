package operations;

import java.util.Arrays;
import java.util.List;

public class StreamToArraySample {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "mango", "orange");
        String[] array = fruits.stream().toArray(String[]::new);
        Arrays.stream(array).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer[] integers = numbers.stream().toArray(Integer[]::new);
        Arrays.stream(integers).forEach(System.out::println);
    }
}
