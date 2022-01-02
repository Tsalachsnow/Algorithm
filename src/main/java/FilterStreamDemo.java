import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



//conditions
//name of the person should be greater than six and less than eight

public class FilterStreamDemo {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Melisandre", "Sansa", "Jon", "Daenerys", "Joffery");
        List<String> longNames = new ArrayList<>();
//       longNames = name.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());
//       System.out.println(longNames);

//       name.stream().filter(str->str.length()>6 && str.length()<8).forEach(str->System.out.println(str));
        name.stream().filter(str->str.length()>6 && str.length()<8).forEach(System.out::println);
    }
}
