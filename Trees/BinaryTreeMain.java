package Trees;

import java.util.Scanner;




public class BinaryTreeMain {   
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
         System.out.println("Enter the value of the node: ");
            int value = sc.nextInt();
        Node tree = new Node(value);// Dummy value, will be replaced
        tree.populate(sc);  
        System.out.println("Binary Tree Structure:");
        tree.display();
        sc.close();

     }
    }



     class Node {
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;

        }

        private Node root ; 


        public void populate(Scanner sc){
           // System.out.println("Enter the value of the node: ");
          //  int value = sc.nextInt();
            root = new Node(value);           
             populate(root, sc);

        }

        private void populate(Node node , Scanner sc) {
            System.out.println("Do you want to add a left child for " + node.value + "? (yes/no) ");
            boolean left = sc.nextBoolean();
            if(left){
                System.out.println("Enter the value of the left child: ");
                int leftValue = sc.nextInt();
                node.left = new Node(leftValue);
                populate(node.left, sc);
            }


            System.out.println("Do you want to add a right child for " + node.value + "? (yes/no) ");
            boolean right = sc.nextBoolean();
            if(right){
                System.out.println("Enter the value of the right child: ");
                int rightValue = sc.nextInt();
                node.right = new Node(rightValue);
                populate(node.right, sc);
            }
        }

        public void display(){
            display(root, "");
        }

        private void display(Node node , String indent) {
            if(node == null) {
                return;
            }

            System.out.println(indent + node.value);
            display(node.left, indent + "  ");
            display(node.right, indent + "  ");
        }




    }
    


