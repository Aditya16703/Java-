public class DownwordTriangle {
    public static void main (String[] args){
        pattern1(6);
     }

     static void pattern1(int n){
        for(int row = 1;row<=n; row++){
        // for every row, run the col
        for (int col = n-row+1; col>=1; col--){
            System.out.print("* ");

        }
        // when one row is printed , we need to add a newline
        System.out.println();
     }
}
    
}
