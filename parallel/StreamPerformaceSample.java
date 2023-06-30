package parallel;

import java.util.ArrayList;
import java.util.List;

public class StreamPerformaceSample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            numbers.add(i);
        }

        long start = System.nanoTime();

         numbers.stream()
                 .mapToLong(StreamPerformaceSample :: performCalculation)
                 .sum();

         long end = System.nanoTime();

         long executeTime = end - start;

        System.out.println("Seq Stream execute time in " + executeTime);

        start = System.nanoTime();

        numbers.stream()
                .parallel()
                .mapToLong(StreamPerformaceSample :: performCalculation)
                .sum();

        end = System.nanoTime();

        executeTime = end - start;
        System.out.println("Par Stream execute time in " + executeTime);
    }

    private static long performCalculation(Integer n) {
        long fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
