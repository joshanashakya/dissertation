

// Java implementation to find the product of 
// last 'n' nodes of the Linked List 
  
  
class GFG{ 
  
static int n, prod; 
/* A Linked list node */
static class Node { 
    int data; 
    Node next; 
}; 
  
// function to insert a node at the 
// beginning of the linked list 
static Node push(Node head_ref, int new_data) 
{ 
    /* allocate node */
    Node new_node = new Node(); 
   
    /* put in the data  */
    new_node.data = new_data; 
   
    /* link the old list to the new node */
    new_node.next = head_ref; 
   
    /* move the head to point to the new node */
    head_ref = new_node; 
    return head_ref; 
} 
   
// Function to recursively find the product of last 
// 'n' nodes of the given linked list 
static void productOfLastN_Nodes(Node head) 
{ 
    // if head = null 
    if (head==null) 
        return; 
   
    // recursively traverse the remaining nodes 
    productOfLastN_Nodes(head.next); 
   
    // if node count 'n' is greater than 0 
    if (n > 0) { 
   
        // accumulate sum 
        prod = prod * head.data; 
   
        // reduce node count 'n' by 1 
        --n; 
    } 
} 
   
// utility function to find the product of last 'n' nodes 
static int productOfLastN_NodesUtil(Node head) 
{ 
    // if n == 0 
    if (n <= 0) 
     return 0; 
   
    prod = 1; 
   
    // find the sum of last 'n' nodes 
    productOfLastN_Nodes(head); 
   
    // required product 
    return prod; 
} 
   
// Driver program to test above 
public static void main(String[] args) 
{ 
    Node head = null; 
   
 // create linked list 10->6->8->4->12 
    head = push(head, 12); 
    head = push(head, 4); 
    head = push(head, 8); 
    head = push(head, 6); 
    head = push(head, 10); 
   
    n = 2; 
    System.out.print(productOfLastN_NodesUtil(head)); 
} 
} 
  
//This code is contributed by 29AjayKumar 

