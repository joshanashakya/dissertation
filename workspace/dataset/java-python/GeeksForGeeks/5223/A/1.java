

// Java program to find XOR of path between  
// any two nodes in a Binary Tree  
import java.util.*; 
class Solution 
{ 
  
// structure of a node of binary tree  
static class Node {  
    int data;  
    Node left, right;  
}  
  
/* Helper function that allocates a new node with the  
given data and null left and right pointers. */
 static Node getNode(int data)  
{  
     Node newNode = new Node();  
    newNode.data = data;  
    newNode.left = newNode.right = null;  
    return newNode;  
}  
  
// Function to store XOR of path from  
// root to every node  
// mp[x] will store XOR of path from root to node x  
static void storePath(Node root, Map<Integer, Integer> mp, int XOR)  
{  
    // if root is null  
    // there is no path  
    if (root==null)  
        return;  
  
    mp.put(root.data, XOR ^ root.data);  
  
    XOR ^= root.data;  
  
    if (root.left!=null)  
        storePath(root.left, mp, XOR);  
  
    if (root.right!=null)  
        storePath(root.right, mp, XOR);  
}  
  
// Function to get XOR of nodes between any two nodes  
static int findXORPath(Map<Integer, Integer> mp, int node1, int node2)  
{  
    return mp.get(node1) ^ mp.get(node2);  
}  
  
// Driver Code  
public static void main(String args[]) 
{  
    // binary tree formation  
     Node root = getNode(0);  
    root.left = getNode(1);  
    root.left.left = getNode(3);  
    root.left.left.left = getNode(7);  
    root.left.right = getNode(4);  
    root.left.right.left = getNode(8);  
    root.left.right.right = getNode(9);  
    root.right = getNode(2);  
    root.right.left = getNode(5);  
    root.right.right = getNode(6);  
  
    int XOR = 0;  
    Map<Integer, Integer> mp= new HashMap<Integer, Integer>();  
  
    int node1 = 3;  
    int node2 = 5;  
  
    // Store XOR path from root to every node  
    storePath(root, mp, XOR);  
  
    System.out.println( findXORPath(mp, node1, node2));  
  
}  
} 
//contributed by Arnab Kundu 

