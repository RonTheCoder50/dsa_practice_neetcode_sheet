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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode slow = head, fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head_2 = slow.next;
        slow.next = null;

        //reverse second part
        ListNode prv = null, curr = head_2;
        while(curr != null) {
            ListNode nxt = curr.next;
            curr.next = prv;

            prv = curr;
            curr = nxt;
        }

        //set head_2 as last node.
        head_2 = prv;

        ListNode dumy = new ListNode(0);
        curr = dumy;

        while(head != null && head_2 != null) {
            curr.next = head;
            head = head.next;
            curr = curr.next;

            curr.next = head_2;
            head_2 = head_2.next;
            curr = curr.next;
        }

        if(head != null) curr.next = head;
        else curr.next = head_2;
    }
}
