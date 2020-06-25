package C0520H1.Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LinkedListTest {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedListTest linkedList = new LinkedListTest();
        linkedList.head = new Node(1);
        Node node2 = new Node(2);
        linkedList.head.next = node2;
        Node node3 = new Node(3);
        node2.next = node3;

        Node test = linkedList.head;
        System.out.println("test.next.data = " + test.next.data);

    }
}
