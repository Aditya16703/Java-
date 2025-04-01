//package generics;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenArrayList <T> {

     private Object[] data; //  we have use Object type  because  we gets idea after checking internal implementation of ArrayList and there are  also Object type  
    private int DEFAULT_SIZE = 10;
    private int size =0;
    
    public CustomGenArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num ;
    }
    
    private void resize(){
         Object[] temp = new Object[data.length*2];

         //copy the current items in the new array
         for(int i = 0 ; i< data.length;i++){
            temp[i] = data[i];
        
         }

         data = temp;
    }



    public boolean isFull(){
        return size == data.length;
    }


    public T remove(){
        @SuppressWarnings("unchecked")
        T removed = (T)(data[--size]); // here it is asking for T in left side i.e T removed and object is been given in right sight i.e data[--size] that why we are doing casting 
        return removed;
    }


    public T  get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }


    public void set(int index, T value){
        data[index] = value;
    }


    public String toString(){
        return "CustomArrayList{" +
               "data" + Arrays.toString(data) +
               ", size=" + size +
               '}';
    }
    public static void main(String[] args) {
       // ArrayList list = new ArrayList();
        // list.add(45);
        // list.remove(0);
        // list.get(0);
        // list.size();
        // list.isEmpty();

    CustomArrayList list = new CustomArrayList();
    // list.add(3);
    // list.add(5);
    // list.add(9);
    
    // for(int i = 0 ; i < 14 ; i++){
    //     list.add(2*i);
    // }


    // System.out.println(list);


    ArrayList<Integer> list2 = new ArrayList<>();
    // list2.add("dfghi");


    CustomGenArrayList<Integer> list3 = new CustomGenArrayList<>();
    list3.add(45);

    for(int i =0 ; i < 14 ; i++){
        list3.add(2*i);
    }
     System.out.println(list3);

    }
    
}
