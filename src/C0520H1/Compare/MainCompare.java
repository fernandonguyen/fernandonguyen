package C0520H1.Compare;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import jdk.internal.dynalink.linker.ConversionComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainCompare {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<Customer>();
        customerList.add(new Customer(10,"Nam"));
        customerList.add(new Customer(40,"Linh"));
        customerList.add(new Customer(40,"Hai"));
        customerList.add(new Customer(20,"Tung"));

//        Collections.sort(customerList, Comparator.comparing(Customer::getAge).thenComparing(Customer::getName));
//        customerList.stream().map(x -> x.getName()).forEach(System.out::println);
//
//        Collections.sort(customerList, new Comparator<Customer>() {
//            @Override
//            public int compare(Customer o1, Customer o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        //Collections.sort(customerList);

       // customerList.sort((o1, o2) -> (o1.age - o2.age));
        //customerList.sort((o1,o2) -> (o1.name.compareTo(o2.name)));

        customerList.stream().map(x -> x.getName()).forEach(System.out::println);
    }
}
