package parallel;

import java.util.Arrays;

public class BuildParallelStreamPipeLine {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};

        Arrays.stream(array)
                .parallel()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
}
