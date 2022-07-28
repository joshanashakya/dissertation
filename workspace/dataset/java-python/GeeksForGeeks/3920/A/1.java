

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
static final int N = 9; 
  
// Function to add edges in the tree 
static void addEgde(List<Integer> []adj, int u, int v) 
{ 
    adj[u].add(v); 
    adj[v].add(u); 
} 
  
// Function to find the GCD from root to leaf path 
static void DFS(int node, int parent, int G, int leaf, 
        int val[], List<Integer> []adj) 
{ 
    // If we reach the desired leaf 
    if (node == leaf) 
    { 
        G = __gcd(G, val[node]); 
        System.out.print(G); 
        return; 
    } 
  
    // Call DFS for children 
    for (int it : adj[node])  
    { 
  
        if (it != parent) 
            DFS(it, node, __gcd(G, val[it]), leaf, val, adj); 
    } 
} 
static int __gcd(int a, int b)  
{  
    return b == 0? a:__gcd(b, a % b);      
} 
  
// Driver code 
public static void main(String[] args) 
{ 
  
    int n = 8; 
    List<Integer> []adj = new LinkedList[n + 1]; 
        for (int i = 0; i < n + 1; i++) 
            adj[i] = new LinkedList<Integer>(); 
    addEgde(adj, 1, 2); 
    addEgde(adj, 2, 4); 
    addEgde(adj, 1, 3); 
    addEgde(adj, 3, 5); 
    addEgde(adj, 3, 6); 
    addEgde(adj, 6, 7); 
    addEgde(adj, 6, 8); 
  
    int leaf = 5; 
  
    // -1 to indicate no value in node 0 
    int val[] = { -1, 6, 2, 6, 3, 4, 12, 10, 18 }; 
  
    // Initially GCD is the value of the root 
    int G = val[1]; 
  
    DFS(1, -1, G, leaf, val, adj); 
} 
} 
  
// This code is contributed by 29AjayKumar 

