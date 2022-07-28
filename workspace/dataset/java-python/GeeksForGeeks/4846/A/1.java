

// Java implementation to create  
// odd doubly linked list  
class GFG 
{ 
  
// Node of the doubly linked list  
static class Node 
{  
    int data;  
    Node prev, next;  
};  
  
// function to insert a node at the beginning  
// of the Doubly Linked List  
static Node push(Node head_ref, int new_data)  
{  
    // allocate node  
    Node new_node = new Node();  
  
    // put in the data  
    new_node.data = new_data;  
  
    // since we are adding at the beginning,  
    // prev is always null  
    new_node.prev = null;  
  
    // link the old list off the new node  
    new_node.next = (head_ref);  
  
    // change prev of head node to new node  
    if ((head_ref) != null)  
        (head_ref).prev = new_node;  
  
    // move the head to point to the new node  
    (head_ref) = new_node;  
    return head_ref; 
}  
  
// function to make all node is odd  
static Node makeOddNode(Node head_ref, int A[], int n)  
{  
    Node ptr = head_ref;  
    Node next;  
    int i = 0;  
    // traves list till last node  
    while (ptr != null)  
    {  
        next = ptr.next;  
          
        // check if node is even then  
        // replace it and incriment in i  
        if (ptr.data % 2 == 0) 
        {  
  
            ptr.data = A[i];  
            i++;  
        }  
        ptr = next;  
    }  
      
    // return sum of nodes which is divided by K  
    return head_ref; 
}  
  
// function to print nodes in a  
// given doubly linked list  
static void printList(Node head)  
{  
    while (head != null) 
    {  
        System.out.print( head.data + " ");  
        head = head.next;  
    }  
}  
  
// Driver code  
public static void main(String args[]) 
{  
    // start with the empty list  
    Node head = null;  
  
    // create the doubly linked list  
    // 6 <=> 9 <=> 8 <=> 7 <=> 4  
    int Arr[] = { 3, 5, 23, 17, 1 };  
    head = push(head, 4);  
    head = push(head, 7);  
    head = push(head, 8);  
    head = push(head, 9);  
    head = push(head, 6);  
    int n = Arr.length;  
    System.out.print( "Original List: ");  
    printList(head);  
    System.out.println();  
    head = makeOddNode(head, Arr, n);  
    System.out.print("New odd List: ");  
    printList(head);  
}  
} 
  
// This code is contributed by Arnab Kundu 

