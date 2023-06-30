package terminal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMinMaxSample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 7, 9, 3, 2);

        // min
        Optional<Integer> min = numbers.stream().collect(Collectors.minBy(Comparator.naturalOrder()));
        // forma simplificada
        Optional<Integer> minOther = numbers.stream().min(Comparator.naturalOrder());

        if (min.isPresent()) {
            System.out.println(min.get());
        } else {
            System.out.println("numbers is empty");
        }

        // max
        Optional<Integer> max = numbers.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));
        // forma simplificada
        Optional<Integer> maxOther = numbers.stream().max(Comparator.naturalOrder());

        if (max.isPresent()) {
            System.out.println(max.get());
        } else {
            System.out.println("numbers is empty");
        }
    }
}
