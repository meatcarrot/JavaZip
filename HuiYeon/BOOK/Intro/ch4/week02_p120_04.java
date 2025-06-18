package ch4;

public class test4 {
    public static void main(String[] args) {
        int maxN = 7;
        for (int i=1; i <= maxN + 1; i= i+2){
            System.out.println(" ".repeat((maxN - i)/2) + "*".repeat(i) + " ".repeat((maxN - i)/2));
        }
    }
}
