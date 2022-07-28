

// Java implementation to find the sum of 
// nodes of the Linked List 
  
class GFG  
{ 
  
static Node head;  
  
/* A Linked list node */
static class Node 
{ 
    int data; 
    Node next; 
}; 
  
// function to insert a node at the 
// beginning of the linked list 
// Inserting node at the beginning 
static Node push(Node head_ref, int new_data) 
{ 
    /* allocate node */
    Node new_node = new Node(); 
      
    /* put in the data */
    new_node.data = new_data; 
      
    /* link the old list to the new node */
    new_node.next = head_ref; 
      
    /* move the head to point to the new node */
    head_ref = new_node; 
    return head=head_ref; 
} 
  
// function to find the sum of 
// nodes of the given linked list 
static int sumOfNodes( Node head) 
{ 
    Node ptr = head; 
    int sum = 0; 
    while (ptr != null)  
    { 
  
        sum += ptr.data; 
        ptr = ptr.next; 
    } 
  
    return sum; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    // create linked list 7.6.8.4.1 
    push(head, 7); 
    push(head, 6); 
    push(head, 8); 
    push(head, 4); 
    push(head, 1); 
  
    System.out.println("Sum of nodes = "
        + sumOfNodes(head)); 
} 
} 
  
/* This code is contributed by PrinciRaj1992 */

