import java.util.HashSet;
import java.util.Set;

public class MatchStreamDemo15 {

    //amyMatch(),
    //allMatch(),
    //nonMatch()


    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("One apple");
        fruits.add("One mango");
        fruits.add("Two apples");
        fruits.add("More grapes");
        fruits.add("Two guavas");

        boolean result = fruits.stream().anyMatch(value->{
            return value.startsWith("One");
        });
        System.out.println(result);
        System.out.println();

        System.out.println("==============");

        System.out.println();

        boolean result1 = fruits.stream().anyMatch(value-> value.startsWith("One"));
        System.out.println(result1);

        System.out.println();
        System.out.println("==============");
        System.out.println();

        boolean result2 = fruits.stream().allMatch(value-> value.startsWith("One"));
        System.out.println(result2);

        System.out.println();
        System.out.println("==============");
        System.out.println();


        boolean result3 = fruits.stream().noneMatch(value->{
            return value.startsWith("One");
        });
        System.out.println(result3);
    }
}
