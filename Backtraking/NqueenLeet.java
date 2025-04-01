import java.util.*;
public class NqueenLeet{
     public  List<List<String>> solveNQueen(int n ){
     
          boolean[][] board = new boolean[n][n];
          List<List<String>> allBoards = new ArrayList<>();
          queens(board,0 ,allBoards);
         return allBoards;
    }
     
    public void queens(boolean[][] board, int row , List<List<String>> allBoards){
        if(row == board.length){
            display(board,allBoards);
            //System.out.println();
            return ;
                   }
                    
                    
                   // placing the queen and checking for every row and col 
                   for( int col = 0 ; col < board.length ; col++){
                       // place the queen if it is safe 
 
                       if(isSafe(board,row,col)){
                                               board[row][col]  = true;
                                                queens (board,row+1,allBoards);
                                               board[row][col]  = false;
                                             }
                                              
                                         }
                       
                                         
                                     }
                       
  public  boolean isSafe(boolean[][] board, int row, int col) {
     // check vertical row 
     for (int i =0 ; i < row ; i++){
         if(board[i][col]){
             return false;
         }
     }
 
 
     //digonal left 
     int maxLeft = Math.min(row,col);
     for(int i = 1; i<= maxLeft ; i++){
       if(board[row-i][col-i]){
         return false;
       }  
     }
     // digonal Right 
     int maxRight = Math.min(row,board.length - col-1);
     for(int i = 1; i<= maxRight  ; i++){
       if(board[row-i][col+i]){
         return false;
       }  
     }
          return true;                 
                       }
                       
                               public void display(boolean[][] board, List<List<String>> allBoards) {

                                String aadi = "";
                 List<String> newboard = new ArrayList<>() ;              
                for(boolean [] row : board) {
                    aadi = "";
                 for(boolean element : row){
                     if(element){
                          aadi += "Q";//System.out.print("Q ");
                     } else {
                          aadi += "."; //System.out.print(". ");
                     }
                 }
                 newboard.add(aadi);
                 
                }
                allBoards.add(newboard);
            }
 
 
 }