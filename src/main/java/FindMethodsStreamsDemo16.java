import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMethodsStreamsDemo16 {

    //findAny()
    //findFirst()

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("one", "two", "three", "one");
//        List<String> stringList = new ArrayList<>();
//        Optional<String> el = stringList.stream().findAny();
//        System.out.println(el.get());

        Optional<String> el1 = stringList.stream().findFirst();
        System.out.println(el1.get());
    }
}
