package operations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateInstanceOfStream {

    public static void main(String[] args) {
        // for collections
        List<String> names = Arrays.asList("Artur", "Emanuelle", "Catia");

        // all collection has a .stream()
        Stream<String> stream1 = names.stream();
        stream1.forEach(System.out::println);

        // for array
        String[] array = { "Blue", "Red", "Green" };
        Stream<String> stream2 = Arrays.stream(array);
        stream2.forEach(System.out::println);

        // factory method of in Stream
        Stream<String> stream3 = Stream.of("Apple", "Banana", "Mango");
        stream3.forEach(System.out::println);

        // Builder method f in Stream
        Stream.Builder<String> sb = Stream.builder();
        sb.add("create");
        sb.add("new");
        sb.add("stream");

        Stream<String> stream4 = sb.build();
        stream4.forEach(System.out::println);

        // from i/o channels
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/arturtodeschini/IdeaProjects/StreamUtils/operations/myfile.dat"))) {
            Stream<String> stream5 = reader.lines();
            stream5.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
