package Loop_adloop;

public class Level4b {
    public static void main(String[] args) {
        int [] numbers = {2, 4, 3, 5, 7, 8, 9};
        int target = 10;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("Pair found: (" + numbers[i] + ", " + numbers[j] + ")");
                }
            }
        }

    }
    
}
