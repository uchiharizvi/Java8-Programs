package optional;

import Interface.ExampleInterface;

import java.util.Arrays;
import java.util.Comparator;

public class Q1 {
    public static void main(String[] args) {
        String[] arr = {"family", "illegibly", "acquired", "know", "perplexing", "do", "not", "doctors", "where", "handwriting", "I"};
        Arrays.sort(arr, (s1, s2) -> s1.length() - s2.length());
        System.out.println(Arrays.toString(arr));

    }
}
