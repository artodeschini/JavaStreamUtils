package operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinctCountSortSample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 6, 10, 100, 87, 2);// elementos duplicados e nao ordenados

        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println("remove duplicates values");
        distinctNumbers.forEach(System.out::println);

        System.out.println("cout of elements");
        long count = distinctNumbers.stream().count(); // note count is long
        System.out.println(count);


        List<Integer> numbersInOrder = numbers.stream().distinct().sorted().collect(Collectors.toList());

        System.out.println("order elements natural sorted"); // for custon object implements equals, hashCode
        numbersInOrder.forEach(System.out::println);
    }
}
