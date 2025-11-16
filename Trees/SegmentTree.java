public class SegmentTree {

    private static class Node {
        int value ;
        int startInterval;
        int endInterval;
        Node left;
        Node right;
        int height:


        // 
        

        Node(  int value ,int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
            this.value = value;
            
        }

        private Node root;


        public int getValue(){
            return value;
        }

        public int getStartInterval(){
            return startInterval;
        }

        public int getEndInterval(){
            return endInterval;
        }

        // public int height(){
        //     return height(root);
        // }

        private int height(Node node){
            return node == null ? 0 : node.height;
        }
    }
    
}
