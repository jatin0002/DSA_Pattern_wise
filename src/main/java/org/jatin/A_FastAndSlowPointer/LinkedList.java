package org.jatin.A_FastAndSlowPointer;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class LinkedList {
    ListNode head;

    public void insertNode(LinkedList list, int data) {
        ListNode node = new ListNode(data);

        if (list.head == null) {
            list.head = node;
        } else {
            ListNode temp = list.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void addMultipleNodes(LinkedList list, int[] arr) {
        for (int n : arr) {
            insertNode(list, n);
        }
    }

    public void createCyclicLinkedList(LinkedList list, int[] arr, int start, int destination) {
        if (list.head == null) {
            addMultipleNodes(list, arr);
        }

        ListNode current = list.head;
        ListNode startNode = null;
        ListNode destinationNode = null;

        int index = 0;
        while (current != null) {
            if (index == start) {
                startNode = current;
            }
            if (index == destination) {
                destinationNode = current;
            }
            current = current.next;
            index++;
        }

        destinationNode.next = startNode;
    }

    public void print(LinkedList list) {
        ListNode node = list.head;
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
            if (node != null) {
                System.out.print(" -> ");
            }
        }
    }

}
