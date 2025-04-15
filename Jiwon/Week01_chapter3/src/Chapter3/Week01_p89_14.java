package Chapter3;

public class chapter3_14 {
    public static void main(String[] args){
        int num = 5;
        System.out.println("원래 값 : "+ num);
        System.out.println("비트를 반대로 뒤집은 값 : " + ~num);
        System.out.println("이진수로 표현한 원래 값 : " + Integer.toBinaryString(num));
        System.out.println("이진수로 표현한 원래 값 : " + Integer.toBinaryString(~num));
    }
}
