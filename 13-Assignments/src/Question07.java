/*
 * Given a **Doubly Linked List**, the task is to reverse the given Doubly Linked List.

**Example:**
Original Linked list 10 8 4 2
Reversed Linked list 2 4 8 10
 */
class Node1 {
    int data;
    Node1 prev;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
public class Question07 {

	public static Node1 reverse(Node1 head) {
        if (head == null || head.next == null) {
            return head; 
        }

        Node1 current = head;
        Node1 temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        head = temp.prev;

        return head; 
    }

    public static void printLinkedList(Node1 head) {
        Node1 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Node1 head = new Node1(10);
        head.next = new Node1(8);
        head.next.prev = head;
        head.next.next = new Node1(4);
        head.next.next.prev = head.next;
        head.next.next.next = new Node1(2);
        head.next.next.next.prev = head.next.next;

        System.out.println("Original Linked List:");
        printLinkedList(head);

        Node1 reversedHead = reverse(head);

        System.out.println("Reversed Linked List:");
        printLinkedList(reversedHead);
    }

}
