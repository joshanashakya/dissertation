

// Java program to check if the  
// given binary tree is perfect  
import java.util.*; 
  
class GFG 
{ 
      
// A binary tree node  
static class Node  
{  
    int data;  
    Node left, right;  
};  
  
// Utility function to allocate memory for a new node  
static Node newNode(int data)  
{  
    Node node = new Node();  
    node.data = data;  
    node.left = node.right = null;  
    return (node);  
}  
  
// Function to check if the given tree is perfect  
static boolean CheckPerfectTree(Node root)  
{  
    Queue<Node> q = new LinkedList<Node>();  
  
    // add the root node  
    q.add(root);  
  
    // Flag to check if leaf nodes have been found  
    int flag = 0;  
  
    while (q.size() > 0) 
    {  
        Node temp = q.peek();  
        q.remove();  
  
        // If current node has both left and right child  
        if (temp.left != null && temp.right != null)  
        {  
            // If a leaf node has already been found  
            // then return false  
            if (flag == 1)  
                return false;  
  
            // If a leaf node has not been discovered yet  
            // add the left and right child in the queue  
            else
            {  
                q.add(temp.left);  
                q.add(temp.right);  
            }  
        }  
  
        // If a leaf node is found mark flag as one  
        else if (temp.left == null && temp.right == null)  
        {  
            flag = 1;  
        }  
  
        // If the current node has only one child  
        // then return false  
        else if (temp.left == null || temp.right == null)  
            return false;  
    }  
  
    // If the given tree is perfect return true  
    return true;  
}  
  
// Driver code  
public static void main(String args[]) 
{  
    Node root = newNode(7);  
    root.left = newNode(5);  
    root.right = newNode(6);  
    root.left.left = newNode(8);  
    root.left.right = newNode(1);  
    root.right.left = newNode(3);  
    root.right.right = newNode(9);  
    root.right.right.right = newNode(13);  
    root.right.right.left = newNode(10);  
  
    if (CheckPerfectTree(root))  
        System.out.printf("Yes");  
    else
        System.out.printf("No");  
}  
} 
  
// This code is contributed by Arnab Kundu 

