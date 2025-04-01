import java.util.Arrays;
//gq
public class Flipimage {

    public static int[][] flipAndInvertImage(int[][] image) {
            for(int[] row : image){
                for(int i=0 ; i < (image[0].length + 1)/2;i++){
                    // swap
                    int temp = row[i]^1;// xor is used to invert the number  like xor of 0 with 1  is 1   and xor of 1  with 1 is 0 
                     row[i] = row[image[0].length -i-1]^1  ;
                     row[image[0].length -i-1] = temp ;
                }
    
            }
    
            return image;
    
            
           
            
    
            
        }
    
    
}
