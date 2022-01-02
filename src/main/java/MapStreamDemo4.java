import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamDemo4 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        List<Integer> vehiclesLength = new ArrayList<>();
        //without streams
        //find the length of the vehicles

        for(String name:vehicles){
            System.out.println(name.length());
        }

        //using stream

        System.out.println("OR");

        vehicles.stream().map(name->name.length()).forEach(name->System.out.println(name));

        System.out.println("OR");

        vehiclesLength = vehicles.stream().map(String::length).collect(Collectors.toList());
        System.out.println(vehiclesLength);
    }
}
