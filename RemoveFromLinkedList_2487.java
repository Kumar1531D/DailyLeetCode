/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        
        ListNode prev = null;
        ListNode cur = head;

        while(cur!=null){
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        head = prev;
        cur = head.next;

        while(cur!=null){
            if(cur.val<prev.val)
                cur = cur.next;
            else{
                ListNode temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
            }
        }

        head.next = null;
        head = prev;

        return head;

    }
}
