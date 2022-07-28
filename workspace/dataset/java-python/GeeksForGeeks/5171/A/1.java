

// Java program to print the nodes of binary 
// tree as they become the leaf node 
import java.util.*; 
  
class GFG 
{ 
  
// Binary tree node 
static class Node 
{ 
    int data; 
    int order; 
    Node left; 
    Node right; 
}; 
  
static class Pair 
{ 
    int first,second; 
      
    Pair(int a,int b) 
    { 
        first = a; 
        second = b; 
    } 
} 
  
// Utiltiy function to allocate a new node 
static Node newNode(int data, int order) 
{ 
    Node node = new Node(); 
    node.data = data; 
    node.order = order; 
    node.left = null; 
    node.right = null; 
  
    return (node); 
} 
static Vector<Pair> v = new Vector<Pair>(); 
  
// Function for postorder traversal of tree and 
// assigning values to nodes 
static void Postorder(Node node) 
{ 
    if (node == null) 
        return; 
  
    /* first recur on left child */
    Postorder(node.left); 
  
    /* now recur on right child */
    Postorder(node.right); 
  
    // If current node is leaf node, it's order will be 1 
    if (node.right == null && node.left == null) 
    { 
        node.order = 1; 
  
        // make pair of assigned value and tree value 
        v.add(new Pair(node.order, node.data)); 
    } 
    else
    { 
        // otherwise, the order will be: 
        // max(left_child_order, right_child_order) + 1 
        node.order = Math.max((node.left).order, (node.right).order) + 1; 
  
        // make pair of assigned value and tree value 
        v.add(new Pair(node.order, node.data)); 
    } 
} 
static class Sort implements Comparator<Pair>  
{  
    // Used for sorting in ascending order of  
    // roll number  
    public int compare(Pair a, Pair b)  
    {  
        if(a.first != b.first) 
        return (a.first - b.first); 
        else
        return (a.second-b.second); 
    }  
} 
  
// Function to print leaf nodes in 
// the given order 
static void printLeafNodes(int n) 
{ 
    // Sort the vector in increasing order of 
    // assigned node values 
    Collections.sort(v,new Sort()); 
    for (int i = 0; i < v.size(); i++)  
    { 
        if (i != v.size()-1 && v.get(i).first == v.get(i + 1).first) 
            System.out.print( v.get(i).second + " "); 
  
        else
            System.out.print( v.get(i).second + "\n"); 
    } 
} 
  
  
// Driver Code 
public static void main(String args[]) 
{ 
    Node root = newNode(8, 0); 
    root.left = newNode(3, 0); 
    root.right = newNode(10, 0); 
    root.left.left = newNode(1, 0); 
    root.left.right = newNode(6, 0); 
    root.right.left = newNode(14, 0); 
    root.right.right = newNode(4, 0); 
    root.left.left.left = newNode(7, 0); 
    root.left.left.right = newNode(13, 0); 
  
    int n = 9; 
  
    Postorder(root); 
    printLeafNodes(n); 
} 
} 
  
// This code is contributed by Arnab Kundu 

