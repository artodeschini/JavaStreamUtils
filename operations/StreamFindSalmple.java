package operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class StreamFindSalmple {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // find any is terminal operation
        Optional<Integer> any = numbers.stream().filter(n -> n % 2 == 0).findAny();

        if (any.isPresent()) {
            System.out.println(any.get());
        } else {
            System.out.println("no even number found");
        }

        Optional<Integer> firstOddNumber = numbers.stream().filter(n -> n % 2 != 0).findFirst();

        if (firstOddNumber.isPresent()) {
            System.out.println(firstOddNumber.get());
        } else {
            System.out.println("not found any odd number");
        }
    }
}
