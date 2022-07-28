

// Java program to find closest value in 
// a Binary Search Tree. 
class GFG  
{ 
  
  
// Tree Node 
static class Node  
{ 
    int data; 
    Node left, right; 
}; 
  
// Utility function to create a new Node 
static Node newNode(int data) 
{ 
    Node temp = new Node(); 
    temp.data = data; 
    temp.left = temp.right = null; 
    return temp; 
} 
  
// Function to find the Node closest to the  
// given key in BST using Morris Traversal 
static Node closestNodeUsingMorrisTraversal(Node root,  
                                        int key) 
{ 
    int diff = Integer.MAX_VALUE; 
    Node curr = root; 
    Node closest = null; 
  
    while (curr != null)  
    { 
        if (curr.left == null)  
        { 
  
            // updating diff if the current diff is 
            // smaller than prev difference 
            if (diff > Math.abs(curr.data - key))  
            { 
                diff = Math.abs(curr.data - key); 
                closest = curr; 
            } 
  
            curr = curr.right; 
        } 
  
        else
        { 
  
            // finding the inorder predecessor 
            Node pre = curr.left; 
            while (pre.right != null && 
                pre.right != curr) 
                pre = pre.right; 
  
            if (pre.right == null)  
            { 
                pre.right = curr; 
                curr = curr.left; 
            } 
  
            // threaded link between curr and 
            // its predecessor already exists 
            else
            { 
                pre.right = null; 
  
                // if a closer Node found, then update  
                // the diff and set closest to current 
                if (diff > Math.abs(curr.data - key))  
                { 
                    diff = Math.abs(curr.data - key); 
                    closest = curr; 
                } 
  
                // moving to the right child 
                curr = curr.right; 
            } 
        } 
    } 
  
    return closest; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    /* Constructed binary tree is 
        5 
        / \ 
    3     9 
    / \ / \ 
    1 2 8 12 */
    Node root = newNode(5); 
    root.left = newNode(3); 
    root.right = newNode(9); 
    root.left.left = newNode(1); 
    root.left.right = newNode(2); 
    root.right.left = newNode(8); 
    root.right.right = newNode(12); 
  
    System.out.println(closestNodeUsingMorrisTraversal(root, 10).data); 
} 
} 
  
// This code is contributed by Rajput-Ji 

