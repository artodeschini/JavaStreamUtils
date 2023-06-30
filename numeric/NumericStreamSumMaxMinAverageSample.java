package numeric;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamSumMaxMinAverageSample {
    public static void main(String[] args) {
        int[] array = {5,10,15,3,8,6};

        int sum = IntStream.of(array).sum();
        System.out.println("sample with sum");
        System.out.println(sum);

        System.out.println("sample with max");
        OptionalInt max = IntStream.of(array).max();

        if (max.isPresent()) {
            System.out.println("max value is " + max.getAsInt());
        } else {
            System.out.println("max  is empty");
        }

        System.out.println("sample with min");
        OptionalInt min = IntStream.of(array).min();

        if (min.isPresent()) {
            System.out.println("min value is " + min.getAsInt());
        } else {
            System.out.println("min  is empty");
        }

        System.out.println("sample with average");
        OptionalDouble average = IntStream.of(array).average();
        if (average.isPresent()) {
            System.out.println("average value is " + average.getAsDouble());
        } else {
            System.out.println("average  is empty");
        }

    }

}
