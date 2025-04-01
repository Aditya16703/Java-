
public class Sidetriangle {

    public static void main (String[] args){
        pattern(5);

    }

    static void pattern(int n ){
        for(int row =1; row< 2*n;row++){
            int totalColsInRow = row > n ? 2*n -row :row;
            for(int col=0 ; col<totalColsInRow ; col++){
                System.out.print("* ");

            }

            System.out.println();
        }
    }
    
}
