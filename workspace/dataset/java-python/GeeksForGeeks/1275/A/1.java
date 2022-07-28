

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{ 
      
// A tree node  
static class Node  
{  
    int key;  
    Node left, right;  
};  
  
// Utility function to create new Node  
static Node newNode(int key)  
{  
    Node temp = new Node();  
    temp.key = key;  
    temp.left = temp.right = null;  
    return (temp);  
}  
  
// Utility function to perform  
// inorder traversal of the tree  
static void inorder(Node root)  
{  
    if (root != null)  
    {  
        inorder(root.left);  
        System.out.print( root.key + " ");  
        inorder(root.right);  
    }  
}  
  
// Function to construct a Binary Tree from parent array  
static Node createTree(int parent[], int n)  
{  
    // A map to keep track of all the nodes created.  
    // Key: node value; Value: Pointer to that Node  
    HashMap<Integer, Node> m=new HashMap<>();  
    Node root=new Node(), temp=new Node();  
    int i;  
  
    // Iterate for all elements of the parent array.  
    for (i = 0; i < n; i++) 
    {  
  
        // Node i does not exist in the map  
        if (m.get(i) == null)  
        {  
  
            // Create a new node for the current index  
            temp = newNode(i);  
  
            // Entry of the node in the map with  
            // key as i and value as temp  
            m.put(i, temp);  
        }  
  
        // If parent is -1  
        // Current node i is the root  
        // So mark it as the root of the tree  
        if (parent[i] == -1)  
            root = m.get(i);  
  
        // Current node is not root and parent  
        // of that node is not created yet  
        else if (m.get(parent[i]) == null)  
        {  
  
            // Create the parent  
            temp = newNode(parent[i]);  
  
            // Assign the node as the  
            // left child of the parent  
            temp.left = m.get(i);  
  
            // Entry of parent in map  
            m.put(parent[i],temp);  
        }  
  
        // Current node is not root and parent  
        // of that node is already created  
        else
        {  
  
            // Left child of the parent doesn't exist  
            if (m.get(parent[i]).left == null)  
                m.get(parent[i]).left = m.get(i);  
  
            // Right child of the parent doesn't exist  
            else
                m.get(parent[i]).right = m.get(i);  
        }  
    }  
    return root;  
}  
  
// Driver code  
public static void main(String args[])  
{  
    int parent[] = { -1, 0, 0, 1, 1, 3, 5 };  
    int n = parent.length;  
    Node root = createTree(parent, n);  
    System.out.print( "Inorder Traversal of coned tree\n");  
    inorder(root);  
  
}  
} 
  
// This code is contributed by Arnab Kundu 

