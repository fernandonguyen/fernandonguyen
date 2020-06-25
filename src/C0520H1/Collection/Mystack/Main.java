package C0520H1.Collection.Mystack;

import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        MyStack<String> stack = new MyStack<>();
//        stack.push("America");
//        stack.push("Canada");
//        stack.push("France");
//        System.out.println(stack.pop());

//        GenericQueue<String> queue = new
//                GenericQueue<>();
//        queue.enQueue("America");
//        queue.enQueue("Canada");
//        queue.enQueue("France");
//        while (!queue.isEmpty()){
//            System.out.println(queue.deQueue());
//        }

        Stack<String> stacks = new Stack<>();
        stacks.push("Nguyen");
        stacks.push("Van");
        stacks.push("A");
//
//        Iterator<String> stringIterator = stacks.iterator();
//        while (stringIterator.hasNext()){
//            System.out.println(stacks.);
//        }

        System.out.println(stacks.pop());
        System.out.println(stacks);

    }
}
