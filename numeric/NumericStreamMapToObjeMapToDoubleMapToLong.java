package numeric;

import java.util.stream.IntStream;

public class NumericStreamMapToObjeMapToDoubleMapToLong {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        System.out.println("sample with mapToObj");
        IntStream.of(numbers)
                .mapToObj(n -> " " + n)
                .forEach(System.out::println);

        System.out.println("sample with mapToDoble");
        IntStream.of(numbers)
                .mapToDouble(n -> Math.sqrt(n))
                .forEach(System.out::println);

        System.out.println("sample with maptoLong");
        IntStream.of(numbers)
                .mapToLong(n -> n * n)
                .forEach(System.out::println);
    }
}
