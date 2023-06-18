package operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceSample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // somar todos os elementos de um stream
        Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);

        if (sum.isPresent()) {
            System.out.println(sum.get());
        } else {
            System.out.println("no elements in stream");
        }

        // obter o maior valor
        Optional<Integer> max = numbers.stream().reduce(Integer::max);

        if (max.isPresent()) {
            System.out.println(max.get());
        } else {
            System.out.println("no elements in stream");
        }

        // obter o minimum valor
        Optional<Integer> min = numbers.stream().reduce(Integer::min);

        if (min.isPresent()) {
            System.out.println(min.get());
        } else {
            System.out.println("no elements in stream");
        }
    }
}
