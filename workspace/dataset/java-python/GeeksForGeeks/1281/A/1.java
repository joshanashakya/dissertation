

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
static Node prev; 
  
static boolean isBSTUtil(Node root) 
{ 
    // traverse the tree in inorder fashion and  
    // keep track of prev node 
    if (root != null) 
    { 
        if (!isBSTUtil(root.left)) 
        return false; 
  
        // Allows only distinct valued nodes  
        if (prev != null && root.data <= prev.data) 
        return false; 
  
        prev = root; 
  
        return isBSTUtil(root.right); 
    } 
    return true; 
} 
  
static boolean isBST(Node root) 
{ 
    return isBSTUtil(root); 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    Node root = new Node(3); 
    root.left     = new Node(2); 
    root.right     = new Node(5); 
    root.left.left = new Node(1); 
    root.left.right = new Node(4); 
  
    if (isBST(root)) 
        System.out.print("Is BST"); 
    else
        System.out.print("Not a BST"); 
} 
} 
  
// This code is contributed by Rajput-Ji 

