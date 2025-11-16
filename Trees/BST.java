public class BST {
    public class Node {
        int value;
        Node left;
        Node right;
        int height ;

        Node (int value) {
            this.value = value;

        }

        Node (int value , Node left , Node right){
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    private Node root;

    public BST() {} 


    public int getValue(Node node) {
        return node.value;
    }
    
    public int height(Node node){
        if(node == null) {
            return 0;
        }
        return node.height;
    }

    public boolean isEmpty(Node node){
        return node == null ;
    }

    public void insert(int value) {
        root = insert(root , value);
    }


    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        }

        node.height = 1 + Math.max(height(node.left), height(node.right)); 
        return node;
    }
}
