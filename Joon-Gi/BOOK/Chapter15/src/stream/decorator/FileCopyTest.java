package stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
    public static void main(String[] args) {
        long milisecond = 0;
        try (FileInputStream fis = new FileInputStream("Chapter15/src/stream/a.rar");
             FileOutputStream fos = new FileOutputStream("Chapter15/src/stream/copy.rar")) {
            milisecond = System.currentTimeMillis();
            int i;
            while ((i = fis.read()) != -1) {
                fos.write(i);
            }
            milisecond = System.currentTimeMillis() - milisecond;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("FileInputStream으로 복사하는데 걸린 시간: " + milisecond + "miliseconds");
    }
}
