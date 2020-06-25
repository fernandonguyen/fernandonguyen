package java8.Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a","b","c","b");
        strings = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(strings);

        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        nums = nums.stream().map(x -> x*2).collect(Collectors.toList());
        System.out.println(nums);
    }
}
