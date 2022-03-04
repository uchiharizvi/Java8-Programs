package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SampleProgram01 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,"ABC", 25000));
        employees.add(new Employee(2,"DEF", 35000));
        employees.add(new Employee(3,"GHI", 10000));
        employees.add(new Employee(4,"JKL", 45000));
        employees.add(new Employee(5,"MNO", 8000));
        employees.add(new Employee(6,"PQR", 5000));
        employees.add(new Employee(7,"STU", 43000));
        employees.add(new Employee(8,"VWX", 12000));

        System.out.println(employees.stream().map(emp->emp.getName().compareTo(emp.getName())).collect(Collectors.toList()));
        List names = employees.stream().map(x->x.getName()).collect(Collectors.toList());
        System.out.println(names);
        /**Find Highest and 2nd Highest sal**/
        Optional<Employee> emp = employees.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(emp);
        //use skip to find salaries

        Optional<Employee> emp2 = employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).findFirst();
        System.out.println(emp2);
        /**Soritng**/
        List<Employee> sortedList = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .reversed()).collect(Collectors.toList());
    }
}
