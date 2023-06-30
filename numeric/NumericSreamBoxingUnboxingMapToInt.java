package numeric;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericSreamBoxingUnboxingMapToInt {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // list integers to IntStream
        System.out.println("sample with Boxing");
        IntStream intStream = numbers.stream().mapToInt(Integer::intValue);

        intStream.forEach(System.out::println);

        // inicializado novamente para poder processar
        // exempplo umboxing
        intStream = numbers.stream().mapToInt(Integer::intValue);
        OptionalInt max = intStream.max();
        System.out.println(max.isPresent() ? "valor como inteiro " + max.getAsInt() : "IntStrem empty");



    }
}
