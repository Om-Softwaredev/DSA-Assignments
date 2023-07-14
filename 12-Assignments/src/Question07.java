/*
 * Given two linked lists, insert nodes of second list into first list at alternate positions of first list.
For example, if first list is 5->7->17->13->11 and second is 12->10->2->4->6, the first list should become 5->12->7->10->17->2->13->4->11->6 and second list should become empty. The nodes of second list should only be inserted when there are positions available. For example, if the first list is 1->2->3 and second list is 4->5->6->7->8, then first list should become 1->4->2->5->3->6 and second list to 7->8.

Use of extra space is not allowed (Not allowed to create additional nodes), i.e., insertion must be done in-place. Expected time complexity is O(n) where n is number of nodes in first list.
 */
public class Question07 {

	public static void insertAlternate(Node first, Node second) {
        if (first == null || second == null) {
            return; 
        }

        Node current1 = first;
        Node current2 = second;

        while (current1 != null && current2 != null) {
            Node temp1 = current1.next; 
            Node temp2 = current2.next; 

            current1.next = current2; 
            current2.next = temp1; 

            current1 = temp1; 
            current2 = temp2; 
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
        Node first = new Node(5);
        first.next = new Node(7);
        first.next.next = new Node(17);
        first.next.next.next = new Node(13);
        first.next.next.next.next = new Node(11);

        Node second = new Node(12);
        second.next = new Node(10);
        second.next.next = new Node(2);
        second.next.next.next = new Node(4);
        second.next.next.next.next = new Node(6);

        System.out.println("First Linked List before insertion:");
        printLinkedList(first);

        System.out.println("Second Linked List before insertion:");
        printLinkedList(second);

        insertAlternate(first, second);

        System.out.println("First Linked List after insertion:");
        printLinkedList(first);

        System.out.println("Second Linked List after insertion:");
        printLinkedList(second);
    }

}
