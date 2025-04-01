public class Diamond {
    public static void main(String[] args){
        pattern(6);

    }

    static void pattern(int n){
        for(int row = 0; row < 2*n ;row++){
            int totalColsInRow = row > n ? 2*n - row:row;

            int noofspaces = n-totalColsInRow;
            for(int s=0;s< noofspaces ; s++){
                System.out.print(" ");
            }

            for(int col=1;col <= totalColsInRow;col++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    
}
