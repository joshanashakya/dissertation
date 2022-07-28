

// Java implementation to find the product of  
// nodes of the Linked List  
class GFG  
{ 
  
// A Linked list node  
static class Node 
{  
    int data;  
    Node next;  
};  
  
// Function to insert a node at the  
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
  
// Function to find the product of  
// nodes of the given linked list  
static int productOfNodes( Node head)  
{  
    // Pointer to traverse the list  
    Node ptr = head;  
  
    int product = 1; // Variable to store product  
  
    // Traverse the list and  
    // calculate the product  
    while (ptr != null) 
    {  
  
        product *= ptr.data;  
        ptr = ptr.next;  
    }  
  
    // Return the product  
    return product;  
}  
  
// Driver Code  
public static void main(String args[]) 
{  
    Node head = null;  
  
    // create linked list 7.6.8.4.1  
    head = push(head, 7);  
    head = push(head, 6);  
    head = push(head, 8);  
    head = push(head, 4);  
    head = push(head, 1);  
  
    System.out.println("Product = " + productOfNodes(head));  
} 
}  
  
// This code is contributed by Arnab Kundu 

