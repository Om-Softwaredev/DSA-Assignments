/*
 * Given two sorted linked lists consisting of **N** and **M** nodes respectively. The task is to merge both of the lists (in place) and return the head of the merged list.

**Examples:**

Input: a: 5->10->15, b: 2->3->20

Output: 2->3->5->10->15->20

Input: a: 1->1, b: 2->4

Output: 1->1->2->4
 */
public class Question06 {

	public static Node mergeSortedLists(Node head1, Node head2) {
        if (head1 == null) {
            return head2; 
        }

        if (head2 == null) {
            return head1; 
        }

        Node dummy = new Node(-1);
        Node current = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        if (head1 != null) {
            current.next = head1;
        } else {
            current.next = head2;
        }

        return dummy.next; 
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
        Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);

        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);

        System.out.println("Linked List 1:");
        printLinkedList(head1);

        System.out.println("Linked List 2:");
        printLinkedList(head2);

        Node mergedHead = mergeSortedLists(head1, head2);

        System.out.println("Merged Linked List:");
        printLinkedList(mergedHead);
    }
}
