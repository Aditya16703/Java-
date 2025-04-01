import java.util.*;
public class Factors{
    public static void main(String[] args){
       // factors3(20)
       factors2(25);
    }
     //O(n)
    static void factors1(int n){
     for(int i=1;i<=n;i++){
        if(n % i ==0){
           System.out.print(i+" ");
        }
     }
    }
    //O(sqrt(n))
    static void factors2(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
           if(n % i == 0){
            if(n/i==i){
                System.out.println(i);
            }else{
             System.out.print(i + " " + n/i +" ");
            }
           }
        }
       }

       //both time and space with be 0(sqrt(n))
       static void factors3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<= Math.sqrt(n); i++){
            if(n % i ==0){
                if (n/i == i){
                    System.out.println(i + " ");

                }else{
                    System.out.println(i + " ");
                    list.add(n/i);
                }
            }
        }
          for (int i = list.size() -1 ; i>= 0;i--){
            System.out.println(list.get(i)+" ");
          }


       }

}