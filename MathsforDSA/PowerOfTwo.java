public class PowerOfTwo {
    //  if n & (n-1)  ==0  then it is power of 2

    public static void main(String[] args) {
        int n = 16;//  note: fix for n = 0
        if(n == 0 ){
            boolean ans = false;
            System.out.println(ans);
        } else{
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
    }
       
    
    }
    
}
