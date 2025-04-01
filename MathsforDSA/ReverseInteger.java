public class ReverseInteger {
    public int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow before adding the digit
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) 
                return 0;
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) 
                return 0;

            reversed = reversed * 10 + digit;
        }

        return reversed;
    }

    public static void main(String[] args) {
        ReverseInteger obj = new ReverseInteger();
        
        // Test cases
        System.out.println(obj.reverse(123));    // Output: 321
        System.out.println(obj.reverse(-123));   // Output: -321
        System.out.println(obj.reverse(120));    // Output: 21
        System.out.println(obj.reverse(0));      // Output: 0
        System.out.println(obj.reverse(1534236469)); // Output: 0 (overflow case)
    }
}

// Checking for Positive Overflow
// java
// Copy
// Edit
// if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) 
//     return 0;
// Breaking it down
// Why reversed > Integer.MAX_VALUE / 10?

// Integer.MAX_VALUE = 2147483647
// Integer.MAX_VALUE / 10 = 214748364
// If reversed > 214748364, then multiplying by 10 will definitely exceed 2147483647, causing overflow.
// Why (reversed == Integer.MAX_VALUE / 10 && digit > 7)?

// If reversed == 214748364, multiplying by 10 gives 2147483640.
// Adding any digit greater than 7 (e.g., 8 or 9) will exceed 2147483647 → overflow.
// Example:
// python
// Copy
// Edit
// reversed = 214748364, digit = 8
// reversed * 10 + digit = 2147483648 (overflow!)
// 2. Checking for Negative Overflow
// java
// Copy
// Edit
// if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) 
//     return 0;
// Breaking it down
// Why reversed < Integer.MIN_VALUE / 10?

// Integer.MIN_VALUE = -2147483648
// Integer.MIN_VALUE / 10 = -214748364
// If reversed < -214748364, then multiplying by 10 will definitely go below -2147483648, causing overflow.
// Why (reversed == Integer.MIN_VALUE / 10 && digit < -8)?

// If reversed == -214748364, multiplying by 10 gives -2147483640.
// Adding any digit less than -8 (e.g., -9) will exceed -2147483648 → overflow.
// Example:
// python
// Copy
// Edit
// reversed = -214748364, digit = -9
// reversed * 10 + digit = -2147483649 (overflow!)
