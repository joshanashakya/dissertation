

// Java implementation to delete all  
// non-prime nodes from the singly  
// linked list 
class GFG 
{ 
      
// Node of the singly linked list  
static class Node 
{  
    int data;  
    Node next;  
};  
  
// function to insert a node at the beginning  
// of the singly Linked List  
static Node push(Node head_ref, int new_data)  
{  
    Node new_node = new Node();  
    new_node.data = new_data;  
    new_node.next = (head_ref);  
    (head_ref) = new_node;  
    return head_ref; 
}  
  
// Function to check if a number is prime  
static boolean isPrime(int n)  
{  
    // Corner cases  
    if (n <= 1)  
        return false;  
    if (n <= 3)  
        return true;  
  
    // This is checked so that we can skip  
    // middle five numbers in below loop  
    if (n % 2 == 0 || n % 3 == 0)  
        return false;  
  
    for (int i = 5; i * i <= n; i = i + 6)  
        if (n % i == 0 || n % (i + 2) == 0)  
            return false;  
  
    return true;  
}  
  
// function to delete all non-prime nodes  
// from the singly linked list  
static Node deleteNonPrimeNodes(Node head_ref)  
{  
    // Remove all composite nodes at the beginning  
    Node ptr = head_ref;  
    while (ptr != null && !isPrime(ptr.data))  
    {  
        Node temp = ptr;  
        ptr = ptr.next;  
    }  
    head_ref = ptr;  
    if (ptr == null)  
        return null;  
  
    // Remove remaining nodes  
    Node curr = ptr.next;  
    while (curr != null)  
    {  
  
        if (!isPrime(curr.data))  
        {  
            ptr.next = curr.next;  
            curr = ptr.next;  
        }  
        else
        {  
            ptr = curr;  
            curr = curr.next;  
        }  
    }  
    return head_ref; 
}  
  
// function to print nodes in a  
// given singly linked list  
static void printList(Node head)  
{  
    while (head != null) 
    {  
        System.out.print(head.data + " ");  
        head = head.next;  
    }  
}  
  
// Driver code  
public static void main(String args[])  
{  
    // start with the empty list  
    Node head = null;  
  
    // create the linked list  
    // 15 . 16 . 7 . 6 . 17  
    head = push(head, 17);  
    head = push(head, 7);  
    head = push(head, 6);  
    head = push(head, 16);  
    head = push(head, 15);  
  
    System.out.print("Original List: ");  
    printList(head);  
  
    head = deleteNonPrimeNodes(head);  
  
    System.out.print("\nModified List: ");  
    printList(head);  
}  
} 
  
// This code is contributed by Arnab Kundu 

