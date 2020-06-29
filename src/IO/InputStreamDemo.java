package IO;

import java.io.*;

public class InputStreamDemo {
    public static void main(String[] args) {
        File file = new File("/Users/kiennt50/IdeaProjects/TestApp/resource/test.txt");
        BufferedInputStream bis = null;
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
//            while (bis.available() > 0){
//                System.out.println(bis.read());
//            }
            StringBuilder stringBuilder = new StringBuilder("");
            while (bis.available() > 0) {
               stringBuilder.append((char)bis.read());
            }
            System.out.println(stringBuilder.toString());
        } catch (FileNotFoundException e) {
            e.fillInStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bis != null && fis!=null)
                {
                    fis.close();
                    bis.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in InputStream close(): " + ioe);
            }
        }
    }
}
