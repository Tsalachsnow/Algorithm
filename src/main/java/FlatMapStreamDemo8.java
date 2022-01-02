import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapStreamDemo8 {
    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("Scott", "David", "John");
        List<String> teamB = Arrays.asList("Mary", "Luna", "Tom");
        List<String> teamC = Arrays.asList("ken", "Jony", "Kitty");

        List<List<String>> players = new ArrayList<>();
        players.add(teamA);
        players.add(teamB);
        players.add(teamC);

        //without streams
        //read each player name

        for (List<String> team: players){
            for(String name: team){
                System.out.println(name);
            }
        }

        //using stream flat map concepts we have

        List<String> names = players.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(names);

        System.out.println("OR");

        players.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
