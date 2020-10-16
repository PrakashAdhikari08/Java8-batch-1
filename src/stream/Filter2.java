package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter2 {
    public static void main(String[] args) {
        List<Integer> list =  new ArrayList<>();
        list = Arrays.asList(1,34,45,2,5);

        list.stream().filter(number -> number%2 == 0).forEach(System.out::println);

        List<Integer> list1 = list.stream().filter(num -> num%5 == 0).collect(Collectors.toList());

        System.out.println(list1);

    }

}
