/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution1 {
    public ListNode reverseList(ListNode head) {
        ListNode node = head;
        ListNode before = null;

        while (node != null) {
            ListNode next = node.next;
            node.next = before;
            before = node;
            node = next;
        }

        return before;
    }
}