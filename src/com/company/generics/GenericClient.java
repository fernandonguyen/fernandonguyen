package com.company.generics;

import java.util.ArrayList;
import java.util.List;

interface NumStack<E> {// interface, tham số kiểu Element(phần tử)
    public void push(E elt);
    public E retrieve();
}

class NumberArrayStack<E> implements NumStack<E> {

    private List<E> list;

    public NumberArrayStack() {
        list = new ArrayList<E>();//
    }


    @Override
    public void push(E elt) {
        list.add(elt);
    }

    @Override
    public E retrieve() {
        E e = list.remove(list.size() - 1);
        return e;
    }

    public String toString() {
        return "stack" + list.toString();
    }
}

public class GenericClient {
    public static void main(String[] args) {
        NumStack<Integer> numStack = new NumberArrayStack<>();
        for (int ctr = 0; ctr < 4; ctr++) {
            numStack.push(ctr);
        }
        assert numStack.toString().equals("stack[0, 1, 2, 3]");// hàm assert đánh giá biểu thức đầu vào
        int top = numStack.retrieve();
        System.out.println("Value is : " + top);
        System.out.println("Stack contains : " + numStack.toString());
    }
}
