package operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterSample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // sample get all even (pares) numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0) //note one predicate return a boolean
                .collect(Collectors.toList());

        System.out.println("all even numbers");
        evenNumbers.forEach(System.out::println);

        // sample get all odd (impares) numbers
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0) //note one predicate return a boolean
                .collect(Collectors.toList());

        System.out.println("all odd numbers");
        oddNumbers.forEach(System.out::println);

        List<Integer> numbersGreatMoreThanFive = numbers.stream()
                .filter(n -> n > 5).collect(Collectors.toList());

        System.out.println("numbers great more than five");
        numbersGreatMoreThanFive.forEach(System.out::println);

        List<Integer> numbersDivisibleByThreeAndLessThanSeven = numbers.stream()
                .filter(n -> n % 3 == 0 && n < 7).collect(Collectors.toList());
    }
}
