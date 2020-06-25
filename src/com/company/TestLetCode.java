package com.company;

import com.sun.xml.internal.fastinfoset.util.CharArray;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TestLetCode {

    static boolean isValid(String s) {
        return true;
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = s1;
        String s4 = new String("Hello");
        String s5 = new String("Hello");
        System.out.print(s1.hashCode());
        System.out.println();
        System.out.print(s2.hashCode());

        System.out.print(s1 == s1);         // true
        System.out.print(s1 == s2);         // true
        System.out.print(s1 == s3);         // true
        System.out.print(s1 == s4);         // false
        System.out.print(s4 == s5);         // false

        System.out.print(s1.equals(s3));    // true, cùng nội dung
        System.out.print(s1.equals(s4));    // true, cùng nội dung
        System.out.print(s4.equals(s5));    // true, cùng nội dung.
    }
}
