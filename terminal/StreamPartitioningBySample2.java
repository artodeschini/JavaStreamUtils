package terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitioningBySample2 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("banana", "apple", "cherry", "date");

        Map<Boolean, List<String>> shortLenghtFruits = fruits.stream()
                .collect(Collectors.partitioningBy(f -> f.length() <= 5));

        System.out.println(shortLenghtFruits.get(true));
        System.out.println(shortLenghtFruits.get(false));
    }
}
