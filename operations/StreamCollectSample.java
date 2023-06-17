package operations;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectSample {

    public static void main(String[] args) {

        // collect isa a terminate operation as stream
        List<String> fruits = Arrays.asList("apple", "banana", "mango", "orange", "apple");

        // transform stream as List
        List<String> collectList = fruits.stream().collect(Collectors.toList());
        System.out.println("show list collect");
        collectList.forEach(System.out::println);

        Set<String> collectSet = fruits.stream().collect(Collectors.toSet());
        System.out.println("show set collect");
        collectSet.forEach(System.out::println);

        // separando por virgulas cada elemento
        String collectString = fruits.stream().collect(Collectors.joining(","));
        System.out.println("sample with joining strins");
        System.out.println(collectString);
    }
}
