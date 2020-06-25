package C0520H1.Interface;

import C0520H1.Student;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Student student = new Student("VINH", 30);
        Student student1 = new Student("Minh", 20);
        Student student2 = new Student("Linh", 10);
        Student[] studentList = new Student[3];
        studentList[0] = student;
        studentList[1] = student1;
        studentList[2] = student2;

        System.out.println("Pre-sorted:");
        for (Student circle : studentList) {
            System.out.println(circle.getName());
        }

        Comparator comparator = new CircleComparator();
        Arrays.sort(studentList, comparator);

        System.out.println("After-sorted:");
        for (Student circle : studentList) {
            System.out.println(circle.getName());
        }

    }
}
