package ch3;

public class test4 {
    public static void main(String[] args){
        int num = 5;
        int not = ~num;

        System.out.println("원래 값: " + num);
        System.out.println("비트를 반대로 뒤집은 값: " + not);
        System.out.println("이진수로 표현한 원래 값: " + Integer.toBinaryString(num));
        System.out.println("이진수로 표현한 뒤집은 값: " + Integer.toBinaryString(not));
    }
}
