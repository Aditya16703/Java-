//package properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.6,7.9,9.9);
        // Box box2 = new Box(box1);
        // System.out.println(box1.l + " " + box1.w +" " + box1.h);
        // BoxWeight box3 = new BoxWeight(2,3,4,8);
        // BoxWeight box4 = new BoxWeight() ;
        //         System.out.println(box3.h + " " + box3.weight);

        // Box box5 = new BoxWeight(2,3,4,8) ;
        // System.out.println(box5.w);  
        
        //there are many variables in both parent and child classes 
        // you are given access to variables that are in the ref types i.e Boxweight 
        // hence , you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialized
        // but here , when the obj itself is of type parent class, how will you call the constator 
        // this is why error 
    //     BoxWeight box6 = new Box(2,3,4);
    //     System.out.println(box6);



   // BoxPrice box = new BoxPrice(5,8,200);
 //  Box.greeting();  // static method does not need object to be called
   //  static method is called through class name that why   we have written Box.greeting() not box1.greeting()
   Box box = new BoxWeight();
   box.greeting();
   //there is not point of overriding the static method in child class because the method from parent class always run no matter from which object its called it 

     }

    public static void divide(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'divide'");
    }
    
}
