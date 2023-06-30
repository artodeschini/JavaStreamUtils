package terminal;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJoiningSample {

    public static void main(String[] args) {
        Stream<String> words = Stream.of("Java", "is", "awesome");

        String stringJoin = words.collect(Collectors.joining(","));

        System.out.println(stringJoin);
    }
}
