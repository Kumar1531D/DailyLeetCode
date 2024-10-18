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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        int first = 0;
        int second = 0;

        while(fast!=null){
            if(fast.next==null){
                slow = slow.next;
                break;
            }
            first = (first*10) + slow.val;
            fast = fast.next.next;
            slow = slow.next;
        }

        int fact = 1;

        while(slow!=null){
            second = slow.val*fact + second;
            fact*=10;
            slow = slow.next;
        }
        
        return first==second;
    }
}
