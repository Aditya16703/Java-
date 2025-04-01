//package properties.polymorphism;

public class ObjectPrint extends Object {
    

    int num;

    public ObjectPrint(int num ){
        this.num = num ;
    }

    @Override
    public String toString (){    // by default in java every class is extending object class 
        return "ObjectPrint{" +    // in rumtime it is deciding it this toString method will call not the Object class toString method 
                 "num=" + num +
                 '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);

        System.out.println(obj);
    }
    
}
