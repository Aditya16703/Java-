import java.util.*;
public class Mazeproblem{

    public static void main(String[] args){
    
     //Maze("",3,3);
     
     //System.out.println(Mazepath("",3,3));
     System.out.println(MazepathDigo("",3,3));

    }



    static void Maze (String p , int r , int c ){
        if (r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            Maze(p+'D',r-1,c);
        }

        if(c>1){
            Maze(p+'R',r,c-1);
        }

    }


    static ArrayList<String> Mazepath (String p , int r , int c ){
        if (r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
             list.add(p);
            return list;
        }
         ArrayList<String> list= new ArrayList<>();
        if(r>1){
           list.addAll( Mazepath(p+'D',r-1,c));
        }

        if(c>1){
           list.addAll (Mazepath(p+'R',r,c-1));
        }
        return list;
    }


    static ArrayList<String> MazepathDigo (String p , int r , int c ){
        if (r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
             list.add(p);
            return list;
        }
         ArrayList<String> list= new ArrayList<>();
         
        if(r>1 && c > 1){
           list.addAll( MazepathDigo(p+'D',r-1,c-1));
        }
        if(r>1){
            list.addAll( MazepathDigo(p+'V',r-1,c));
         }
 
        if(c>1){
           list.addAll (MazepathDigo(p+'H',r,c-1));
        }
        return list;
    }
}