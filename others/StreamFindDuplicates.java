package others;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFindDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 2, 3);

        Map<Integer, Long> frequency = numbers.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        System.out.println(frequency);

        List<Integer> duplicates = frequency.entrySet()
                .stream().filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        duplicates.forEach(System.out::println);
    }
}
