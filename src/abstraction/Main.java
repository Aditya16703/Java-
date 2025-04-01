//package abstraction;


public class Main {
    public static void main(String[] args) {
        
     Son son = new Son(30);
     son.career();

    //  Daughter daughter = new Daughter(41);
    //  daughter.career();

     Parent daughter = new Daughter(41);
     daughter.career();

     Parent.hello();
    }
    
}
