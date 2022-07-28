

// Java Program to move last m elements 
// to front in a given linked list 
class GFG  
{ 
    // A linked list node 
    static class Node  
    { 
        int data; 
        Node next; 
    } 
  
    static Node first, last; 
  
    static int length = 0; 
  
    // Function to print nodes 
    // in a given linked list 
    static void printList(Node node) 
    { 
        while (node != null)  
        { 
            System.out.printf("%d ", node.data); 
            node = node.next; 
        } 
    } 
  
    // Pointer head and p are being 
    // used here because, the head 
    // of the linked list is changed in this function. 
    static void moveToFront(Node head, Node p, int m)  
    { 
        // If the linked list is empty, 
        // or it contains only one node, 
        // then nothing needs to be done, simply return 
        if (head == null) 
            return; 
  
        p = head; 
        head = head.next; 
        m++; 
  
        // if m value reaches length, 
        // the recursion will end 
        if (length == m)  
        { 
  
            // breaking the link 
            p.next = null; 
  
            // connecting last to first & 
            // will make another node as head 
            last.next = first; 
  
            // Making the first node of 
            // last m nodes as root 
            first = head; 
        } 
        else
            moveToFront(head, p, m); 
    } 
  
    // UTILITY FUNCTIONS 
  
    // Function to add a node at 
    // the beginning of Linked List 
    static Node push(Node head_ref, int new_data) 
    { 
        // allocate node 
        Node new_node = new Node(); 
  
        // put in the data 
        new_node.data = new_data; 
  
        // link the old list off the new node 
        new_node.next = head_ref; 
  
        // move the head to point to the new node 
        head_ref = new_node; 
  
        // making first & last nodes 
        if (length == 0) 
            last = head_ref; 
        else
            first = head_ref; 
  
        // increase the length 
        length++; 
        return head_ref; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        Node start = null; 
  
        // The constructed linked list is: 
        // 1.2.3.4.5 
        start = push(start, 5); 
        start = push(start, 4); 
        start = push(start, 3); 
        start = push(start, 2); 
        start = push(start, 1); 
        start = push(start, 0); 
  
        System.out.printf("\n Initial Linked list\n"); 
        printList(start); 
        int m = 4; // no.of nodes to change 
        Node temp = new Node(); 
        moveToFront(start, temp, m); 
  
        System.out.printf("\n Final Linked list\n"); 
        start = first; 
        printList(start); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

