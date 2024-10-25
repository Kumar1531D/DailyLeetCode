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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode prev = null;
        ListNode cur1 = l1;
        ListNode cur2 = l2;

        int rem = 0;

        while(cur1!=null && cur2!=null){
            int temp = rem+cur1.val+cur2.val;
            cur1.val = (temp)%10;
            //System.out.println(cur1.val);
            rem = (temp)/10;
           // System.out.println(rem);
            prev = cur1;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        while(cur2!=null){
            prev.next = new ListNode((cur2.val+rem)%10);
            rem = (cur2.val+rem)/10;
            prev = prev.next;
            cur2 = cur2.next;
        }

        while(cur1!=null){
            int temp = rem+cur1.val;
            cur1.val = (temp)%10;
            rem = temp/10;
            prev = cur1;
            cur1 = cur1.next;
        }

        if(rem!=0)
            prev.next = new ListNode(rem);

        return l1;



    }
}
