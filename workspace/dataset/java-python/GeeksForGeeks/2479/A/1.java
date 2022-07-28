

// Java implementation to find the product  
// of last 'n' nodes of the Linked List 
import java.util.*; 
  
class GFG  
{ 
  
/* A Linked list node */
static class Node  
{ 
    int data; 
    Node next; 
}; 
static Node head; 
  
// function to insert a node at the 
// beginning of the linked list 
static void push(Node head_ref,  
                int new_data) 
{ 
    /* allocate node */
    Node new_node = new Node(); 
  
    /* put in the data */
    new_node.data = new_data; 
  
    /* link the old list to the new node */
    new_node.next = (head_ref); 
  
    /* move the head to point to the new node */
    (head_ref) = new_node; 
    head = head_ref; 
} 
  
// utility function to find the product  
// of last 'n' nodes 
static int productOfLastN_NodesUtil(Node head, 
                                        int n) 
{ 
    // if n == 0 
    if (n <= 0) 
        return 0; 
  
    Stack<Integer> st = new Stack<Integer>(); 
    int prod = 1; 
  
    // traverses the list from left to right 
    while (head != null)  
    { 
  
        // push the node's data 
        // onto the stack 'st' 
        st.push(head.data); 
  
        // move to next node 
        head = head.next; 
    } 
  
    // pop 'n' nodes from 'st' and 
    // add them 
    while (n-- >0)  
    { 
        prod *= st.peek(); 
        st.pop(); 
    } 
  
    // required product 
    return prod; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    head = null; 
  
    // create linked list 10->6->8->4->12 
    push(head, 12); 
    push(head, 4); 
    push(head, 8); 
    push(head, 6); 
    push(head, 10); 
  
    int n = 2; 
    System.out.println(productOfLastN_NodesUtil(head, n)); 
} 
} 
  
// This code is contributed by PrinciRaj1992  

