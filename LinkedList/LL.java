//package LinkedList;
// head is nothing but a reference variable point to the first node
// similarily tail is nothing but a reference variable pointed to the last node

import java.util.*;



public class LL {

    private Node head;
    private Node tail ;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;  // new node ka next  ( if node is added from front) is head of current linked list
        head = node; //  after adding the node in linked list from front  the head of the linked list is the new added node 


        if(tail == null){  // if tail equal to null initially ,  then if new node is added then  the tail will be that node which is head ( tail null means no node is there  if new node is added then this node is equal to both head also and tail also  )
           tail = head; 
        }

        size += 1; 
    }


    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return ;
        }
       Node node = new Node(val);
       tail.next = node;
       tail = node;
       size +=1;
    }


    public void insert(int val , int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return ;
        }

        Node temp = head;
        for(int  i = 1 ; i < index ;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;

        size++;
    }


    public int deleteFirst(){
        int  value = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }

        size --;
        return value;
    }


    public int deleteLast() {
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val  = tail.value;
        tail = secondLast;
        tail.next = null ;

        return val;
    }

    public Node get(int index ){
        Node node = head;
        for(int i = 0 ; i< index ; i++){
            node = node.next;
        }

        return node;
    }


    public int delete( int index ){
        if ( index == 0){
            return deleteFirst();
        }

        if( index == size){
            return deleteFirst();
        }

        Node prev =  get(index - 1);
        int  val = prev.next.value;

        prev.next = prev.next.next;
        return val;
    }


    public Node find(int value){
        Node node = head;

        while ( node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }

        return null;
    }


    // insert using Recursion 

    public void insertRec(int val , int index){
         head = insertRec(val ,index,head);
        
    }

    private Node insertRec(int val , int index , Node node){
        if(index == 0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }

        node.next = insertRec( val , index--,node.next);
        return node;
}




    public void display(){

        
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }



    public  void duplicateNode(){
        Node node = head;
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size --;
            }else{
                node = node.next;
            }
        }

        tail = node;
        tail.next = null;

    }

    private class Node {
        private int value;

        private Node next;


        public Node(int value){
            this.value = value;
        }

      public Node(int value, Node next){
            this.value = value ; 
            this.next = next;
      }
    }
   

    private void bubbleSort(int row , int col){
        if( row == 0){
            return;
        
        }

        if(col < row){
            Node first = get(col);
            Node second = get(col + 1);

            if(first.value > second.value){
                // swap 
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }else if(second == tail){
                    Node prev = get(col -1);

                    prev.next = second;
                    tail = first;
                    second.next = tail;
                    first.next = null;
                }else{
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }

            }
            bubbleSort(row , col + 1);
        }else{
            bubbleSort(row - 1 , 0);
        }
    }

    public static void main(String[] args, int index) {
        LL first = new LL();
        LL second = new LL();
        first.insertLast(1);
        first.insertLast(3); 
        first.insertLast(5);

        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(9);


        LL list  = new LL();
        for(int j = 0 ; j < 10 ; j++){
            list.insertLast(j);
        }
        list.display();
        list.bubbleSort(list.size,0);     
        list.display();
        
        


    }

    


    
}
