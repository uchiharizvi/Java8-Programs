package streams.Q1;

import utility.IntGenerator;
import utility.StringGenerator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution_Q1 {
    public static void main(String[] args) {
        int i = 0;
        List<Student> students = new ArrayList<>();
        while (i < 100) {
            students.add(new Student(i + 1, StringGenerator.generateStringPlain(), IntGenerator.generateInteger()));
            i++;
        }
        System.out.println(students.toString());
        //Default Sorting based on Name or Marks or Id
        List<String> newStudents = students.stream().map(x -> x.getStudentName()).sorted().collect(Collectors.toList());
        //
        System.out.println(newStudents);
    }

}
