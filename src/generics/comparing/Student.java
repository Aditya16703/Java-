//package generics.comparing;

public class Student  implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks){
        this.rollno = rollno;
        this.marks =  marks;
    }
   
    //The toString() method in Java is a method defined in the Object class, which is the superclass of all classes in Java.
    // This method returns a string representation of the object. By default, the toString() method returns a string consisting of the class name followed by the @ character and the object's hashcode in hexadecimal representation. 
    //However, you can override this method in your classes to provide a more meaningful string representation of the object.
    @Override
    public String toString() {
        return marks + " " ;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("In compared to method");
        int diff = (int)(this.marks - o.marks);
        // if diff == 0 : means both are equal 
        // if diff < 1 : means o is bigger else o is smaller
        return diff;
        
    }

    
}
