

// Java program to print reverse of linked list 
// using stack. 
import java.util.*; 
  
class GFG 
{ 
      
/* Link list node */
static class Node 
{ 
    int data; 
    Node next; 
}; 
  
/* Given a reference (pointer to pointer) to the head 
of a list and an int, push a new node on the front 
of the list. */
static Node push( Node head_ref, int new_data) 
{ 
    Node new_node = new Node(); 
    new_node.data = new_data; 
    new_node.next = (head_ref); 
    (head_ref) = new_node; 
    return head_ref; 
} 
  
/* Counts no. of nodes in linked list */
static int getCount( Node head) 
{ 
    int count = 0; // Initialize count 
    Node current = head; // Initialize current 
    while (current != null) 
    { 
        count++; 
        current = current.next; 
    } 
    return count; 
} 
  
/* Takes head pointer of the linked list and index 
    as arguments and return data at index*/
static int getNth( Node head, int n) 
{ 
    Node curr = head; 
    for (int i = 0; i < n-1 && curr != null; i++) 
        curr = curr.next; 
    return curr.data; 
} 
  
static void printReverse(Node head) 
{ 
    // store Node addresses in stack 
    Stack<Node > stk = new Stack<Node>();  
    Node ptr = head; 
    while (ptr != null)  
    { 
        stk.push(ptr); 
        ptr = ptr.next; 
    } 
  
    // print data from stack 
    while (stk.size() > 0) 
    { 
        System.out.print( stk.peek().data + " "); 
        stk.pop(); // pop after print 
    } 
    System.out.println( "\n"); 
} 
  
/* Driver code*/
public static void main(String args[]) 
{ 
    /* Start with the empty list */
    Node head = null; 
  
    /* Use push() to con below list 
    1.2.3.4.5 */
    head=push(head, 5); 
    head=push(head, 4); 
    head=push(head, 3); 
    head=push(head, 2); 
    head=push(head, 1); 
  
    printReverse(head); 
} 
} 
  
// This code is contributed by Arnab Kundu 

