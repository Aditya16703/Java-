

public class QueueMain{
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(3);
        queue.insert(5);
        queue.insert(6);
        queue.insert(8);
        queue.insert(31);


        queue.display();
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove()); 

    }
    
}
