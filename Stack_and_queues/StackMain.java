//package Stack_and_queues;

public class StackMain {
    public static void main(String[] args) throws StackException {
    //     CustomStack stack = new CustomStack(5);

    //     stack.push(34);
    //     stack.push(43);
    //     stack.push(45);
    //     stack.push(32);
    //     stack.push(3);
    //     stack.push(8); //  shows stack is full


    //     System.out.println(stack.pop());
    //     System.out.println(stack.pop());
    //     System.out.println(stack.pop());
    //     System.out.println(stack.pop());
    //     System.out.println(stack.pop());
    //    // System.out.println(stack.pop());// exception 

       //CustomStack //(This tell what all access you can get)stack = new DynamicStack(//this means what arethe type of access you can get) (50)
       DynamicStack stack = new DynamicStack(5);

       stack.push(34);
       stack.push(43);
       stack.push(45);
       stack.push(32);
       stack.push(3);
       stack.push(8); 


       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());
       System.out.println(stack.pop());
        
    }
    
}
