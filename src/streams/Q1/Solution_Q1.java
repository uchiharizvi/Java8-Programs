package streams.Q1;

import utility.IntGenerator;
import utility.StringGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution_Q1 {
    public static void main(String[] args) {
        int i = 0;
        List<Student> students = new ArrayList<>();
        while (i < 5) {
            students.add(new Student(i + 1, StringGenerator.generateStringPlain(), IntGenerator.generateInteger()));
            i++;
        }
        //Default Sorting based on Name or Marks or Id
        List<String> newStudents = students.stream()
                .map(x -> x.getStudentName())
                .sorted()
                .collect(Collectors.toList());

        students.stream().
                sorted((p1,p2)
                        ->p1.getStudentName()
                        .compareTo(p2.getStudentName()))
                .forEach(System.out::println);
    }

}
