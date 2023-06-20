package terminal;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSumAvgSample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 6, 7, 8);

        // sum all elements
        Integer sum = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);

        // average
        Double avg = numbers.stream().collect(Collectors.averagingInt(Integer::intValue));
        System.out.println(avg);
    }
}
