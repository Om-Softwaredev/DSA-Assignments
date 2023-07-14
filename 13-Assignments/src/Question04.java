/*
 * Given a linked list, write a function to reverse every alternate k nodes (where k is an input to the function) in an efficient way. Give the complexity of your algorithm.

**Example:**
Inputs:   1->2->3->4->5->6->7->8->9->NULL and k = 3
Output:   3->2->1->4->5->6->9->8->7->NULL.
 */
public class Question04 {

	public static Node reverseAlternateKNodes(Node head, int k) {
        if (head == null || k <= 1) {
            return head; 
        }

        Node current = head;
        Node next = null;
        Node prev = null;
        int count = 0;

        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        count = 0;
        while (current != null && count < k - 1) {
            current = current.next;
            count++;
        }

        if (current != null) {
            current.next = reverseAlternateKNodes(current.next, k);
        }

        return prev; 
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
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);

        int k = 3;

        System.out.println("Linked List before reversing alternate k nodes:");
        printLinkedList(head);

        Node newHead = reverseAlternateKNodes(head, k);

        System.out.println("Linked List after reversing alternate k nodes:");
        printLinkedList(newHead);
    }

}
