import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcatdemo17 {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("Dog", "Cat", "Elephant");
        List<String> birds =Arrays.asList("Peacock", "Parrot", "Crow");

        Stream<String> stream1 = animals.stream();
        Stream<String> stream2 = birds.stream();

        List<String> finalList = Stream.concat(stream1, stream2).collect(Collectors.toList());
        System.out.println(finalList);


        System.out.println();
        System.out.println("==============");
        System.out.println();

        List<String> finalList1 = Stream.concat(animals.stream(), birds.stream()).collect(Collectors.toList());
        System.out.println(finalList1);

        System.out.println();
        System.out.println("==============");
        System.out.println();

        Stream.concat(animals.stream(), birds.stream()).forEach(System.out::println);
    }

}
