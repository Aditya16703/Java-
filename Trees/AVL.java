import java.util.*;
public class AVL {

    // AVL tree implementation  
    public class Node {
        int value;
        Node left ;
         Node right ;
        int height;

    Node(int value) {
        this.value = value;
}

    public int getValue(Node node){
        return node == null ? 0 : node.value;
    }
    

  private Node root;

  public void AVL() {

  }

  public int height(){
        return height(root);
  }

  private int height(Node node){
        return  node.height;
  }

  public void insert(int value){
     root = insert( root , value);
  }
    private Node insert(Node node , int value){
     if(node == null) {
        node = new Node(value);
        return node;
     }

    if(value < node.value){
            node.left = insert(node.left , value);
        } 
         if(value > node.value){
            node.right = insert( node.right, value);
        } 
        node.height = Math.max(height(node.left) , height(node.right)) + 1;
        return rotate(node);
  }

       private Node rotate(Node node){
         if(height(node.left) - height(node.right) > 1){
            // left heavy
            if(height(node.left.left) - height(node.left.right) > 0){
                // left left case
                return rightRotate(node);
            }

            if(height(node.left.left) - height(node.left.right) < 0){
                // left right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
         }

         if(height(node.right) - height(node.left) > 1){
            // right heavy
            if(height(node.right.right) - height(node.right.left)> 0){
                // right right heavy
                return leftRotate(node);
            }

            if(height(node.right.right) - height(node.right.left) < 0){
                // right left heavy
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
         }

         return node;
       }


         private Node rightRotate(Node node){
            Node newRoot = node.left;
            Node temp = newRoot.right;

            newRoot.right = node;
            node.left = temp;

            node.height = Math.max(height(node.left) , height(node.right)) + 1;
            newRoot.height = Math.max(height(newRoot.left) , height(newRoot.right)) + 1;

            return newRoot;
         }

          private Node leftRotate(Node node){
             Node newRoot = node.right;
             Node temp = newRoot.left;
             newRoot.left = node;
             node.right = temp;

             node.height = Math.max(height(node.left) , height(node.right)) + 1;
             newRoot.height = Math.max(height(newRoot.left) , height(newRoot.right)) + 1;

             return newRoot;
          }

    }    
}

