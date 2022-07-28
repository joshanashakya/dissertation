

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
static int vis[]; 
  
// Function to return the number of nodes 
// in the current connected component 
static int dfs(int x, Vector<Vector<Integer>> adj) 
{ 
    // Initialise size to 1 
    int sz = 1; 
  
    // Mark the node as visited 
    vis[x] = 1; 
  
    // Start a dfs for every unvisited 
    // adjacent node 
    for (int i = 0; i < adj.get(x).size(); i++) 
        if (vis[adj.get(x).get(i)] == 0) 
            sz += dfs(adj.get(x).get(i), adj); 
  
    // Return the number of nodes in 
    // the current connected component 
    return sz; 
} 
  
// Function to return the maximum value 
// of the required permutation 
static int maxValue(int n, Vector<Vector<Integer>> adj) 
{ 
    int val = 0; 
    vis = new int[n + 1]; 
      
    for (int i = 0; i < n; i++) 
    vis[i] = 0; 
  
    // For each connected component 
    // add the corresponding value 
    for (int i = 0; i < n; i++) 
        if (vis[i] == 0) 
            val += dfs(i, adj) - 1; 
    return val; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 3; 
    Vector<Vector<Integer>> adj = new Vector<Vector<Integer>>() ; 
      
    // create the graph 
    Vector<Integer> v = new Vector<Integer>(); 
    v.add(0); 
    v.add(1); 
    Vector<Integer> v1 = new Vector<Integer>(); 
    v1.add(1); 
    v1.add(2); 
      
    adj.add(v); 
    adj.add(v1); 
    adj.add(new Vector<Integer>()); 
      
    System.out.println( maxValue(n, adj)); 
} 
} 
  
// This code is contributed by Arnab Kundu 

