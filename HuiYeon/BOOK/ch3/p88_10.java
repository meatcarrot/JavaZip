package ch3;

public class test3 {
    public static void main(String[] args){
        int num = 5;
        int i = 10;

        boolean value = ((num = num * 10) > 45) || ((i = i - 5) < 10);
        System.out.println(value);
        System.out.println(num);
        System.out.println(i);
    }
}
// true 50 10
