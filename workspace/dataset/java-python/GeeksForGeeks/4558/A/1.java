

// Java program to replace the nodes 
// with their surpasser count 
  
class GFG { 
  
// A linked list node 
static class Node { 
    int data; 
    Node next; 
}; 
   
// Utility function to create a new Node 
static Node newNode(int data) 
{ 
    Node temp = new Node(); 
    temp.data = data; 
    temp.next = null; 
   
    return temp; 
} 
   
// Function to display the linked list 
static void printList(Node node) 
{ 
    while (node != null) { 
        System.out.print(node.data+" "); 
   
        node = node.next; 
    } 
} 
   
// Function to check Surpasser Count 
static void replaceNodes(Node head) 
{ 
    // Pointer used to traverse through 
    // all the nodes in the list 
    Node p = head; 
   
    // Pointer used to traverse through the right 
    // elements to count the greater elements 
    Node x = null; 
   
    // Variable to count the number of 
    // elements greater than the 
    // current element on right 
    int count = 0; 
   
    int i; 
   
    // Traverse through all the elements 
    // in the list 
    while (p != null) { 
   
        count = 0; 
   
        i = 0; 
   
        // Initialize x to current node 
        x = p; 
   
        // Check or count the number of nodes 
        // that are greater than the current 
        // node on right 
        while (x != null) { 
   
            if (x.data > p.data) 
                count++; 
   
            x = x.next; 
        } 
   
        // Replace the node data with the 
        // count of elements greater than 
        // the current element 
        p.data = count; 
        p = p.next; 
    } 
} 
   
// Driver code 
public static void main(String[] args) { 
  // Creating the linked list 
    Node head = newNode(10); 
    head.next = newNode(12); 
    head.next.next = newNode(5); 
    head.next.next.next = newNode(40); 
    head.next.next.next.next = newNode(21); 
    head.next.next.next.next.next = newNode(70); 
    head.next.next.next.next.next.next = newNode(1); 
    head.next.next.next.next.next.next.next = newNode(49); 
    head.next.next.next.next.next.next.next.next = newNode(37); 
   
    replaceNodes(head); 
   
    printList(head); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

