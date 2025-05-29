package textbook.Week07;

interface PrintString {
    void showString(String str);
}

public class Week07_p489_LambdaTest {
    public static void main(String[] args) {
        PrintString lambdaStr = s -> System.out.println(s);
        lambdaStr.showString("Hello lamda_1");

        test.showMyString(lambdaStr);

        PrintString reStr = returnString();
        reStr.showString("Hello ");
    }

    public static PrintString returnString() {
        return s -> System.out.println(s + "World");
    }
}

class test {
    static void showMyString(PrintString p) {
        p.showString("Hello Lamda_2");
    }
}