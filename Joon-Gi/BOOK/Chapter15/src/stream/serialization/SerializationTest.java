package stream.serialization;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) throws ClassNotFoundException{
        Person personAhn = new Person("안재용", "대표이사");
        Person personKim = new Person("김철수", "상무이사");

        try (FileOutputStream fos = new FileOutputStream("Chapter15/src/stream/serialization/serial.out");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(personAhn);
            oos.writeObject(personKim);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream fis = new FileInputStream("Chapter15/src/stream/serialization/serial.out");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person p1 = (Person)ois.readObject();
            Person p2 = (Person)ois.readObject();

            System.out.println(p1);
            System.out.println(p2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
