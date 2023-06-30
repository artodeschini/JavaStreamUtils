package others;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StramRemoveDuplicatesByListOrArray {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3);

        Set<Integer> set = numbers.stream()
                .collect(Collectors.toSet());

        System.out.println(set);

        List<Integer> list = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
