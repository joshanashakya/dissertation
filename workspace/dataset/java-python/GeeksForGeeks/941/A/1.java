

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// A linked list node 
static class Node 
{ 
    int data; 
    Node next; 
    Node(int data) 
    { 
        this.data = data; 
        this.next = null; 
    } 
}; 
  
// A binary tree node 
static class treeNode 
{ 
    int data; 
    treeNode left; 
    treeNode right; 
    treeNode(int data) 
    { 
        this.data = data; 
        this.left = null; 
        this.right = null; 
    } 
}; 
  
// Function to print the linked list 
static void print(Node head) 
{ 
    if (head == null)  
    { 
        return; 
    } 
    Node temp = head; 
    while (temp != null) 
    { 
        System.out.print(temp.data + " "); 
        temp = temp.next; 
    } 
} 
  
// Function to create Linked list from given binary tree 
static Node sortedList(Node head, treeNode root) 
{ 
    // return head if root is null 
    if (root == null)  
    { 
        return head; 
    } 
  
    // First make the sorted linked list 
    // of the left sub-tree 
    head = sortedList(head, root.left); 
    Node newNode = new Node(root.data); 
    Node temp = head; 
    Node prev = null; 
  
    // If linked list is empty add the 
    // node to the head 
    if (temp == null)  
    { 
        head = newNode; 
    } 
    else
    { 
  
        // Find the correct position of the node 
        // in the given linked list 
        while (temp != null) 
        { 
            if (temp.data > root.data)  
            { 
                break; 
            } 
            else 
            { 
                prev = temp; 
                temp = temp.next; 
            } 
        } 
  
        // Given node is to be attached 
        // at the end of the list 
        if (temp == null) 
        { 
            prev.next = newNode; 
        } 
        else 
        { 
  
            // Given node is to be attached 
            // at the head of the list 
            if (prev == null)  
            { 
                newNode.next = temp; 
                head = newNode; 
            } 
            else
            { 
  
                // Insertion in between the list 
                newNode.next = temp; 
                prev.next = newNode; 
            } 
        } 
    } 
  
    // Now add the nodes of the right sub-tree 
    // to the sorted linked list 
    head = sortedList(head, root.right); 
    return head; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    /* Tree: 
        10 
        / \ 
    15 2 
    / \ 
    1 5 
*/
    treeNode root = new treeNode(10); 
    root.left = new treeNode(15); 
    root.right = new treeNode(2); 
    root.left.left = new treeNode(1); 
    root.left.right = new treeNode(5); 
  
    Node head = sortedList(null, root); 
    print(head); 
} 
} 
  
// This code is contributed by 29AjayKumar 

