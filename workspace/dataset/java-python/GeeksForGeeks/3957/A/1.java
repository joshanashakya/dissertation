

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Structure to hold the contents 
// of the new node 
static class node  
{ 
    int data; 
    node left, right; 
} 
static node root1 = null; 
  
// Helper function to add and 
// return the newly added node 
static node add(int data) 
{ 
    node newnode = new node(); 
    newnode.data = data; 
    newnode.left = newnode.right = null; 
    return newnode; 
} 
  
// Function to add a node to the 
// Binary Tree in the level order 
static void addinBT(int data) 
{ 
  
    // If it is the first node 
    // to be added then make 
    // it the root node 
    if (root1 == null) 
        root1 = add(data); 
    else 
    { 
        Queue<node> Q = new LinkedList<>(); 
        Q.add(root1); 
        while (!Q.isEmpty())  
        { 
  
            // Get and remove the front 
            node temp = Q.peek(); 
            Q.remove(); 
  
            // If the left child of the current 
            // node is null then create the new 
            // node here and break 
            if (temp.left == null)  
            { 
                temp.left = add(data); 
                break; 
            } 
            else
                Q.add(temp.left); 
  
            // If the right child of the current 
            // node is null then create the new 
            // node here and break 
            if (temp.right == null) 
            { 
                temp.right = add(data); 
                break; 
            } 
            else
                Q.add(temp.right); 
        } 
    } 
} 
  
// Function to add a node to 
// the Binary Search tree 
static node addinBST(node root, int data) 
{ 
  
    // If the current node is null 
    // then create a new node here 
    // with the given data 
    if (root == null) 
        root = add(data); 
  
    // If the data is smaller than the 
    // current node's data then recur 
    // for the left sub-tree 
    else if (data < root.data) 
        root.left = addinBST(root.left, data); 
  
    // Else recur for the right sub-tree 
    else
        root.right = addinBST(root.right, 
                                   data); 
    return root; 
} 
  
// Function to perform a level order 
// insertion in the Binary Tree from 
// the given Binary Search tree 
static void addinorder(node root) 
{ 
    if (root == null) 
        return; 
    addinorder(root.left); 
    addinBT(root.data); 
    addinorder(root.right); 
} 
  
// Function to print the level order 
// traversal of the binary tree 
static void printlvl() 
{ 
    Queue<node> Q = new LinkedList<>(); 
  
    // Push root to the queue 
    Q.add(root1); 
    while (!Q.isEmpty())  
    { 
  
        // Get the front 
        node temp = Q.peek(); 
  
        // Remove the front 
        Q.remove(); 
  
        // Print the data 
        System.out.print(temp.data + " "); 
  
        // Push the left child 
        if (temp.left != null) 
            Q.add(temp.left); 
  
        // Push the right child 
        if (temp.right != null) 
            Q.add(temp.right); 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    // Create the Binary Search Tree 
    node root = null; 
    root = addinBST(root, 1); 
    root = addinBST(root, 2); 
    root = addinBST(root, 3); 
    root = addinBST(root, 4); 
    root = addinBST(root, 5); 
  
    // Add nodes of the Binary Search 
    // Tree to the Binary Tree 
    addinorder(root); 
  
    // Print the level order traversal 
    // of the Binary Tree 
    printlvl(); 
} 
} 
  
// This code is contributed by Rajput-Ji 

