package org.jatin.A_FastAndSlowPointer;

public class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        LinkedList list = new LinkedList();
        list.addMultipleNodes(list, arr);
        ListNode result = middleNode(list.head);
        list.print(result);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
