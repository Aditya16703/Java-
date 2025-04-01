// time complexity 
//  n/2 + n/3 + n/4 + n/5 + n/7 + ......
// n( 1/2 + 1/3 + 1/4 + 1/5 + 1/7 + ....)
//       harmonic progression for primes 
//  on solving   log(logN)
// total time complexity O( N*log*logN )  

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        int  n = 40 ;
        boolean[] arr = new boolean[n+1];
        Sieve(n,arr);
    }

    public static void Sieve(int n , boolean[] arr){
        for(int i = 2; i*i <= n ; i++){
            if(!arr[i]){
                for(int j = i*2 ; j <= n ; j += i){
                      arr[j] = true;
                }
            }

           

        }
        
        for(int i =2 ; i<= n ; i++){

            if(!arr[i]){
                System.out.print(i + " ");
            }

        }


    }
    
}
