package numeric;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NumericStreamRangeRangeCloseCountForEach {
    public static void main(String[] args) {
        // range
        // o primeiro é incluso o último não
        System.out.println("sample with range");
        IntStream.range(1,5)
                .forEach(System.out::println);

        // rangeClose
        // inclui o ultimo digito
        System.out.println("sample with rangeClosed");
        IntStream.rangeClosed(1,5)
                .forEach(System.out::println);

        //count
        System.out.println("sample with count");
        long count = IntStream.rangeClosed(1, 5).count();
        System.out.println(count);

        //count
        System.out.println("sample with forEach");
        IntStream.rangeClosed(1, 5)
                .forEach(n -> System.out.println(n));
    }
}
