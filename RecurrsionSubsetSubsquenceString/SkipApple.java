import java.util.*;
public class SkipApple {

    public static void main (String[] args){
       // System.out.println(skipApple("bhfgapplety"));
       System.out.println(skipAppnotApple("bhfgapplety"));
    }

    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipAppnotApple(String up){
        if(up.isEmpty()){
            return " ";
        }

        if (up.startsWith("app")&& !up.startsWith("apple")){
            return skipAppnotApple(up.substring(3));
        }else{
            return up.charAt(0) + skipAppnotApple(up.substring(1));
        
    }
    
}
}
