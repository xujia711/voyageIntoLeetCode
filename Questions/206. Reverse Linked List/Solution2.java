/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution2 {
    public ListNode reverseList(ListNode head) {
        return reverse(null, head);
    }

    private ListNode reverse(ListNode previous, ListNode current) {
        if (current == null) {
            return previous;
        }

        ListNode next = current.next;
        current.next = previous;
        return reverse(current, next);
    }
}