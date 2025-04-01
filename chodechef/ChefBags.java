 //https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CREDCOINS
import java.util.Scanner;

public class ChefBags {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();
        int[] results = new int[T];

        // Process each test case
        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            // Calculate total CRED coins earned
            int totalCoins = X * Y;

            // Calculate the maximum number of bags
            int maxBags = totalCoins / 100;

            // Store the result
            results[i] = maxBags;
        }

        // Print the results for all test cases
        for (int result: results) {
            System.out.println(result);
        }

        // Close the scanner
        scanner.close();
    }
    
}
