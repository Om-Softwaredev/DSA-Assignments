/*
 * Given a linked list consisting of **L** nodes and given a number **N**. The task is to find the **N**th node from the end of the linked list.

**Example 1:**
Input:
N = 2
LinkedList: 1->2->3->4->5->6->7->8->9
Output:8
Explanation:In the first example, there
are 9 nodes in linked list and we need
to find 2nd node from end. 2nd node
from end is 8.
 */
public class Question03 {

	 public static int findNthFromEnd(Node head, int n) {
	        if (head == null) {
	            return -1; // Return -1 for an empty list
	        }

	        Node slow = head;
	        Node fast = head;

	        // Move the fast pointer n nodes ahead of the slow pointer
	        for (int i = 0; i < n; i++) {
	            if (fast == null) {
	                return -1; // Return -1 if n is greater than the number of nodes
	            }
	            fast = fast.next;
	        }

	        // Move both pointers until the fast pointer reaches the end of the list
	        while (fast != null) {
	            slow = slow.next;
	            fast = fast.next;
	        }

	        if (slow == null) {
	            return -1; // Return -1 if n is greater than the number of nodes
	        }

	        return slow.data; // Return the data of the Nth node from the end
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

	        int n = 2;
	        int nthFromEnd = findNthFromEnd(head, n);

	        System.out.println("Nth node from the end: " + nthFromEnd); // Output: Nth node from the end: 8
	    }

}
