import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamDemo5 {
    public static void main(String[] args) {
        List<Integer>numberList= Arrays.asList(2,3,4,5);
        List<Integer>product=new ArrayList<>();
        //without streams
        for(int n: numberList){
            System.out.println(n*3);
            product.add(n*3);
        }

        System.out.println("OR");

        //with streams
        numberList.stream().map(n->n*3).forEach(n->System.out.println(n));

        System.out.println("OR");

        numberList.stream().map(n->n*3).forEach(System.out::println);

        System.out.println("OR");

        product = numberList.stream().map(n->n*3).collect(Collectors.toList());
        System.out.println(product);


    }
}
