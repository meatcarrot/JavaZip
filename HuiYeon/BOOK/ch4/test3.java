package ch4;

public class test3 {
    public static void main(String[] args) {
        for(int i=1; i < 10; i++){
            for(int j=1; j < 10; j++){
                if(i >= j){
                    System.out.println(i + "*" + j + "=" + i*j);
                }
            }
        }
    }
}
