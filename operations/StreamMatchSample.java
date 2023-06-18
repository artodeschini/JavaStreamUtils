package operations;

import java.util.Arrays;
import java.util.List;

public class StreamMatchSample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // check if all numbers are even
        boolean allEven = numbers.stream().allMatch(n -> n % 2 == 0);
        System.out.println(allEven);

        // check if exsit any even value
        boolean existAnyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(existAnyEven);

        // check if non of then is match if is numer is negative
        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);
        System.out.println(noneNegative);

    }
}
