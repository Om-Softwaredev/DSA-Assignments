/*
 * Given a linked list and a key to be deleted. Delete last occurrence of key from linked. The list may have duplicates.

**Examples**:
Input:   1->2->3->5->2->10, key = 2
Output:  1->2->3->5->10
 */
public class Question05 {

	public static Node deleteLastOccurrence(Node head, int key) {
        if (head == null) {
            return null; 
        }

        Node prev = null;
        Node current = head;
        Node lastOccurrence = null;
        Node prevLastOccurrence = null;

        while (current != null) {
            if (current.data == key) {
                prevLastOccurrence = prev;
                lastOccurrence = current;
            }
            prev = current;
            current = current.next;
        }

        if (lastOccurrence != null) {
            if (lastOccurrence == head) {
                head = head.next;
            } else {
                prevLastOccurrence.next = lastOccurrence.next;
            }
        }

        return head; 
    }

    public static void printLinkedList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(10);

        int key = 2;

        System.out.println("Linked List before deleting last occurrence of " + key + ":");
        printLinkedList(head);

        Node newHead = deleteLastOccurrence(head, key);

        System.out.println("Linked List after deleting last occurrence of " + key + ":");
        printLinkedList(newHead);
    }

}
