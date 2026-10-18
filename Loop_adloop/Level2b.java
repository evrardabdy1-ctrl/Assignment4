package Loop_adloop;

import java.util.Scanner;

public class Level2b {
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        if (N < 0) {
            System.out.println("N must be non-negative.");
        } else {
            long factorial = 1;

            for (int i = 1; i <= N; i++) {
                factorial *= i;
            }
            System.out.println(N + "! = " + factorial);

        }
        sc.close();
    }
}
