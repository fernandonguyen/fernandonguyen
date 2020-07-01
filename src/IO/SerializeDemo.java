package IO;

import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
//
        FileOutputStream fileOut = new FileOutputStream("/Users/kiennt50/IdeaProjects/TestApp/resource/employee.ser");
        BufferedOutputStream outputStream = new BufferedOutputStream(fileOut);

        ObjectOutputStream out = new ObjectOutputStream(fileOut);
    //    out.writeUTF(e);
        out.writeObject(e);
        out.close();
        fileOut.close();
////
//        Employee e = null;
//        FileInputStream fis = new FileInputStream("/Users/kiennt50/IdeaProjects/TestApp/resource/employee.ser");
//        ObjectInputStream in = new ObjectInputStream(fis);
//        e = (Employee) in.readObject();
//        in.close();
//        fis.close();
//
//        System.out.println("Name: " + e.name);
//        System.out.println("Address: " + e.address);
//
//        Employee e = new Employee();
//        e.name = "Vinh";
//        e.address = "HN";

     //  File file = new File("/Users/kiennt50/IdeaProjects/TestApp/resource/customer2.txt");
//        FileOutputStream fos = new FileOutputStream(file);
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeObject(e);
//        oos.close();
//        fos.close();
//
//        FileInputStream fis = new FileInputStream(file);
//        BufferedInputStream bff = new BufferedInputStream(fis);
//        ObjectInputStream ois = new ObjectInputStream(bff);
//        Student employee = (Student) ois.readObject();
//        System.out.println(employee.name);
//        System.out.println(employee.address);
    }
}
