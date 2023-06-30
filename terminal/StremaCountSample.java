package terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StremaCountSample {

    public static void main(String[] args) {
        List<String> languagens = Arrays.asList("Java", "Python", "JavaScript");

        Long count = languagens.stream().collect(Collectors.counting());
        System.out.println(count);
    }
}
