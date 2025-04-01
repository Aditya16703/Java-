

   // Question in pascal triangle we have to find the sum of nth row      
   // sum of each row = nC0 + nC1 + nC2 + nC3 + nC4 +.......+nCn-1 + nCn = 2 ki power n 
   // for nth row , sum = 2 ki power n-1  because in pascal triangle row start from zero  and in general calculation or question telling we start row of pascal triangle with 1
    // if we let the count of row of pascal triangle  start with zero the sum of nth row in pascal triangle = 2 ki power n 

import java.util.Scanner;

public class PascalTriangleSum {
    // Function to compute the sum of numbers in a given row of Pascal's triangle
    public static long sumOfRow(int row) {
        // 2^n is equivalent to 1 << n (left shift 1 by n positions)
        return 1L << row;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row number: ");
        int row = sc.nextInt();
        long sum = sumOfRow(row);
        System.out.println("The sum of the numbers in row " + row + " of Pascal's triangle is: " + sum);
    }
}
