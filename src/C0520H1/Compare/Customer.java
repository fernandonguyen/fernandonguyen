package C0520H1.Compare;

import java.util.Comparator;
import java.util.stream.Collector;

public class Customer implements Comparable<Customer>{

    int age;
    String name;

    public Customer(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Customer o) {
        return this.age - o.age;
    }
}
