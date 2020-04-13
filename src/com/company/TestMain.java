package com.company;


import com.oracle.javafx.jmx.json.JSONReader;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class TestMain {

    private static int a = 1;

    public static void increment(int a){
        a++;
    }

    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static void main(String[] args) {
        int a= 3;
        int b = a << 1;
        System.out.println(b);
    }
}

