/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        boolean check = false;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                check = true;
                break;
            }
        }

        if(!check){
            return null;
        }

        slow = head;
       // fast = fast.next;
       // int index = -1;

        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
            //index++;
        }

        return slow;

    }
}
