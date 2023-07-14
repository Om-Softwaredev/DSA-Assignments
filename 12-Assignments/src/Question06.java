/*
 * Given a linked list and two integers M and N. Traverse the linked list such that you retain M nodes then delete next N nodes, continue the same till end of the linked list.

Difficulty Level: Rookie

**Examples**:
Input:
M = 2, N = 2
Linked List: 1->2->3->4->5->6->7->8
Output:
Linked List: 1->2->5->6

Input:
M = 3, N = 2
Linked List: 1->2->3->4->5->6->7->8->9->10
Output:
Linked List: 1->2->3->6->7->8

Input:
M = 1, N = 1
Linked List: 1->2->3->4->5->6->7->8->9->10
Output:
Linked List: 1->3->5->7->9
 */
public class Question06 {

	public static void retainAndDelete(Node head, int M, int N) {
        if (head == null || M <= 0 || N <= 0) {
            return; // Invalid input, return
        }

        Node current = head;
        Node previous = null;
        int count;

        // Traverse the linked list
        while (current != null) {
            // Retain M nodes
            for (count = 1; count < M && current != null; count++) {
                current = current.next;
            }

            // Delete N nodes
            if (current != null) {
                Node nextNode = current.next;
                for (count = 1; count <= N && nextNode != null; count++) {
                    nextNode = nextNode.next;
                }
                current.next = nextNode;
                current = nextNode;
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
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);
        head1.next.next.next.next.next.next.next = new Node(8);

        int M1 = 2;
        int N1 = 2;

        System.out.println("Linked List before retaining and deleting:");
        printLinkedList(head1);

        retainAndDelete(head1, M1, N1);

        System.out.println("Linked List after retaining and deleting:");
        printLinkedList(head1);

        
    }

}
