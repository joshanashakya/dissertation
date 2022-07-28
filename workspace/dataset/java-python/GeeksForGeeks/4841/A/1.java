

// Java program to print the number of 
// leaf nodes of every node 
import java.util.*; 
  
class GFG 
{ 
static Vector<Vector<Integer>> adjacency = new
       Vector<Vector<Integer>>(); 
  
// Function to insert edges of tree 
static void insert(int x, int y) 
{ 
    adjacency.get(x).add(y); 
} 
  
// Function to run DFS on a tree 
static void dfs(int node, int leaf[], int vis[]) 
{ 
    leaf[node] = 0; 
    vis[node] = 1; 
  
    // iterate on all the nodes 
    // connected to node 
    for (int i = 0; i < adjacency.get(node).size(); i++) 
    { 
        int it = adjacency.get(node).get(i); 
          
        // If not visited 
        if (vis[it] == 0)  
        { 
            dfs(it, leaf, vis); 
            leaf[node] += leaf[it]; 
        } 
    } 
  
    if (adjacency.get(node).size() == 0) 
        leaf[node] = 1; 
} 
  
// Function to print number of 
// leaf nodes of a node 
static void printLeaf(int n, int leaf[]) 
{ 
    // Function to print leaf nodes 
    for (int i = 1; i <= n; i++)  
    { 
        System.out.print( "The node " + i + " has " +  
                          leaf[i] + " leaf nodes\n"); 
    } 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    // Given N-ary Tree 
  
    /*     1  
        / \ 
        2     3 
            / | \ 
            4 5 6 */
  
    int N = 6; // no of nodes 
      
    for(int i = 0; i <= N; i++) 
    adjacency.add(new Vector<Integer>()); 
      
    insert(1, 2); 
    insert(1, 3); 
    insert(3, 4); 
    insert(3, 5); 
    insert(3, 6); 
  
    // Store count of leaf in subtree of i 
    int leaf[] = new int[N + 1];  
      
    // mark nodes visited 
    int vis[] = new int[N + 1] ;  
  
    dfs(1, leaf, vis); 
  
    printLeaf(N, leaf); 
} 
} 
  
// This code is contributed by Arnab Kundu 

