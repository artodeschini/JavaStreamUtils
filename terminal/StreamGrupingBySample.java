package terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGrupingBySample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Artur", 40),
                new Person("Catia", 40),
                new Person("Emanuelle", 8),
                new Person("Yasmin", 8),
                new Person("Daniela", 8));


        Map<Integer, List<Person>> peopleByAge
                = people.stream().collect(Collectors.groupingBy(Person::getAge));

        System.out.println(peopleByAge);
    }
}
