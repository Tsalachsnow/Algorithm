import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctStreamDemo10 {

    //stream methods :  non-terminal operations    terminal operations
//                         filter(),                 collect(),
//                         map(),                    count(),
//                         flatmap(),                max(),
//                         distinct(),               max(),
//                         limit()                   forEach(),
//                                                   toArray()
    public static void main(String[] args) {
        List<String>vehicleList = Arrays.asList("bus", "car", "bicycle", "bus", "car", "car", "bike");
        List<String> distinctList = vehicleList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);

        System.out.println("OR");

       vehicleList.stream().distinct().forEach(System.out::println);

       //using count

        long count = vehicleList.stream().distinct().count();
        System.out.println(count);

        //limit()

        List<String> limitList = vehicleList.stream().limit(3).collect(Collectors.toList());
        System.out.println(limitList);

        System.out.println("OR");

        vehicleList.stream().limit(3).forEach(System.out::println);
    }
}
