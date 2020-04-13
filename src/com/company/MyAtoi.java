package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyAtoi {

    public static int myAtoi(String str){
        char[] strs = str.trim().toCharArray();
        char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
        int result = 0;
        long tempt= 0;
        int i  = 0;
        int multi = 1;
        if(strs.length == 0){
            return 0;
        }
        if(strs[0] == '-'){
            multi = -1;
            i++;
        }else if(strs[0] == '+'){
            multi = 1;
            i++;
        }
        while (i < strs.length){
            if(Arrays.binarySearch(numbers,strs[i]) >= 0){
                tempt = tempt * 10 + Integer.parseInt(""+strs[i]);
                i++;
                if(tempt*multi > Integer.MAX_VALUE || tempt*multi < Integer.MIN_VALUE){
                    if(multi > 0){
                        result = Integer.MAX_VALUE;
                        break;
                    }else{
                        result = Integer.MIN_VALUE * -1;
                        break;
                    }
                }else {
                    result = (int)tempt;
                }

            }else{
                break;
            }
        }
        return result*multi;

    }

    public static void main(String[] args) {
       int a = myAtoi("18446744073709551617");
        System.out.println("a = " + a);

    }
}
