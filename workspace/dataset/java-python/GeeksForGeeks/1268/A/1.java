

// Java program to check children sum property  
import java.util.*; 
class GFG 
{ 
  
// A binary tree node  
static class Node  
{  
    int data;  
    Node left, right;  
}  
  
// Utility function to allocate memory for a new node  
static Node newNode(int data)  
{  
    Node node = new Node();  
    node.data = data;  
    node.left = node.right = null;  
    return (node);  
}  
  
// Function to check if the tree holds  
// children sum property  
static boolean CheckChildrenSum(Node root)  
{  
    Queue<Node> q = new LinkedList<Node>();  
  
    // add the root node  
    q.add(root);  
  
    while (q.size() > 0) 
    {  
        Node temp = q.peek();  
        q.remove();  
  
        // If the current node has both left and right children  
        if (temp.left != null && temp.right != null) 
        {  
            // If the current node is not equal to  
            // the sum of its left and right children  
            // return false  
            if (temp.data != temp.left.data + temp.right.data)  
                return false;  
  
            q.add(temp.left);  
            q.add(temp.right);  
        }  
  
        // If the current node has right child  
        else if (temp.left == null && temp.right != null) 
        {  
            // If the current node is not equal to  
            // its right child return false  
            if (temp.data != temp.right.data)  
                return false;  
  
            q.add(temp.right);  
        }  
  
        // If the current node has left child  
        else if (temp.right == null && temp.left != null)  
        {  
            // If the current node is not equal to  
            // its left child return false  
            if (temp.data != temp.left.data)  
                return false;  
  
            q.add(temp.left);  
        }  
    }  
  
    // If the given tree has children  
    // sum property return true  
    return true;  
}  
  
// Driver code  
public static void main(String args[]) 
{  
    Node root = newNode(10);  
    root.left = newNode(8);  
    root.right = newNode(2);  
    root.left.left = newNode(3);  
    root.left.right = newNode(5);  
    root.right.right = newNode(2);  
  
    if (CheckChildrenSum(root))  
        System.out.printf("Yes");  
    else
        System.out.printf("No");  
} 
} 
  
// This code is contributed by Arnab Kundu 

