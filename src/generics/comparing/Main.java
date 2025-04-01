//package generics.comparing;
//   Generics in Java is a powerful feature that allows you to create classes, interfaces, and methods with type parameters. This enables code reusability and type safety,     ensuring that you can handle different types of data without rewriting the code for each specific type.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student kunal  = new Student(12,89.76f);
        Student rahul  = new Student(5,99.52f);
        Student arpit  = new Student(5,99.52f);
        Student karan  = new Student(5,99.52f);
        Student sachin  = new Student(5,99.52f);

        Student[] list = {kunal , rahul , arpit , karan , sachin};

        System.out.println(Arrays.toString(list));
    
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        
    
        

        if(kunal.compareTo(rahul) < 0){
            System.out.println(kunal.compareTo(rahul));
            System.out.println("Rahul has more marks");
        }
    }
    
}
