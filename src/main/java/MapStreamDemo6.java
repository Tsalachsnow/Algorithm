import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//combination of map and filter in streams
class Employee{
    int empid;
    String empname;
    int salary;

    public Employee(int empid, String empname, int salary) {
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }
}

public class MapStreamDemo6 {
    public static void main(String[] args) {
        List<Integer>salary = new ArrayList<>();
        List<Employee> employeeList = Arrays.asList(
                new Employee(101, "Alex", 10000),
                new Employee(102, "Brian", 20000),
                new Employee(103, "Charles", 30000),
                new Employee(104, "David", 40000),
                new Employee(105, "Edward", 50000));

        salary = employeeList.stream().filter(n->n.salary>20000).map(n->n.salary).collect(Collectors.toList());
        System.out.println(salary);

        System.out.println("OR");

        employeeList.stream().filter(n->n.salary>20000).map(n->n.salary).forEach(n->System.out.println(n));

        System.out.println("OR");

        employeeList.stream().filter(n->n.salary>20000).map(n->n.salary).forEach(System.out::println);
    }

}
