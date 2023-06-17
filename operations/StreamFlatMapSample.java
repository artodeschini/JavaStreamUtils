package operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapSample {

    public static void main(String[] args) {
        List<List<Integer>> numberLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        // flatMap nao é para transformar elemento é parq uma operacao intermediaria
        // exemplo juntando todas as listas em uma só
        List<Integer> numbers = numberLists.stream()
                .flatMap(List::stream) // converte a lista da posicao em stream
                .collect(Collectors.toList());

        numbers.forEach(System.out::println);
    }
}
