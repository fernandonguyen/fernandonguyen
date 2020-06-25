package C0520H1.Interface;

import C0520H1.Student;

import java.util.Comparator;

public class CircleComparator implements Comparator<Student> {

    @Override
    public int compare(Student c1, Student c2) {
        if (c1.getAge() > c2.getAge()) return 1;
        else if (c1.getAge() < c2.getAge()) return -1;
        else return 0;
    }
}
