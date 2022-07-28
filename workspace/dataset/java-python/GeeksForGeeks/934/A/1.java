

// Java implementation to find the sum of  
// nodes of the Linked List  
class GFG  
{ 
      
static int sum=0; 
      
// A Linked list node / 
static class Node 
{  
    int data;  
    Node next;  
}  
  
// function to insert a node at the  
// beginning of the linked list  
static Node push( Node head_ref, int new_data)  
{  
    // allocate node / 
    Node new_node = new Node();  
  
    // put in the data / 
    new_node.data = new_data;  
  
    // link the old list to the new node / 
    new_node.next = (head_ref);  
  
    // move the head to point to the new node / 
    (head_ref) = new_node;  
    return head_ref; 
}  
  
// function to recursively find the sum of  
// nodes of the given linked list  
static void sumOfNodes( Node head)  
{  
    // if head = null  
    if (head == null)  
        return;  
  
    // recursively traverse the remaining nodes  
    sumOfNodes(head.next);  
  
    // accumulate sum  
    sum = sum + head.data;  
}  
  
// utility function to find the sum of nodes  
static int sumOfNodesUtil( Node head)  
{  
  
    sum = 0;  
  
    // find the sum of nodes  
    sumOfNodes(head);  
  
    // required sum  
    return sum;  
}  
  
// Driver program to test above  
public static void main(String args[]) 
{  
    Node head = null;  
  
    // create linked list 7.6.8.4.1  
    head = push(head, 7);  
    head = push(head, 6);  
    head = push(head, 8);  
    head = push(head, 4);  
    head = push(head, 1);  
  
    System.out.println( "Sum of nodes = "
        + sumOfNodesUtil(head));  
}  
} 
  
// This code is contributed by Arnab Kundu 

