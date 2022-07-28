

// Java implementation of the approach  
class GFG 
{ 
      
// Link list node  
static class Node  
{  
    int data;  
    Node next;  
};  
  
// Function to reverse the linked list in groups of  
//size k and return the pointer to the new head node. / 
static Node reverse( Node head, int k)  
{  
    Node prev = null;  
    Node curr = head;  
    Node temp = null;  
    Node tail = null;  
    Node newHead = null;  
    Node join = null;  
    int t = 0;  
  
    // Traverse till the end of the linked list  
    while (curr != null)  
    {  
        t = k;  
        join = curr;  
        prev = null;  
  
        // Reverse group of k nodes of the linked list  
        while (curr != null && t-- != 0) 
        {  
            temp = curr.next;  
            curr.next = prev;  
            prev = curr;  
            curr = temp;  
        }  
  
        // Sets the new head of the input list  
        if ((newHead == null))  
            newHead = prev;  
  
        /* Tail pointer keeps track of the last node  
        of the k-reversed linked list. We join the  
        tail pointer with the head of the next  
        k-reversed linked list's head */
        if (tail != null)  
            tail.next = prev;  
  
        /* The tail is then updated to the last node  
        of the next k-reverse linked list */
        tail = join;  
    }  
  
    // newHead is new head of the input list / 
    return newHead;  
}  
  
// Function to insert a node at  
// the head of the linked list  
static Node push(Node head_ref, int new_data)  
{  
    // allocate node / 
    Node new_node = new Node();  
  
    // put in the data / 
    new_node.data = new_data;  
  
    // link the old list off the new node / 
    new_node.next = (head_ref);  
  
    // move the head to point to the new node / 
    (head_ref) = new_node; 
    return head_ref; 
}  
  
// Function to print the linked list  
static void printList(Node node)  
{  
    while (node != null)  
    {  
        System.out.print( node.data + " ");  
        node = node.next;  
    }  
}  
  
// Driver code  
public static void main(String args[]) 
{  
  
    // Start with the empty list  
    Node head = null;  
  
    // Created Linked list is  
    // 1.2.3.4.5.6.7.8.9  
    head = push(head, 9);  
    head = push(head, 8);  
    head = push(head, 7);  
    head = push(head, 6);  
    head = push(head, 5);  
    head = push(head, 4);  
    head = push(head, 3);  
    head = push(head, 2);  
    head = push(head, 1);  
  
    int k = 3;  
  
    System.out.print( "Given linked list \n");  
    printList(head);  
    head = reverse(head, k);  
  
    System.out.print( "\nReversed Linked list \n");  
    printList(head);  
} 
}  
  
// This code is contributed by Arnab Kundu 

