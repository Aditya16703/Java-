package singleton;

import access.A;

public class Main {
    public static void main(String[] args){
        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();
        
        Singleton obj3 = Singleton.getInstance();

        // all 3 ref variables are pointing to just one object



        
        A a = new A(10, "Kunal");
        a.getNum();
       // int n = obj.num;  not able to access because num is protected data type 

    }
    
}
