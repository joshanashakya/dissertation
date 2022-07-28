

// Java program to find the length of longest 
// path with same values in a binary tree. 
class GFG 
{ 
static int ans; 
  
/* A binary tree node has data, pointer to 
left child and a pointer to right child */
static class Node  
{ 
    int val; 
    Node left, right; 
}; 
  
/* Function to print the longest path 
of same values */
static int length(Node node)  
{ 
    if (node == null) 
        return 0; 
      
    // Recursive calls to check for subtrees 
    int left = length(node.left); 
    int right = length(node.right); 
      
    // Variables to store maximum lengths 
    // in two directions 
    int Leftmax = 0, Rightmax = 0; 
      
    // If curr node and it's left child 
    // has same value 
    if (node.left != null && 
        node.left.val == node.val)  
        Leftmax += left + 1;  
      
    // If curr node and it's right child 
    // has same value 
    if (node.right != null &&  
        node.right.val == node.val)  
        Rightmax += right + 1; 
          
    ans = Math.max(ans, Leftmax + Rightmax); 
    return Math.max(Leftmax, Rightmax); 
} 
  
// Function to find length of 
// longest same value path 
static int longestSameValuePath(Node root)  
{ 
    ans = 0; 
    length(root); 
    return ans; 
} 
  
/* Helper function that allocates a 
new node with the given data and 
null left and right pointers. */
static Node newNode(int data)  
{ 
    Node temp = new Node(); 
    temp.val = data; 
    temp.left = temp.right = null; 
    return temp; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
      
    /* Let us cona Binary Tree 
            4 
        / \ 
        4 4 
        / \ \ 
        4 9 5 */
    Node root = null; 
    root = newNode(4); 
    root.left = newNode(4); 
    root.right = newNode(4); 
    root.left.left = newNode(4); 
    root.left.right = newNode(9); 
    root.right.right = newNode(5); 
    System.out.print(longestSameValuePath(root)); 
} 
}  
  
// This code is contributed by PrinciRaj1992 

