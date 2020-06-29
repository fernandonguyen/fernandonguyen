package IO;

import java.io.*;

public class WriterFileDemo {
    public static void main(String[] args) {
        BufferedWriter bufferedWriter = null;
        String content = "Test lop Hai";
        FileWriter fileWriter = null;
        File file = new File("/Users/kiennt50/IdeaProjects/TestApp/resource/test.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.write(content);
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if ( bufferedWriter != null || fileWriter != null) {
                try {
                    fileWriter.close();
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
