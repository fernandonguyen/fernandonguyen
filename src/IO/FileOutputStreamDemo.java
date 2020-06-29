package IO;

import java.io.*;

public class FileOutputStreamDemo {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        File file = new File("/Users/kiennt50/IdeaProjects/TestApp/resource/test.txt");
        String mycontent = "This is my Data which needs" +
                " to be written into the file";
        BufferedOutputStream bos = null;

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            byte[] byteContent = mycontent.getBytes();
            bos.write(byteContent);
         //   bos.flush();
            System.out.println("File Written Successfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if ( fos != null || bos != null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
