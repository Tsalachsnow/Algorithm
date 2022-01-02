import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student1{
    String name;
    int score;

    public Student1(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

// difference between sequential stream and parallel stream methods
public class ParallelStreamDemo18 {
    public static void main(String[] args) {

        // using the normal sequential stream method
        List<Student1> studentList = Arrays.asList(
                new Student1("David", 82),
                new Student1("Bob", 90),
                new Student1("John", 65),
                new Student1("kennedy", 55),
                new Student1("Eric", 85),
                new Student1("Smith", 88),
                new Student1("Scott", 50));

        studentList.stream().filter(s->s.getScore()>80)
                .limit(3).forEach(n->System.out.println(n.getName()+" "+n.getScore()));

        //parallel stream

        System.out.println();
        System.out.println("==============");
        System.out.println();

        studentList.parallelStream().filter(s->s.getScore()>80)
                .limit(3).forEach(n->System.out.println(n.getName()+" "+n.getScore()));

        System.out.println();
        System.out.println("==============");
        System.out.println();

        //converting sequential stream to parallel stream

        studentList.stream().parallel().filter(s->s.getScore()>80)
                .limit(3).forEach(n->System.out.println(n.getName()+" "+n.getScore()));

    }
}
