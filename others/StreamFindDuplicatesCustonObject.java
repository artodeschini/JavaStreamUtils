package others;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFindDuplicatesCustonObject {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "apple", "banana");

        Map<String, Long> frequency = fruits.stream()
                .collect(Collectors.groupingBy(f -> f, Collectors.counting()));

        Map<String, Long> result = frequency.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(result);

        // just in one line
        Map<String, Long> duplicates = fruits.stream()
                .collect(Collectors.groupingBy(f -> f, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(duplicates);

    }
}
