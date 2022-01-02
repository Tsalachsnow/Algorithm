import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapStreamDemo7 {

    // flatMap is a way of processing data from a collection.
    // it takes in an argument and returns a stream of objects unlike map that that takes in an argument and returns a single object.

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        List<Integer> list2 = list1.stream().map(n->n+10).collect(Collectors.toList());
        System.out.println(list2);

        System.out.println("OR");

        list1.stream().map(n->n+10).forEach(System.out::println);

        System.out.println("//FLATMAP");

        //flat map
        List<Integer> lst1 = Arrays.asList(1,2,3);
        List<Integer> lst2 = Arrays.asList(4,5,6);
        List<Integer> lst3 = Arrays.asList(7,8,9);

        List<List<Integer>> finalList = Arrays.asList(lst1,lst2,lst3);

       List<Integer> result = finalList.stream().flatMap(x->x.stream()).map(n->n+10).collect(Collectors.toList());
       System.out.println(result);

       System.out.println("OR");

        List<Integer> result1 = finalList.stream().flatMap(Collection::stream).map(n->n+10).collect(Collectors.toList());
        System.out.println(result1);

        System.out.println("OR");

        finalList.stream().flatMap(Collection::stream).map(n->n+10).forEach(x->System.out.println(x));

        System.out.println("OR");

        finalList.stream().flatMap(Collection::stream).map(n->n+10).forEach(System.out::println);
    }
}
