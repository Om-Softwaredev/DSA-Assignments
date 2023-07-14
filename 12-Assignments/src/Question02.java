/*
 * Given a linked list of **N** nodes. The task is to check if the linked list has a loop. Linked list can contain self loop.

**Example 1:**
Input:
N = 3
value[] = {1,3,4}
x(position at which tail is connected) = 2
Output:True
Explanation:In above test case N = 3.
The linked list with nodes N = 3 is
given. Then value of x=2 is given which
means last node is connected with xth
node of linked list. Therefore, there
exists a loop.
 */
class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Question02 {

	 public static boolean hasLoop(Node1 head) {
	        if (head == null || head.next == null) {
	            return false;
	        }

	        Node1 slow = head;
	        Node1 fast = head;

	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;

	            if (slow == fast) {
	                return true;
	            }
	        }

	        return false;
	    }

	    public static void main(String[] args) {
	        Node1 head = new Node1(1);
	        head.next = new Node1(2);
	        head.next.next = new Node1(3);
	        head.next.next.next = head.next; // Creating a loop by connecting the last node to the second node

	        boolean hasLoop = hasLoop(head);

	        System.out.println("Linked List has loop: " + hasLoop); // Output: Linked List has loop: true
	    }

}
