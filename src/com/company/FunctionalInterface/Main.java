package com.company.FunctionalInterface;

public class Main {
    public static void main(String[] args) {
        new Thread(()->{
            System.out.println("New Thread");
        }).start();
    }
}
