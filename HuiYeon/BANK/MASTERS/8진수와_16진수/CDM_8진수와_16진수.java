import java.io.*;
import java.util.*; 

public class Main {
    public static void main(String[] args) throws IOException { 
        Scanner scanner = new Scanner(System.in); 
        
        int a = scanner.nextInt(); 
        
        String octal = Integer.toOctalString(a);
        String hex = Integer.toHexString(a).toUpperCase();

        System.out.println(octal + " " + hex);
    }
}
/*
import java.io.*;
import java.util.*; 

public class Main {
    public static void main(String[] args) throws IOException { 
        Scanner scanner = new Scanner(System.in); 
        
        int a = scanner.nextInt(); 
        
        String num1 = "";
        String num2 = "";
        
        int b = a;
        
        if (a == 0) {
            num1 = "0";
        } else {
            while (a > 0) {
                num1 = (a % 8) + num1;
                a = a / 8;
            }
        }
        
        String[] cake = {"A", "B", "C", "D", "E", "F"};
        if (b == 0) {
            num2 = "0";
        } else {
            while (b > 0) {
                if ((b % 16) > 9){
                    num2 = cake[(b % 16)-10] + num2;
                }
                else {
                num2 = (b % 16) + num2;
                }
                b = b / 16;
            }
        }
        
    
        System.out.println(num1 + " " + num2);
    }
} */