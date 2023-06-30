package parallel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // notice parallel stream are not order to execute
        // one form
        System.out.println("sample with parallel method");
        Stream<Integer> parallel = numbers.stream().parallel();
        parallel.forEach(System.out::println);

        // there are no difference between parallel and parallelStream

        System.out.println("sample with parallelStream method");
        numbers.parallelStream().forEach(System.out::println);
    }
}
