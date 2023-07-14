/*
 * Given a singly linked list of characters, write a function that returns true if the given list is a palindrome, else false.

!https://media.geeksforgeeks.org/wp-content/uploads/20220816144425/LLdrawio.png

**Examples:**

> Input: R->A->D->A->R->NULL
> 
> 
> **Output:** Yes
> 
> **Input:** C->O->D->E->NULL
> 
> **Output:** No
>
 */
public class Question04 {

	public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true; // An empty list or a list with a single node is considered a palindrome
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverseList(slow.next); // Reverse the second half of the linked list

        Node p1 = head; // Pointer to the first half of the list
        Node p2 = secondHalf; // Pointer to the reversed second half of the list

        while (p2 != null) {
            if (p1.data != p2.data) {
                return false; // If values don't match, it is not a palindrome
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true; // If all values match, it is a palindrome
    }

    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node('R');
        head.next = new Node('A');
        head.next.next = new Node('D');
        head.next.next.next = new Node('A');
        head.next.next.next.next = new Node('R');

        boolean isPal = isPalindrome(head);

        System.out.println("Is the linked list a palindrome? " + (isPal ? "Yes" : "No")); // Output: Is the linked list a palindrome? Yes
    }
}
