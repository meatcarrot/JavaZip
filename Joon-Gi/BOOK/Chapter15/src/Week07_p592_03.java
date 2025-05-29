import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Week07_p592_03 {
    public static void main(String[] args) throws IOException {
        String s = "지금까지 자바 정말 재미있게 공부했어요^^";
        FileOutputStream fos = new FileOutputStream("Chapter15/src/a.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        try (osw) {
            int i;
            for (i = 0; i < s.length(); i++) {
                osw.write(s.charAt(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
