package others;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        // how to have a IntStream for Randon
        IntStream ints = random.ints(10, 0 , 10);
        ints.forEach(System.out::println);

        // how to have DoubleStream for Randon
        DoubleStream doubles = random.doubles(10, 0, 10);
        doubles.forEach(System.out::println);
    }
}
