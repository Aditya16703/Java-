package properties.polymorphism;

public class Numbers {

    int sum(int a , int b){
        return a + b;
    }

    int sum(int a , int b,int c){
        return a + b + c;
    }



    public static void main (String[] agrs){
        Numbers obj = new Numbers();

        obj.sum(2,3);
        obj.sum(2,3,4);
        
    }
    
}
