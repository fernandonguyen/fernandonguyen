package C0520H1.Compare;

import java.util.Comparator;

public class CustomerCompartor<T extends Customer> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getAge() - o2.getAge();
    }
}
