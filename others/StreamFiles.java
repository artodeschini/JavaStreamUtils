package others;

import java.io.File;
import java.util.Objects;
import java.util.stream.Stream;

public class StreamFiles {
    public static void main(String[] args) {
        Stream.of(Objects.requireNonNull(new File("./others").listFiles()))
                .filter(file -> !file.isDirectory())
                .map(File::getName)
                .forEach(System.out::println);
    }
}
