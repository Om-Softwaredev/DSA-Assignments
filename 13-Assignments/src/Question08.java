/*
 * Given a doubly linked list and a position. The task is to delete a node from given position in a doubly linked list.

**Example 1:**
Input:
LinkedList = 1 <--> 3 <--> 4
x = 3
Output:1 3
Explanation:After deleting the node at
position 3 (position starts from 1),
the linked list will be now as 1->3.
 */
public class Question08 {

	public static Node1 deleteNode(Node1 head, int position) {
        if (head == null) {
            return null; 
        }

        if (position == 1) {
            head = head.next; 
            if (head != null) {
                head.prev = null;
            }
            return head;
        }

        Node1 current = head;
        int count = 1;

        while (current != null && count < position) {
            current = current.next;
            count++;
        }

        if (current == null) {
            return head; 
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
        }

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
        Node1 head = new Node1(1);
        head.next = new Node1(3);
        head.next.prev = head;
        head.next.next = new Node1(4);
        head.next.next.prev = head.next;

        System.out.println("Original Linked List:");
        printLinkedList(head);

        int position = 3;
        head = deleteNode(head, position);

        System.out.println("Linked List after deleting node at position " + position + ":");
        printLinkedList(head);
    }
}
