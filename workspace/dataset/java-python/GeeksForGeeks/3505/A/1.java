

// A recursive java program to find difference between sum of nodes at 
// odd level and sum at even level 
   
// A binary tree node 
class Node  
{ 
    int data; 
    Node left, right; 
   
    Node(int item)  
    { 
        data = item; 
        left = right; 
    } 
} 
   
class BinaryTree  
{ 
    // The main function that return difference between odd and even level 
    // nodes 
    Node root; 
   
    int getLevelDiff(Node node)  
    { 
        // Base case 
        if (node == null) 
            return 0; 
  
        // Difference for root is root's data - difference for  
        // left subtree - difference for right subtree 
        return node.data - getLevelDiff(node.left) -  
                                              getLevelDiff(node.right); 
    } 
   
    // Driver program to test above functions 
    public static void main(String args[])  
    { 
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(5); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(6); 
        tree.root.left.left = new Node(1); 
        tree.root.left.right = new Node(4); 
        tree.root.left.right.left = new Node(3); 
        tree.root.right.right = new Node(8); 
        tree.root.right.right.right = new Node(9); 
        tree.root.right.right.left = new Node(7); 
        System.out.println(tree.getLevelDiff(tree.root) +   
                                             " is the required difference"); 
   
    } 
} 
   
// This code has been contributed by Mayank Jaiswal 

