package textbook.Week07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Week07_p592_03 {
    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("a.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos)) {
            osw.write("지금까지 자바 정말 재미있게 공부했어요^^");
        } catch(IOException e) {
            System.out.println(e);
        }

        System.out.println("a.txt 파일에 출력되었습니다.");
    }
}
