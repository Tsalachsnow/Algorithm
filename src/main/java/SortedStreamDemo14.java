import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStreamDemo14 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2,4,1,3,7,5,9);
        List<Integer> sortedList = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        System.out.println();
        System.out.println("OR");
        System.out.println();

        list1.stream().sorted().forEach(System.out::println);

        System.out.println();
        System.out.println("OR");
        System.out.println();

        //using comparator.reverse order
        List<Integer> sortedList1 = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList1);

        System.out.println();
        System.out.println("OR");
        System.out.println();

        list1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println();
        System.out.println("OR");
        System.out.println("===============");

        List<String> list2 = Arrays.asList("John", "Mary", "Kim", "David", "Smith");

        List<String> sortedLst = list2.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedLst);

        System.out.println();
        System.out.println("OR");
        System.out.println("===============");

        list2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
