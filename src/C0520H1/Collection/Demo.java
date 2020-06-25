package C0520H1.Collection;

import com.company.Student;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
//        List<String> stringList = new ArrayList<>();
//        stringList.add("1");
//        stringList.add("2");
//        stringList.add("3");
//
//        for(String i: stringList){
//            System.out.println(i);
//        }

//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("Vinh", 20, "vn"));
//        studentList.add(new Student("Minh", 20, "vn"));

        //Set<String> hashSet = new HashSet<String>();
//        Set<String> hashSet2 = new HashSet<>();
//        hashSet2.add("Vinh");
//        hashSet2.add("Nghia");
//        hashSet2.add("Vinh");
//        hashSet2.add("Thinh");
//        hashSet2.add("Hai");
//        hashSet2.add("Mau ");
//        hashSet2.add("Mau ");
//        hashSet2.add("");
//
//        for (String i: hashSet2){
//            System.out.println(i);
//        }

//        Map<Integer, Student> hashMap = new HashMap<>();
//        hashMap.put(1, new Student("Vinh", 20, "vn"));
//        hashMap.put(3, new Student("Minh", 30, "LAO"));
//        for (int i: hashMap.keySet()){
//            System.out.println(hashMap.get(i).getName());
//        }


//        Queue<String> queue = new ArrayDeque<>();
//        queue.add("Nguyen");
//        queue.add("Nam");
//        queue.add("Tung");
//        System.out.println(queue);
//        System.out.println(queue.remove());
//        System.out.println(queue);
//        System.out.println(queue.peek());
//        System.out.println("queue = " + queue);


//        Stack<String> stack = new Stack<>();
//        stack.add("1");
//        stack.add("2");
//        stack.add("3");

//        System.out .println(stack.pop());
//        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack);


//        for(int i = 0; i < studentList.size(); i++){
//            System.out.println(studentList.get(i).getName());
//            System.out.println(studentList.get(i).getAge());
//        }
//
//        Iterator<Student> iterator = studentList2.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next().getName());
//            System.out.println(iterator.next().getAge());
//        }

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Vinh", 40, "vn"));
        studentList.add(new Student("Minh", 20, "vn"));
        studentList.add(new Student("Tunh", 30, "vn"));
        studentList.add(new Student("lan", 20, "vn"));
//
//        Collections.sort(studentList, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

        studentList.sort(((o1, o2) -> (o2.getAge() - o1.getAge())));
//
//
        for (Student st : studentList){
            System.out.println(st.getName());
        }

//        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//        list = list.stream().map(x -> 2*x).collect(Collectors.toList());
//        System.out.println(list);
    }
}
