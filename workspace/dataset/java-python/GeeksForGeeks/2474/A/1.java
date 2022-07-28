

// Java program to calculate sum and product from  
// singly circular linked list nodes  
// which are divisible by given key  
import java.util.*; 
class Solution 
{ 
    
// Circular list node  
static class Node {  
    int data;  
    Node next;  
}  
    
// Function to calculate sum and product  
static void sumProduct( Node head, int key)  
{  
         Node current = head;  
    
    int sum = 0, product = 1;  
    
    // if list is empty simply show message  
    if (head == null) {  
        System.out.print("\nDisplay List is empty\n");  
        return;  
    }  
    // traverse first to last node  
    else {  
        do {  
            // check if current node's data is  
            // divisible by key  
            if ((current.data) % key == 0) {  
    
                // Calculate sum  
                sum += current.data;  
    
                // Calculate product  
                product = current.data;  
            }  
    
            current = current.next;  
        } while (current != head);  
    }  
    
    System.out.print( "Sum = " + sum + ", Product = " + product);  
}  
    
// Function print the list  
static void displayList( Node head)  
{  
     Node current = head;  
    
    // if list is empty simply show message  
    if (head == null) {  
        System.out.print("\nDisplay List is empty\n");  
        return;  
    }  
    // traverse first to last node  
    else {  
        do {  
            System.out.print( current.data+" ");  
            current = current.next;  
        } while (current != head);  
    }  
}  
    
// Function to insert a node at the end of  
// a Circular linked list  
static Node InsertNode( Node head, int data)  
{  
     Node current = head;  
    // Create a new node  
     Node newNode = new Node();  
    
    // check node is created or not  
    if (newNode==null) {  
       System.out.print("\nMemory Error\n");  
        return head;  
    }  
    
    // insert data into newly created node  
    newNode.data = data;  
    
    // check list is empty  
    // if not have any node then  
    // make first node it  
    if (head == null) {  
        newNode.next = newNode;  
        head = newNode;  
        return head;  
    }  
    // if list have already some node  
    else {  
    
        // move firt node to last node  
        while (current.next != head) {  
            current = current.next;  
        }  
    
        // put first or head node address in new node link  
        newNode.next = head;  
    
        // put new node address into last node link(next)  
        current.next = newNode;  
    }  
    return head; 
}  
    
// Driver Code  
public static void main(String args[]) 
{  
     Node head=null ;  
    head =InsertNode(head, 5);  
    head =InsertNode(head, 6);  
    head =InsertNode(head, 7);  
    head =InsertNode(head, 8);  
    head =InsertNode(head, 9);  
    head =InsertNode(head, 10);  
    head =InsertNode(head, 11);  
    head =InsertNode(head, 11);  
    
    System.out.print( "Initial List: ");  
    displayList(head);  
    
    System.out.println();  
    sumProduct(head, 11);  
     
} 
} 
//contributed by Arnab Kundu 

