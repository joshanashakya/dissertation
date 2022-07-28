

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
    // Function to count the number of nodes 
    // in the tree using DFS 
    static int dfs(int node, int parent,  
                Vector<Integer>[] adj, boolean[] vis)  
    { 
  
        // Base case 
        int ans = 1; 
  
        // Mark as visited 
        vis[node] = true; 
  
        // Traverse for all children 
        for (Integer it : adj[node]) 
        { 
  
            // If not equal to parent 
            if (it != parent) 
                ans += dfs(it, node, adj, vis); 
        } 
        return ans; 
    } 
  
    // Function that returns the count of 
    // unique paths 
    static int countPaths(Vector<Integer>[] adj,  
                        int k, int maxn) 
    { 
  
        // An array that marks if the node 
        // is visited or not 
        boolean[] vis = new boolean[maxn + 1]; 
        int ans = 0; 
  
        // Initially marked as false 
        Arrays.fill(vis, false); 
  
        // Traverse till max value of node 
        for (int i = 1; i <= maxn; i++) 
        { 
  
            // If not visited 
            if (!vis[i])  
            { 
  
                // Get the number of nodes in that 
                // tree 
                int numNodes = dfs(i, 0, adj, vis); 
  
                // Total unique paths in the current 
                // tree where numNodes is the total 
                // nodes in the tree 
                ans += numNodes * (numNodes - 1) / 2; 
            } 
        } 
        return ans; 
    } 
  
    // Function to add edges to tree if value 
    // is less than K 
    static void addEdge(Vector<Integer>[] adj, 
                        int u, int v, int k)  
    { 
        if (u > k && v > k) { 
            adj[u].add(v); 
            adj[v].add(u); 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int maxn = 12; 
  
        @SuppressWarnings("unchecked") 
        Vector<Integer>[] adj = new Vector[maxn + 1]; 
        for (int i = 0; i < maxn + 1; i++) 
        { 
            adj[i] = new Vector<>(); 
        } 
        int k = 3; 
  
        // Create undirected edges 
        addEdge(adj, 2, 11, k); 
        addEdge(adj, 2, 6, k); 
        addEdge(adj, 5, 11, k); 
        addEdge(adj, 5, 10, k); 
        addEdge(adj, 5, 12, k); 
        addEdge(adj, 6, 7, k); 
        addEdge(adj, 6, 8, k); 
  
        System.out.println(countPaths(adj, k, maxn)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

