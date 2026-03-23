package org.jatin.A_FastAndSlowPointer;

public class LinkedListCycle {

    public static void main(String[] args) throws Exception {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        LinkedList list = new LinkedList();
        list.createCyclicLinkedList(list, arr, 2, 3);
        System.out.println(hasCycle(list.head));
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;

    }

}
