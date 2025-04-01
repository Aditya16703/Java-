
//package Stack_and_queues;
import java.util.*;

public class InBuiltExample {

    public static void main (String[] args){
  //  Stack<Integer>  stack = new Stack<>();
    // stack.push(34);
    // stack.push(45);
    // stack.push(2);
    // stack.push(5);
    // stack.push(9);
    // stack.push(6);
    // stack.push(15);
    

    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
    // System.out.println(stack.pop());
     


    // Queue<Integer> queue = new LinkedList<>();

    // queue.add(3);
    // queue.add(5);
    // queue.add(7);
    // queue.add(9);
    // queue.add(11);


    // System.out.println(queue.peek());


    Deque<Integer> deque = new ArrayDeque<>(); // ArrayDeques  provide us to create an object  of the method that are mention in deque interface , since deque is interface therefore there must me class that implement that method  i.e arraydeque (class)   
    // ArrayDeque is resizeable array
    // 1 in Deque you can add or remove from both the side 
    // 2  Null element are not allowed 
    // 3  It has no capacity restrication 
    // 4  It is actually not thread save either 
    // 5   it is faster then stack and queue
    deque.add(89);
    deque.addLast(78);
    deque.removeFirst();    



    
}
}