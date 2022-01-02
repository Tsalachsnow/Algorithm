import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceStreamDemo12 {

    //using the reduce method of stream

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("A", "B", "C", "1", "2", "3");
        Optional<String> result = stringList.stream().reduce((value, combinedValue)->{
            return combinedValue+value;
        });
        System.out.println(result.get());

        System.out.println();
        System.out.println("OR");
        System.out.println();

        Optional<String> result1 = stringList.stream().reduce((value, combinedValue)-> combinedValue+value);
        System.out.println(result1.get());

    }
}
