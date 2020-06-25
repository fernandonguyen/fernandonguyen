package C0520H1.Collection;

import com.company.Student;

import java.util.*;

public class FirstCollection {
    public static void main(String[] args) {
//        Collection<String> strings = new ArrayList<>();
//        strings.add("New York");
//        strings.add("Atalanta");
//        strings.add("Ha Noi");
//
//        Iterator<String> iterator = strings.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        LinkedList<Student> linkedList = new LinkedList<>();
        linkedList.add(new Student("Vinh", 10, "TN"));
        linkedList.add(new Student("Minh", 20, "BN"));
        linkedList.add(new Student("Hai", 10, "LAO"));
        Iterator<Student> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
        linkedList.removeFirst();
        Iterator<Student> iterator2 = linkedList.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator.next().getName());
        }

    }
}
