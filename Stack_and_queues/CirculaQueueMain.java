public class CirculaQueueMain {

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        try {
            queue.insert(3);
            queue.insert(5);
            queue.insert(6);
            queue.insert(8);
            queue.insert(31);
            
            queue.display();
            
            System.out.println(queue.remove());
            System.out.println(queue.remove());
            System.out.println(queue.remove()); 
            
            queue.display();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
