import java.util.Arrays;
import java.util.List;

public class StreamForEachExemple {

    public static void main(String[] args) {
        // forEach is a terminal operation

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        // integers.stream().forEach(System.out::println);
        // simplificando
        System.out.println("sample with meta reference the method has no args");
        integers.forEach(System.out::println); // meta reference

        // or
        System.out.println("sample with lambda expression");
        integers.forEach(number -> System.out.println(number));

        // operation with each
        System.out.println("sample with operation with lambda expression");
        integers.forEach(number -> System.out.println(number * 2));
    }
}
