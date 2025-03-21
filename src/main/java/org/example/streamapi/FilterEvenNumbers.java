package org.example.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 2, 5, 7, 0, 6, 4, 8, 10);
        int sum = numbers.stream()
                .filter(x -> x%2 == 0)
                .map(x -> x*2)
                .sorted()
                .reduce(0, Integer::sum);
        System.out.println(sum);
        // 2, 4, 6, 8, 10
        // 4, 8, 12, 16,

        List<Integer> numbers2 = Arrays.asList(1, 3, 2, 5, 7, 0, 6, 4, 8, 10);
        numbers.stream()
                .filter(x -> x%2 == 0)
                .map(x -> x*2)
                .sorted()
                //.forEach(x -> System.out.print(x + " "));
                .forEach(System.out::print);

        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 3, 2, 1, 5, 6);
        List<Integer> list3 = numbers3.stream()
                .distinct()
                .toList();
        System.out.println(list3);

        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 3, 2, 1, 5, 6);
        long countNumber = numbers4.stream()
                .distinct()
                .count();
        System.out.println(countNumber);

        List<Integer> fr = new ArrayList<>();

    }
}
