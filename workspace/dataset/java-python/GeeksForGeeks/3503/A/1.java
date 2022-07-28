

// A queue based Java program to find  
// maximum product of a level in Binary Tree 
import java.util.*; 
  
class GFG 
{ 
  
/* A binary tree node has data,  
pointer to left child and a 
pointer to right child */
static class Node 
{ 
    int data; 
    Node left, right; 
}; 
  
// Function to find the maximum product  
// of a level in tree using  
// level order traversal 
static int maxLevelProduct(Node root) 
{ 
    // Base case 
    if (root == null) 
        return 0; 
  
    // Initialize result 
    int result = root.data; 
  
    // Do Level order traversal keeping track  
    // of number of nodes at every level. 
    Queue<Node> q = new LinkedList<>(); 
    q.add(root); 
    while (q.size() > 0) 
    { 
  
        // Get the size of queue when the level order 
        // traversal for one level finishes 
        int count = q.size(); 
  
        // Iterate for all the nodes  
        // in the queue currently 
        int product = 1; 
        while (count-->0)  
        { 
  
            // Dequeue an node from queue 
            Node temp = q.peek(); 
            q.remove(); 
  
            // Multiply this node's value 
            // to current product. 
            product = product* temp.data; 
  
            // Enqueue left and right children of 
            // dequeued node 
            if (temp.left != null) 
                q.add(temp.left); 
            if (temp.right != null) 
                q.add(temp.right); 
        } 
  
        // Update the maximum node count value 
        result = Math.max(product, result); 
    } 
    return result; 
} 
  
/* Helper function that allocates  
a new node with the given data and  
null left and right pointers. */
static Node newNode(int data) 
{ 
    Node node = new Node(); 
    node.data = data; 
    node.left = node.right = null; 
    return (node); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    Node root = newNode(1); 
    root.left = newNode(2); 
    root.right = newNode(3); 
    root.left.left = newNode(4); 
    root.left.right = newNode(5); 
    root.right.right = newNode(8); 
    root.right.right.left = newNode(6); 
    root.right.right.right = newNode(7); 
  
    /* Constructed Binary tree is: 
            1 
            / \ 
        2 3 
        / \ \ 
        4 5 8 
                / \ 
            6 7 */
    System.out.print("Maximum level product is " + 
                          maxLevelProduct(root) ); 
} 
} 
  
// This code is contributed by Arnub Kundu 

