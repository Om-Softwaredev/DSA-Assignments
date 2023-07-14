/*
 * nodes from the list. The list should only be traversed once.

For example if the linked list is 11->11->11->21->43->43->60 then removeDuplicates() should convert the list to 11->21->43->60.
example:1
Input:
LinkedList: 
11->11->11->21->43->43->60
Output:
11->21->43->60
 */
public class Question02 {

	public static void removeDuplicates(Node head) {
        if (head == null || head.next == null) {
            return; 
        }

        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
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
        Node head = new Node(11);
        head.next = new Node(11);
        head.next.next = new Node(11);
        head.next.next.next = new Node(21);
        head.next.next.next.next = new Node(43);
        head.next.next.next.next.next = new Node(43);
        head.next.next.next.next.next.next = new Node(60);

        System.out.println("Linked List before removing duplicates:");
        printLinkedList(head);

        removeDuplicates(head);

        System.out.println("Linked List after removing duplicates:");
        printLinkedList(head);
    }

}
