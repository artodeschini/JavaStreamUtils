package operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapSample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> squareNumbers = numbers.stream().map(n -> n * n).collect(Collectors.toList());

        System.out.println("show square numbers");
        squareNumbers.forEach(System.out::println);

        List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Orange");
        List<Integer> fruitsLength = fruits.stream().map(String::length).collect(Collectors.toList());

        System.out.println("show length of fruits");
        fruitsLength.forEach(System.out::println);
    }
}
