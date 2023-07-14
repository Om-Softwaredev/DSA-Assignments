/*
 * Given a singly linked list, find if the linked list is [circular](https://www.geeksforgeeks.org/circular-linked-list/amp/) or not.

> A linked list is called circular if it is not NULL-terminated and all nodes are connected in the form of a cycle. Below is an example of a circular linked list.
>
 */
public class Question08 {

	public static boolean isCircular(Node head) {
        if (head == null || head.next == null) {
            return false; // Not circular if the list is empty or has only one node
        }

        Node slow = head;
        Node fast = head;

        // Use the fast and slow pointer concept to detect a cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Cycle detected, the linked list is circular
            }
        }

        return false; // No cycle detected, the linked list is not circular
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head; // Creating a cycle by connecting the last node to the head

        boolean isCircular = isCircular(head);
        System.out.println("Is the linked list circular? " + isCircular);
    }

}
