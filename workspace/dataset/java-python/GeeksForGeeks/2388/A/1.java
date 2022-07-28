

// Java program to find the sum of 
// all nodes of a Circular linked list  
import java.util.*; 
  
class GFG 
{ 
  
// structure for a node  
static class Node  
{  
    int data;  
    Node next;  
};  
  
// Function to insert a node  
// at the beginning of a  
// Circular linked list  
static Node push(Node head_ref,  
                      int data)  
{  
    Node ptr1 = new Node();  
    Node temp = head_ref;  
    ptr1.data = data;  
    ptr1.next = head_ref;  
  
    // If linked list is not null then  
    // set the next of last node  
    if (head_ref != null)  
    {  
        while (temp.next != head_ref)  
            temp = temp.next;  
        temp.next = ptr1;  
    }  
    else
        ptr1.next = ptr1; // For the first node  
  
    head_ref = ptr1;  
      
    return head_ref; 
}  
  
// Function to find sum of the  
// given Circular linked list  
static int sumOfList(Node head)  
{  
    Node temp = head;  
    int sum = 0;  
    if (head != null)  
    {  
        do 
        {  
            temp = temp.next;  
            sum += temp.data;  
        } while (temp != head);  
    }  
  
    return sum;  
}  
  
// Driver code  
public static void main(String args[]) 
{  
    // Initialize lists as empty  
    Node head = null;  
  
    // Created linked list will 
    // be 11.2.56.12  
    head = push(head, 12);  
    head = push(head, 56);  
    head = push(head, 2);  
    head = push(head, 11);  
  
    System.out.println("Sum of Circular linked" +  
                " list is = " + sumOfList(head));  
}  
} 
  
// This code is contributed by Arnab Kundu 

