
public class Swapnum {

    public static void main (String[] args){
        int a = 12;
        int b = 45; 
        System.out.println(a+" "+b);
        swap (a ,b);
        System.out.println(a+" "+b);
    }

    static int  swap (int a , int b){
        int temp ; 
        temp = a;
        a = b;
        b = temp ;
        return a  + b;
    }
    
}
