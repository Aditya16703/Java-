//https://www.codechef.com/practice/course/logical-problems/DIFF800/problems/CHEFCAND?tab=statement

import java.util.*;
public class ChefandCandy {
    

    public class CandyDistribution {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            // Read number of test cases
            int T = scanner.nextInt();
            
            // Array to store results
            int[] results = new int[T];
            
            for (int i = 0; i < T; i++) {
                int N = scanner.nextInt(); // Number of children
                int X = scanner.nextInt(); // Number of candies Chef already has
                
                // Calculate the number of candies needed
                int shortfall = N - X;
                if (shortfall <= 0) {
                    results[i] = 0; // No packets needed
                } else {
                    // Calculate packets needed
                    results[i] = (shortfall + 3) / 4; // Equivalent to ceil(shortfall / 4)
                }
            }
            
            // Print results for each test case
            for (int result : results) {
                System.out.println(result);
            }
            
            scanner.close();
        }
    }
    

} 
    


