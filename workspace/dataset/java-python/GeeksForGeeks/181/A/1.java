

// Java program to check if a given tree is BST. 
class GFG 
{ 
  
/* A binary tree node has data, pointer to  
left child and a pointer to right child */
static class Node  
{ 
    int data; 
    Node left, right; 
  
    Node(int data) 
    { 
        this.data = data; 
        left = right = null; 
    } 
}; 
  
// Utility function to check if Binary Tree is BST 
static boolean isBSTUtil(Node root, int prev) 
{ 
    // traverse the tree in inorder fashion and 
    // keep track of prev node 
    if (root != null)  
    { 
        if (!isBSTUtil(root.left, prev)) 
            return false; 
  
        // Allows only distinct valued nodes 
        if (root.data <= prev) 
            return false; 
  
        // Initialize prev to current 
        prev = root.data; 
  
        return isBSTUtil(root.right, prev); 
    } 
  
    return true; 
} 
  
// Function to check if Binary Tree is BST 
static boolean isBST(Node root) 
{ 
    int prev = Integer.MIN_VALUE; 
    return isBSTUtil(root, prev); 
} 
  
/* Driver code*/
public static void main(String[] args) 
{ 
    Node root = new Node(5); 
    root.left = new Node(2); 
    root.right = new Node(15); 
    root.left.left = new Node(1); 
    root.left.right = new Node(4); 
  
    if (isBST(root)) 
        System.out.print("Is BST"); 
    else
        System.out.print("Not a BST"); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

