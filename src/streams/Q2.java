package streams;

import java.util.Arrays;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);//convert arrays to list
        list.stream().sorted().forEach(System.out::println);//sort the stream and print

        List<String> list2 = Arrays.asList("Geeks", "for", "GeeksQuiz", "GeeksforGeeks", "GFG");
        list2.stream().sorted().forEach(x->System.out.print(x + ","));
        list2.stream().sorted().forEach(System.out::println);
    }
}
