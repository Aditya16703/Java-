public class NumberOfSetBits {
    // given a number n , find the number of set bits in it 
    //    n = 9  
    //    n == 1001   Ans =2 
    //    while( n > 0) 
    //    if(n&1 ==1 )
    //     c++
    //     n>>1
    

    //  by using  n & (n-1)   number of set bits = number of iterations

    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));// represent the number in binary
        System.out.println(setBits(n));
    }

    private static int setBits(int n){
        int count = 0;
      // method 1
        while(n > 0){
            count++ ;
             n -=(n&-n);

        }
       // method 2
        while(n > 0){
            count++ ;
             n = n & (n-1);

        }
        return count;
    }
}
