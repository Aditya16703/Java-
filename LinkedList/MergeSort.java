public class MergeSort {

   public ListNode sortList(ListNode head){
    if(head == null || head.next == null){
        return null;
    }
     ListNode mid = getmid(head);
     ListNode left = sortList(head);
     ListNode right = sortList(mid);

     return merge(left,right);
    
   }


    ListNode merge(ListNode list1,ListNode list2){
        ListNode dummyHead = new ListNode();
                ListNode tail = dummyHead;
            
        
                while( list1 != null && list2 != null){
                    if(list1.val < list2.val){
                        tail.next = list1;
                        list1 = list1.next;
                        tail = tail.next;
                    }else {
                        tail.next = list2;
                        list2 = list2.next;
                        tail = tail.next;
                    }
                }
        
                tail.next = (list1 != null) ? list1 : list2;

                return dummyHead.next;
            }

            public ListNode getmid(ListNode head) {
                ListNode fast = head ;
                ListNode slow = head;
                
                
                while( fast != null && fast.next != null){
                    slow = slow.next;
                    fast = fast.next.next;
                }


                if(slow == null){
                    return null;
                }
        
                return slow;
                
            }
        
        
        
            class ListNode {
                int val;
                ListNode next;
        
                
        
                ListNode(int x){
                    val = x ;
                    next = null;
                }
        
        
        
                public ListNode() {
                    
                }
    }
    
}




ListNode midPrev = null;
                while(head != null && head.next != null){
                    midPrev =(midPrev == null) ? head:midPrev.next;
                    head = head.next.next;
                }

                ListNode mid = midPrev.next;
                midPrev.next = null;
                return mid;
