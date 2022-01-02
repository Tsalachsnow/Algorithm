import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;


//converting to uppercase using the map method of stream
public class MapStreamDemo3 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        List<String> upperCaseVehicles = new ArrayList<>();
        for(String name: vehicles){
            upperCaseVehicles.add(name.toUpperCase());
        }
       System.out.println(upperCaseVehicles);

        System.out.println("OR");

        upperCaseVehicles= vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCaseVehicles);

        System.out.println("OR");

        upperCaseVehicles= vehicles.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCaseVehicles);

        System.out.println("OR");

        vehicles.stream().map(name->name.toUpperCase()).forEach(name->System.out.println(name));

        System.out.println("OR");

        vehicles.stream().map(String::toUpperCase).forEach(System.out::println);
    }

}
