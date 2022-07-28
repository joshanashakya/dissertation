

// Java Program to Find the Unique elements  
// in linked lists 
import java.util.*; 
class GFG  
{ 
  
/* Linked list node */
static class Node 
{ 
    int data; 
    Node next; 
}; 
static Node head; 
  
/* Function to insert a node at the 
beginning of the linked list */
static void push(Node head_ref, int new_data) 
{ 
    Node new_node = new Node(); 
    new_node.data = new_data; 
    new_node.next = head_ref; 
    head_ref = new_node; 
    head = head_ref; 
} 
  
// function to Find the unique elements 
// in linked lists 
static void uniqueElements(Node head) 
{ 
    // Initialize hash array that store the 
    // frequency of each element of list 
    HashMap<Integer,  
            Integer> hash = new HashMap<Integer,  
                                        Integer>(); 
  
    for (Node temp = head;  
              temp != null; temp = temp.next) 
    { 
        if(hash.containsKey(temp.data)) 
        { 
            hash.put(temp.data,  
            hash.get(temp.data) + 1); 
        } 
        else
        { 
            hash.put(temp.data, 1); 
        } 
    } 
  
    int count = 0; 
    for (Node temp = head;  
              temp != null; temp = temp.next)  
    { 
  
        // Check whether the frequency of current  
        // element is 1 or not 
        if (hash.get(temp.data) == 1)  
        { 
            System.out.print(temp.data + " "); 
            count++; 
        } 
    } 
  
    // If No unique element in list 
    if (count == 0) 
        System.out.print(" No Unique Elements "); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    head = null; 
  
    // creating linked list 
    push(head, 5); 
    push(head, 4); 
    push(head, 3); 
    push(head, 5); 
    push(head, 3); 
    push(head, 2); 
    push(head, 4); 
    push(head, 4); 
    push(head, 1); 
    uniqueElements(head); 
} 
}  
  
// This code is contributed by Rajput-Ji 

