/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseListIteratively(ListNode head) {
        ListNode current = head;
        ListNode prev  = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev ;
            prev = current;
            current = next;
        }
        return prev;
    }

    public ListNode reverseListRecursively(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = null;
        ListNode reversed = reverseList(next);
        next.next = head;
        return reversed;
    }
}