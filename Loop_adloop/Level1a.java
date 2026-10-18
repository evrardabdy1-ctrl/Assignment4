package Loop_adloop;

import java.util.Scanner;

public class Level1a {
     public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                 System.out.print("Enter N");
                 int N = sc.nextInt();

                 for (int i=1;i<=10;i++ ) {
                     System.out.print(N +"x" +i+"=" + (N*i));
                 }
            }
     }
    
}
