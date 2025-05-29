package stream.decorator;

import java.io.*;

public class BuffuredStreamTest {
    public static void main(String[] args) {
        long milisecond = 0;
        try (FileInputStream fis = new FileInputStream("Chapter15/src/stream/decorator/a.rar");
             FileOutputStream fos = new FileOutputStream("Chapter15/src/stream/decorator/copy.rar");
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            milisecond = System.currentTimeMillis();
            int i;
            while ((i = bis.read()) != -1) {
                bos.write(i);
            }
            milisecond = System.currentTimeMillis() - milisecond;
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("BuffuredStream으로 복사하는데 걸린 시간: " + milisecond + "miliseconds");
    }
}
