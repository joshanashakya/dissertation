

// JAVA program to print minimum element 
// in each level of binary tree. 
import java.util.*; 
  
class GFG 
{ 
  
// A Binary Tree Node 
static class Node  
{ 
    int data; 
    Node left, right; 
}; 
  
// return height of tree 
static int heightoftree(Node root) 
{ 
  
    if (root == null) 
        return 0; 
  
    int left = heightoftree(root.left); 
    int right = heightoftree(root.right); 
  
    return ((left > right ? left : right) + 1); 
} 
  
// Iterative method to find every level 
// minimum element of Binary Tree 
static void printPerLevelMinimum(Node root) 
{ 
  
    // Base Case 
    if (root == null) 
        return ; 
  
    // Create an empty queue for  
    // level order traversal 
    Queue<Node> q = new LinkedList<Node>(); 
  
    // push the root for Change the level 
    q.add(root); 
  
    // for go level by level 
    q.add(null); 
  
    int min = Integer.MAX_VALUE; 
    // for check the level 
    int level = 0; 
  
    while (q.isEmpty() == false) 
    { 
  
        // Get top of queue 
        Node node = q.peek(); 
        q.remove(); 
  
        // if node == null (Means this is  
        // boundary between two levels) 
        if (node == null) 
        { 
  
            System.out.print("level " + level +  
            " min is = " + min+ "\n"); 
  
            // here queue is empty represent 
            // no element in the actual 
            // queue 
            if (q.isEmpty()) 
                break; 
  
            q.add(null); 
  
            // increment level 
            level++; 
  
            // Reset min for next level  
            // minimum value 
            min = Integer.MAX_VALUE; 
  
            continue; 
        } 
  
        // get Minimum in every level 
        if (min > node.data) 
            min = node.data; 
  
        /* Enqueue left child */
        if (node.left != null)  
        { 
            q.add(node.left); 
        } 
  
        /*Enqueue right child */
        if (node.right != null) 
        { 
            q.add(node.right); 
        } 
    } 
} 
  
// Utility function to create a  
// new tree node 
static Node newNode(int data) 
{ 
      
    Node temp = new Node(); 
    temp.data = data; 
    temp.left = temp.right = null; 
      
    return temp; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
      
    // Let us create binary tree shown  
    // in above diagram 
    Node root = newNode(7); 
    root.left = newNode(6); 
    root.right = newNode(5); 
    root.left.left = newNode(4); 
    root.left.right = newNode(3); 
    root.right.left = newNode(2); 
    root.right.right = newNode(1); 
  
    /*     7 
        / \ 
    6 5 
    / \ / \ 
    4 3 2 1         */
  
    System.out.print("Every Level minimum is"
    + "\n"); 
          
    printPerLevelMinimum(root); 
      
} 
} 
  
// This code is contributed by Rajput-Ji 

