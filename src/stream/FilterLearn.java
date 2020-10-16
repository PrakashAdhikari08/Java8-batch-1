package stream;

import java.util.Arrays;
import java.util.List;

public class FilterLearn {

    public static void main(String[] args) {

        List<String> listOfName = Arrays.asList("Hari","sita","raju", "ravi");


        //write your logic for filtering inside the filter
        listOfName.stream().filter(name -> name.equals("raju")).forEach(name -> System.out.println(name));

        listOfName.stream().filter(name -> !name.equals("raju")).forEach(name -> System.out.println(name));

        //lamda function replaced with reference code
        listOfName.stream().filter(name -> listOfName.size()>2).forEach(System.out::println);



    }
}
