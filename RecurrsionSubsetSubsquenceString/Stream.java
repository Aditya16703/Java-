import java.util.*;
public class Stream {
    public static void main(String[] args){
        skips(" ","bacchabh");
       // System.out.println(skips("baccdah"));
    }

    static void skips(String p , String up) {
        if (up.isEmpty()){
            System.out.println(p);
             return;
        }

        char ch = up.charAt(0);
        if(ch == 'a'){
            skips(p , up.substring(1));
        }else {
            skips( p + ch , up.substring(1));
        }
    }



    static String skips( String up) {
        if (up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        if(ch == 'a'){
           return skips( up.substring(1));
        }else {
           return ch + skips( up.substring(1));
        }
    }
}