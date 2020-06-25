package C0520H1.Collection.Tree;

import C0520H1.Student;

import java.util.Map;
import java.util.TreeMap;

public class TreeMain {
    public static void main(String[] args) {
//        TreeMap<Integer, Student> students = new TreeMap<>();
//        Student studentFirst = new Student("Vinh",20);
//        Student studentSecond = new Student("Minh", 30);
//        students.put(201, studentFirst);
//        students.put(202, studentSecond);
//
//        Integer id = 202;
//        if(students.containsKey(id)){
//            Map.Entry<Integer, Student> student = students.ceilingEntry(id);
//            System.out.println(student.getValue().getName());
//        }

        NewTree newTree = new NewTree();
        newTree.insertTree(3);
        newTree.insertTree(2);
        newTree.insertTree(4);
        newTree.insertTree(5);
     //   newTree.searchTree(2);
       // newTree.searchTree(2);
        newTree.printNode(newTree.root);
    }
}
