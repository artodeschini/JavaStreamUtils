package others;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamFilterNotIn {

    public static void main(String[] args) {
        // nao enviar esse campos na saida
        var in = Arrays.asList("a", "b", "c");

        var leters = new ArrayList<String>();

        for (char c = 'a'; c <= 'z' ; c++) {
            leters.add(String.valueOf(c));
        }
        // removo o itens a, b, c
        leters.stream().filter(l -> !in.contains(l)).forEach(System.out::println);
    }
}
