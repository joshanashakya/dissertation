

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
    static final int N = 5005; 
  
    // To store vertices and value of k 
    static int n, k; 
  
    static Vector<Integer>[] gr = new Vector[N]; 
  
    // To store number vertices at a level i 
    static int[][] d = new int[N][505]; 
  
    // To store the final answer 
    static int ans = 0; 
  
    // Function to add an edge between two nodes 
    static void Add_edge(int x, int y) 
    { 
        gr[x].add(y); 
        gr[y].add(x); 
    } 
  
    // Function to find the number of distinct 
    // pairs of the vertices which have a distance 
    // of exactly k in a tree 
    static void dfs(int v, int par)  
    { 
        // At level zero vertex itself is counted 
        d[v][0] = 1; 
        for (Integer i : gr[v]) 
        { 
            if (i != par) 
            { 
                dfs(i, v); 
  
                // Count the pair of vertices at 
                // distance k 
                for (int j = 1; j <= k; j++) 
                    ans += d[i][j - 1] * d[v][k - j]; 
  
                // For all levels count vertices 
                for (int j = 1; j <= k; j++) 
                    d[v][j] += d[i][j - 1]; 
            } 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        n = 5; 
        k = 2; 
        for (int i = 0; i < N; i++) 
            gr[i] = new Vector<Integer>(); 
          
        // Add edges 
        Add_edge(1, 2); 
        Add_edge(2, 3); 
        Add_edge(3, 4); 
        Add_edge(2, 5); 
  
        // Function call 
        dfs(1, 0); 
  
        // Required answer 
        System.out.print(ans); 
  
    } 
} 
  
// This code is contributed by PrinciRaj1992 

