import java.util.Arrays;

public class AllPathPrint {

    public static void main (String[] args){

        boolean [][] boat = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };

         int[][] path = new int[boat.length][boat[0].length];
         allpathprint("",boat,0,0,path,1);

    }

    static void allpathprint(String p ,boolean[][] maze,int r , int c ,int[][] path, int step ){
        if(r == maze.length-1 && c == maze[0].length-1){
             for( int [] arr: path){
                System.out.print(Arrays.toString(arr));
                
             }
             return;
            }

             if (!maze[r][c]){
                return;
             }

             maze[r][c] = false;
             path[r][c] = step;

             if ( r < maze.length-1){
                allpathprint(p+'D',maze,r+1,c,path,step+1);
             } 

             if ( c< maze[0].length-1){
                allpathprint(p+'R',maze,r,c+1,path,step+1);
             }
             if ( r > 0 ){
                allpathprint(p+'U',maze,r-1,c,path,step+1);
             }
             if ( c > 0){
                allpathprint(p+'L',maze,r,c-1,path,step+1);
             }
             maze[r][c] = true;
             path[r][c] = 0;
        }

       

    }
    

