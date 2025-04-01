//package exceptionhandling;
// the exception handling is a way to handle the runtime errors so that  the norma flow of the application can be maintained .
// exception is a event that disrupts the normal flow of the program . it is an object which is thrown at runtime 
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        //int c = a/b; 
        try {
            //divide(a,b);
            String name = "Aditya";
            if(name.equals("Aditya")){
            throw new MyException("name is Aditya");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());

         } catch (ArithmeticException e){
                System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println();
        }
        finally {
            System.out.println("This will always execute");
        }
    }


    static int divide(int a ,int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("please do not divide by zero");
        }

        return a/b;
    }
    
}
