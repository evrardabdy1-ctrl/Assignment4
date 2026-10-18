package Loop_adloop;

import java.util.Scanner;

public class Level4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int N = sc.nextInt();

        long[] row = new long[N];

        for (int i = 0; i < N; i++) {
            long value =1;

            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                
                if (j<i ) {
                    value =value *(i-j) / (j+1);
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
