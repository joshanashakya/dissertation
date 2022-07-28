

// Java implementation of the approach 
public class GFG { 
  
    // Tree node 
    static class Node { 
        int data; 
        Node left, right; 
        Node(int data) 
        { 
            this.data = data; 
            left = null; 
            right = null; 
        } 
    } 
  
    // Recursive function to update 
    // the parent array such that parent[i] 
    // stores the parent of i 
    static void updateParent(int parent[], 
                             Node node) 
    { 
  
        // If node is null then return 
        if (node == null) 
            return; 
  
        // If left child of the node is not 
        // null then set node as the parent 
        // of its left child 
        if (node.left != null) 
            parent[node.left.data] = node.data; 
  
        // If right child of the node is not 
        // null then set node as the parent 
        // of its right child 
        if (node.right != null) 
            parent[node.right.data] = node.data; 
  
        // Recursive call for the 
        // children of current node 
        updateParent(parent, node.left); 
        updateParent(parent, node.right); 
    } 
  
    // Function to return the maximum value 
    // of a node on the path from root to val 
    // when Xored with x 
    static int getMaxXor(Node root, 
                         int n, int val, int x) 
    { 
  
        // Create the parent array 
        int parent[] = new int[n + 1]; 
        updateParent(parent, root); 
  
        // Initialze max with x XOR val 
        int max = x ^ val; 
  
        // Get to the parent of val 
        val = parent[val]; 
  
        // 0 is the parent of the root 
        while (val != 0) { 
  
            // Update maximum 
            max = Math.max(max, x ^ val); 
  
            // Get one level up the tree 
            val = parent[val]; 
        } 
        return max; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 6; 
        Node root = new Node(1); 
        root.left = new Node(2); 
        root.right = new Node(3); 
        root.left.left = new Node(4); 
        root.right.right = new Node(5); 
        root.right.right.left = new Node(6); 
  
        int val = 6, x = 4; 
        System.out.println(getMaxXor(root, n, val, x)); 
    } 
} 

