public class NumberOfDigit {

    // fromula for calculating no of digit in base b of number n = int(log base b of n ) + 1

    public static void main(String[] args) {
        int n = 34567;
        int b = 10;

        int ans = (int)(Math.log(n)/ Math.log(b)) + 1;

        System.out.println(ans);
    }
    
}
