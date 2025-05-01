// don't place package name. 

import java.io.*;

import java.util.*; 

// don't change 'Main' class name and  'public' accessor. 

public class Main {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in); 

        int N = scanner.nextInt();
        String target = scanner.next();
        
        scanner.nextLine();
        
        String[] names = scanner.nextLine().split(" ");
        
        for(int i=0;i<N;i++) {
            if(names[i].equals(target)) {
                System.out.println(i+1);
                break;
            }
        }
    }
}
