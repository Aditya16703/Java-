//Merging two sorted list 

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode dummy = new ListNode(); // Dummy node to simplify edge cases
       ListNode Mainnode = dummy; // Pointer to track the merged list

       // Merge both lists
       while (list1 != null && list2 != null) {
           if (list1.val < list2.val) {
               Mainnode.next = list1; // Attach the smaller node
               list1 = list1.next; // Move list1 forward
           } else {
               Mainnode.next = list2; // Attach the smaller node
               list2 = list2.next; // Move list2 forward
           }
           Mainnode = Mainnode.next; // Move the merging pointer forward
       }

       // Attach the remaining nodes (if any)
       if (list1 != null) Mainnode.next = list1;
       else Mainnode.next = list2;

       return dummy.next; // Return the merged list (excluding dummy node)
   }
}

