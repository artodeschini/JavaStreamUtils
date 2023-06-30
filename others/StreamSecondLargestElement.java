package others;

import java.util.Arrays;
import java.util.Optional;

public class StreamSecondLargestElement {
    public static void main(String[] args) {
        int[] array = {3,6,9,4,2};

        Optional<Integer> second = Arrays.stream(array)
                .boxed()
                .sorted((a, b) -> b - a)
                .skip(1) // pula 1 ou ignora a primeira ocorrencia neste caso o valor 9
                .findFirst(); // o primeiro agora será 6

        System.out.println(second.isPresent() ?
                "The second largest element is " + second.get() : "There is no second element");
    }
}
