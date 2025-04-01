//package abstraction;
// can't create object of abstract class 
// also we can't create abstract constructor  in abstraction 
// we can't create abstract static method 
// static method can be create in abstract class 
// why constructing public constructor of abstract class ?  Because u can't initialized or instantciate  the abstract class directly   u can only instantciate by derived class 
// we can't have final abstract class becuase it prevent it from been inherite but abstract class are always inherite by subclass 
public  abstract class Parent {


    int age ;

    public Parent(int age){
        this.age = age;
    }


    static void hello(){
        System.out.println("hey");
    }
    abstract void career ();
    abstract void partner();
    
}
