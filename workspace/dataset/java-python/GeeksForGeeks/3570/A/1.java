

// Java program to find the count of  
// nodes at even distance 
import java.util.*; 
  
class GFG  
{ 
  
// Dfs function to find count of nodes at 
// even distance 
static void dfs(Vector<Integer> graph[],  
                   int node, int dist[], 
                   boolean vis[], int c) 
{ 
    if (vis[node]) 
    { 
        return; 
    } 
      
    // Set flag as true for current 
    // node in visited array 
    vis[node] = true; 
  
    // Insert the distance in 
    // dist array for current 
    // visited node u 
    dist[node] = c; 
  
    for (int i = 0; i < graph[node].size(); i++)  
    { 
        // If its neighbours are not vis, 
        // run dfs for them 
        if (!vis[graph[node].get(i)])  
        { 
            dfs(graph, graph[node].get(i), 
                        dist, vis, c + 1); 
        } 
    } 
} 
  
static int countOfNodes(Vector<Integer> graph[], 
                                         int n) 
{ 
    // bool array to 
    // mark visited nodes 
    boolean []vis = new boolean[n + 1]; 
  
    // Integer array to 
    // compute distance 
    int []dist = new int[n + 1]; 
  
    dfs(graph, 1, dist, vis, 0); 
  
    int even = 0, odd = 0; 
  
    // Traverse the distance array 
    // and count the even and odd levels 
    for (int i = 1; i <= n; i++)  
    { 
        if (dist[i] % 2 == 0) 
        { 
            even++; 
        } 
        else 
        { 
            odd++; 
        } 
    } 
    int ans = ((even * (even - 1)) + 
                (odd * (odd - 1))) / 2; 
  
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 5; 
    Vector<Integer> []graph = new Vector[n + 1]; 
    for(int i = 0; i< n + 1; i++) 
    { 
        graph[i] = new Vector<Integer>(); 
    } 
      
    graph[0] = new Vector<Integer>(); 
    graph[1] = new Vector(Arrays.asList(2)); 
    graph[2] = new Vector<Integer>(1, 3); 
    graph[3] = new Vector<Integer>(2); 
    int ans = countOfNodes(graph, n); 
    System.out.println(ans); 
} 
} 
  
// This code is contributed by 29AjayKumar 

