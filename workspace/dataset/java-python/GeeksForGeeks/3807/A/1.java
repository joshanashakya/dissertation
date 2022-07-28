

// Java program to find count of minimum 
// frequqncy elements in Linked list 
import java.util.*; 
  
class GFG 
{ 
  
/* Link list node */
static class Node { 
    int key; 
    Node next; 
}; 
  
/* Given a reference (pointer to pointer) to the head  
of a list and an int, push a new node on the front  
of the list. */
static Node push(Node head_ref, int new_key) 
{ 
    Node new_node = new Node(); 
    new_node.key = new_key; 
    new_node.next = (head_ref); 
    (head_ref) = new_node; 
    return head_ref; 
} 
  
// Function to count minimum frequency elements 
// in the linked list 
static int countMinimum( Node head) 
{ 
    // Store frequencies of all nodes. 
    HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>(); 
    Node current = head; 
    while (current != null) 
    { 
        int data = current.key; 
        mp.put(data, (mp.get(data) == null ? 1:mp.get(data) + 1)); 
        current = current.next; 
    } 
  
    // Find min frequency 
    current = head; 
    int min_frequency = Integer.MAX_VALUE, countMin = 0; 
    for (Map.Entry<Integer,Integer> it :mp.entrySet())  
    { 
        if (it.getValue() <= min_frequency) 
        { 
            min_frequency = it.getValue(); 
        } 
    } 
  
    // Find count of min frequency elements 
    for (Map.Entry<Integer,Integer> it :mp.entrySet())  
    { 
        if (it.getValue() == min_frequency) 
        { 
            countMin += (it.getValue()); 
        } 
    } 
  
    return countMin; 
} 
  
/* Driver code*/
public static void main(String args[]) 
{ 
    /* Start with the empty list */
    Node head = null; 
    int x = 21; 
  
    /* Use push() to construct below list  
    10.10.11.30.10 */
    head = push(head, 10); 
    head = push(head, 30); 
    head = push(head, 11); 
    head = push(head, 10); 
    head = push(head, 10); 
  
    System.out.println( countMinimum(head) ); 
} 
} 
  
// This code is contributed by andrew1234 

