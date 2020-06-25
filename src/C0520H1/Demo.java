package C0520H1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {

//    public static int max(int a, int b){
//        int max = a;
//        if(max < b){
//            max = b;
//        }
//        return max;
//    }


//    public static void swap(Student a, Student b){
//        Student t = new Student();
//        t.name = a.name;
//        a.name = b.name;
//        b.name = t.name;
//    }

    public static void main(String[] args) {

        String str1 = "vinh";
        String str2 = str1;
        String str3 = "vinh";

        String str4 = new String("vinh");
      String str6 =  str4 + "nGUYEN";
        String str5 = new String("vinh");

        if(str5 == str4){
            System.out.println("1");
        }else{
            System.out.println("2");
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Vinh");
        stringBuilder.append("Nguyen");
        stringBuilder.toString();
      //  StringBuffer;

//        OuterClass.InnerClass test1 = new OuterClass().new InnerClass();
//
//        OuterClass  ob = new OuterClass();
//        OuterClass.InnerClass ib = ob.new InnerClass();
//
//        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();

//        Student student = new Student("Vinh", 20);
//        Student student1 = new Student("Nghia", 40);
//     //   student1.getClassName();
//      //  String className = Student.className;
//        Student.className = "CO5";
//        student1.getClassName();
//        Student student2 = new Student("Thinh", 50);
//        student2.getClassName();
////        int a = Student.count;
////        System.out.println(a);
//        Student.getCount();

      //  student1 = null;
        //student1.name = "Minh";
//       Student temp = student;
//       student = student1;
//       student1 = temp;
       // swap(student,student1);

//       student.getName();
//       student1.getName();

//        OuterClass outerClass = new OuterClass();
//        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
//        innerClass.y = 100;
//        innerClass.getY();
//
//        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
//        staticInnerClass.z = 200;
//        staticInnerClass.getZ();

//        Student s1 = new Student("Vinh",10);
//        System.out.println(s1.name);
//        Student s2 = new Student("Minh",30);
//
//        s1.getAge();
//        s2.getAge();
//        s1.getCount();
//        s2.getCount();
//        s1.changeCollege("Codegym");
//        s1.getCollege();
//        s2.getCollege();

       // int max = max(4,5);
       // System.out.println(max(4,5));

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        System.out.println("In so vưa nhap:" + a);

        //      int max = Integer.MAX_VALUE;
//      int min = Integer.MIN_VALUE;

//      System.out.println("max = " + max);
//
//      List<String> list = new ArrayList<>();
//      list.add("VINH");
//      list.add("MINH");
//      list.add("HUNG");
////
////      for(int i = 0; i < list.size(); i++){
////         // System.out.printf(list.get(i));
////          //System.out.println("\n");
////      }
////
////      for(String ten : list){
////          System.out.printf(ten);
////      }
//
//      int[] danhsach = {1,2,3,4,5,6,8};
//      int danhsach1[] = {1,3,4,5,5,7};
//
////      for(int i: danhsach1){
////          System.out.println(i);
////      }
//      int i = 0;
////      while( i < danhsach.length){
////          System.out.println(danhsach[i]);
////          i++;
////      }
//
//      do{
//          System.out.println(danhsach[i]);
//          i++;
//      }while (i< danhsach.length);
//
//    }

//        int[] arr = new int[3];
////        arr[0] = 1;
////        arr[1] = 2;
////        arr[2] = 3;
////        arr[3] = 4;
//        for (int i : arr){
//            System.out.println(i);
//        }

//        Student student = new VietNam("Vinh",10,"HN");
//      //  student.getHello();
//        //student.getName();
//        Student student2 = new Japan("Vinh", 20, "JAPAN");
////     //   student2.getHello();
//        Student student = new Student("Nghia",30);
//
       //VietNam v = (VietNam) student2;
       //v.getVNName();
//
//        List<Student> list = new ArrayList<>();
//        list.add(new Student("NAM", 10));
//        list.add(new Student("Tung", 30));
//        Student st1 = list.get(0);
//        if(st1 instanceof VietNam){
//            ((VietNam) st1).getVNName();
//        }else{
//
//        }
//
//
//
//
//        if(student instanceof Japan){
//            System.out.println("Đúng");
//        }else{
//            System.out.println("Sai");
//        }
//
//       Student st = new Student("KIEN", 20);
//       VietNam v1 = (VietNam) st;
//        System.out.println(v1.getName());

//        VietNam v1 = new VietNam("miNH",20,"hn");
//        System.out.println(v1.getName());
    }
}
