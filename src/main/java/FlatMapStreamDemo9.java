import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    String sname;
    int sid;
    char grade;

    public Student(String sname, int sid, char grade) {
        this.sname = sname;
        this.sid = sid;
        this.grade = grade;
    }
}
public class FlatMapStreamDemo9 {
    public static void main(String[] args) {
        List<Student> studentList1 = Arrays.asList(
                new Student("Smith", 101, 'A'),
                new Student("John", 102, 'B'),
                new Student("Kenedy", 103, 'C'));

        List<Student> studentList2 = Arrays.asList(
                new Student("Scott", 104, 'A'),
                new Student("Mary", 105, 'B'),
                new Student("Kitty", 106, 'C'));
        List<List<Student>> totalStudentList = Arrays.asList(studentList1, studentList2);

        //without using string concepts get the name of each student from the lists

        for(List<Student> s: totalStudentList){
            for(Student st: s){
                System.out.println(st.sname);
            }
        }

        System.out.println("OR");

        //using flatmap concepts

        totalStudentList.stream().flatMap(x->x.stream()).map(n->n.sname).forEach(System.out::println);

        System.out.println("OR");

        List<String> namesList = totalStudentList.stream().flatMap(x->x.stream()).map(n->n.sname).collect(Collectors.toList());
        System.out.println(namesList);
    }

}
