package others;

import java.util.Arrays;
import java.util.List;

public class StreamSumCalculator {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum1 = numbers.stream()
                .mapToInt(Integer::intValue).sum();

        System.out.println(sum1);

        Integer sum2 = numbers.stream().reduce(0, Integer::sum);

        System.out.println(sum2);
    }
}
