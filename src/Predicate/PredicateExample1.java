package Predicate;

import java.util.function.Predicate;

public class PredicateExample1 {

    public static void main(String[] args){
        Predicate<String> predicateString = s -> {
          return s.equals("test");
        };
        System.out.println(predicateString.test("test"));
    }
}
