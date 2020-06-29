package Exception;

import com.company.Student;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExceptionMain {

    public static int toInteger(String text) {
        try {
            System.out.println("Begin parse text: " + text);
            // Tại đây có thể gây ra ngoại lệ NumberFormatException.
            int value = Integer.parseInt(text);
            return value;
        } catch (NumberFormatException e) {
            // Trong trường hợp 'text' không phải là một số.
            // Khối catch này sẽ được thực thi.
            System.out.println("Number format exception " + e.getMessage());
            // Khi NumberFormatException xẩy ra, trả về 0.
            return 0;
        } finally {
            System.out.println("End parse text: " + text);
        }
    }

    public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException {
//      int a = 12/2;
//      try{
//          int b = 12/0;
//          System.out.println(b);
//      } catch (ArithmeticException e){
//          System.out.println("Sai roi");
//      }
//      System.out.println(a);
//        try{
//            int[] a = new int[5];
//            a[5] = 30/0;
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("1");
//        }catch (ArithmeticException e){
//            System.out.println("2");
//        } finally {
//            System.out.println("loi roi");
//        }

//        AgeUtils.checkAge(16);

//        int[] a = new int[5];
//           a[5] = 30/0;
//        linkedList.add();
//        linkedList.add();

    }
}
