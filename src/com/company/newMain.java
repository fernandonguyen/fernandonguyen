package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class newMain {
    public static void main(String[] args){
        Set<Integer> test = new HashSet<>();
        test.add(1);
        test.add(4);
        test.add(3);
        test.add(2);
//        Iterator iterator = test.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        Set<Integer> test2 = new TreeSet<>();
        test2.add(1);
        test2.add(4);
        test2.add(2);
        test2.add(3);

        System.out.println(test);
        System.out.println(test2);

        List<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(10);
        array.add(2);
        Collections.sort(array);
        System.out.println(array.toString());
        array.sort((a,b)->(a-b));
        System.out.println("array.toString() = " + array.toString());

    }
}
