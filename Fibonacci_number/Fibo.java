import java.util.*;
public class Fibo{

    public static void main (String[] args){
        // for(int i=0 ; i<11;i++){
        //     System.out.println(fiboFormula1(i));
        //   }
            System.out.println(fiboFormula1(50));

    
    }

    static int fiboFormula1(int n){
        return(int)((Math.pow(((1 + Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }

    static int fiboFormula2(int n){
        return(int)(Math.pow(((1 + Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
}