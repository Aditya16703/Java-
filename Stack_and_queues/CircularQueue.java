// Removed package declaration to match the expected package

public class CircularQueue{
    int[] data;
    private  static final int DEFAULT_SIZE = 10 ;
    int front = 0;
    int end = 0;
    int size = 0; // number of elements in the queue
    // Complexity is O(1)

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }       

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length ; // ptr is at last index 

    }

    public boolean isEmpty(){
        return size == 0;
    }
    // Complexity is O(1)

    public boolean insert(int item){
        if(isFull()){
            return false;
        }

        data[end] = item;
        end = (end + 1) % data.length; // circular increment
        size++ ; 
        
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception ("Queue is empty");
        }

        int removed = data[front];
        front = (front + 1) % data.length; // circular increment
        size-- ; 
        return removed ;
    }


    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        return data[front];
    }

    public void display(){
        int i = front;
        do{
            System.out.print(data[i] + "<-");
            i++;
            i %= data.length; // circular increment
        }while(i != end); // loop until we reach the end of the queue
        System.out.println("END");
        }

    // public void display2(){
    //     for(int i=0; i<size;i++){
    //         System.out.print(data[(front + i) % data.length] + "<-");
    //     }

    //     System.out.println("END");
    // }


}