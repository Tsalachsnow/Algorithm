import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo11 {
    //how many even numbers in a given collection

    public static void main(String[] args) {
         List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
         numberList.stream().filter(n->n%2==0).forEach(System.out::println);

        System.out.println();
        System.out.println("OR");
        System.out.println();

         System.out.println("//COUNT");

        long count = numberList.stream().filter(n->n%2==0).count();
        System.out.println(count);

        System.out.println();
        System.out.println("OR");
        System.out.println();

        //min
        Optional<Integer> min =numberList.stream().min((n1,n2) ->{
           return n1.compareTo(n2);
       });
        System.out.println(min.get());

       System.out.println();
        System.out.println("OR");
        System.out.println();
         System.out.println("//MIN");
        Optional<Integer> min1 = numberList.stream().min(Comparator.naturalOrder());
        System.out.println(min1.get());

        System.out.println();
        System.out.println("OR");
        System.out.println();

        Optional<Integer> min3 = numberList.stream().max((n1,n2)->{
            return n1.compareTo(n2);
        });
        System.out.println(min3.get());
    }

}
