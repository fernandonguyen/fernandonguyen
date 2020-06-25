package C0520H1.Collection.Mystack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericQueue<E> {
    List<E> elements;
    GenericQueue(){
        elements = new ArrayList<>();
    }

    public void enQueue(E e){
        elements.add(e);
    }

    public E deQueue(){
        return elements.remove(0);
    }

    public int getSize(){
        return elements.size();
    }

    public boolean isEmpty(){
        return elements.size() == 0;
    }
}
