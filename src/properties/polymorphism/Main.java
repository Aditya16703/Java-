//package properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        // Shapes shape = new Shapes();
        // Circle circle = new Circle();
        // Square square = new Square();

        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();
        // what method , what variable it is able to access depends on left hand side 
        //  type of method in override that is called depends on  what the type of object is 
        // what have been access  does not dependent on object type it depends on refrence type
        // what it able to access is define by the type  reference  and which one is able to access is define by type of object 

        // Parentclass obj = new Child()
        // here which method will be called depends on child class 
        // this is known as upcasting 
        // this is how overriding works 

        shape.area();
        circle.area();
        square.area();
    }
    
}
