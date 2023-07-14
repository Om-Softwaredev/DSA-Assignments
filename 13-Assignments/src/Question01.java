/*
 * Given two linked list of the same size, the task is to create a new linked list using those linked lists. The condition is that the greater node among both linked list will be added to the new linked list.

**Examples:**
*Input: list1 = 5->2->3->8
list2 = 1->7->4->5
Output: New list = 5->7->4->8

Input:list1 = 2->8->9->3
list2 = 5->3->6->4
Output: New list = 5->8->9->4
 */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Question01 {

	public static Node createGreaterNodeList(Node head1, Node head2) {
        if (head1 == null || head2 == null) {
            return null; // Invalid input, return null
        }

        Node newHead = null; // Head of the new linked list
        Node tail = null; // Tail of the new linked list

        // Iterate through both lists simultaneously
        while (head1 != null && head2 != null) {
            int data1 = head1.data;
            int data2 = head2.data;

            // Compare the nodes and select the greater node
            int maxData = Math.max(data1, data2);

            // Create a new node with the greater value
            Node newNode = new Node(maxData);

            if (newHead == null) {
                newHead = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }

            // Move to the next nodes in both lists
            head1 = head1.next;
            head2 = head2.next;
        }

        return newHead;
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
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(8);

        Node head2 = new Node(1);
        head2.next = new Node(7);
        head2.next.next = new Node(4);
        head2.next.next.next = new Node(5);

        System.out.println("List 1:");
        printLinkedList(head1);

        System.out.println("List 2:");
        printLinkedList(head2);

        Node newList = createGreaterNodeList(head1, head2);

        System.out.println("New List:");
        printLinkedList(newList);
    }

}
