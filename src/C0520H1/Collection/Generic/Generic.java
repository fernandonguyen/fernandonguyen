package C0520H1.Collection.Generic;

import java.util.ArrayList;

public class Generic {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);

        int total = 0;
        for(int i = 0; i < numbers.size(); i++){
            total += (int) numbers.get(i);
        }
        System.out.println(total);
    }
}
