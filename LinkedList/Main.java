//package LinkedList;

public class Main {
    public static void main(String[] args) {
       LL list = new LL();
       list.insertFirst(3); 
       list.insertFirst(2); 
       list.insertFirst(8); 
       list.insertFirst(17); 
       list.insertLast(9);
       list.insertLast(5);
       list.insertLast(1);
       list.insertLast(7);
       list.insertLast(6);
       list.display();
       list.insert(4,3);
       System.out.println(list.deleteFirst());
       list.display();
       System.out.println(list.deleteLast());
       list.display();
       System.out.println(list.delete(4));
       list.display();
       System.out.println(list.find(1));
       list.display();


        
    }
    
}
