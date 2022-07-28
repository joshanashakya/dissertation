

// Java implementation of the approach 
import java.io.*; 
import java.util.*; 
  
class Pair<V, E>  
{ 
    V first; 
    E second; 
  
    Pair(V first, E second)  
    { 
        this.first = first; 
        this.second = second; 
    } 
} 
  
class GFG  
{ 
  
    // Function to return the minimum number 
    // of edges that need to be added to 
    // the given graph such that it 
    // contains at least one triangle 
    static int minEdges(Vector<Pair<Integer,  
                                    Integer>> v, int n)  
    { 
  
        // adj is the adjacency matrix such that 
        // adj[i][j] = 1 when there is an 
        // edge between i and j 
        int[][] adj = new int[n + 1][n + 1]; 
  
        // As the graph is undirected 
        // so there will be an edge 
        // between (i, j) and (j, i) 
        for (int i = 0; i < v.size(); i++)  
        { 
            adj[v.elementAt(i).first] 
               [v.elementAt(i).second] = 1; 
            adj[v.elementAt(i).second] 
               [v.elementAt(i).first] = 1; 
        } 
  
        // To store the required 
        // count of edges 
        int edgesNeeded = 0; 
  
        // For every possible vertex triplet 
        for (int i = 1; i <= n; i++) 
        { 
            for (int j = i + 1; j <= n; j++)  
            { 
                for (int k = j + 1; k <= n; k++)  
                { 
  
                    // If the vertices form a triangle 
                    if (adj[i][j] == 1 &&  
                        adj[j][k] == 1 && adj[k][i] == 1) 
                        return 0; 
  
                    // If no edges are present 
                    if (!(adj[i][j] == 1 ||  
                          adj[j][k] == 1 || adj[k][i] == 1)) 
                        edgesNeeded = Math.min(edgesNeeded, 3); 
  
                    else 
                    { 
  
                        // If only 1 edge is required 
                        if ((adj[i][j] == 1 && adj[j][k] == 1) ||  
                            (adj[j][k] == 1 && adj[k][i] == 1) ||  
                            (adj[k][i] == 1 && adj[i][j] == 1))  
                        { 
                            edgesNeeded = 1; 
                        } 
  
                        // Two edges are required 
                        else
                            edgesNeeded = Math.min(edgesNeeded, 2); 
                    } 
                } 
            } 
        } 
        return edgesNeeded; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
  
        // Number of nodes 
        int n = 3; 
  
        // Storing the edges in a vector of pairs 
        Vector<Pair<Integer,  
                    Integer>> v = new Vector<>(Arrays.asList(new Pair<>(1, 2),  
                                                             new Pair<>(1, 3))); 
  
        System.out.println(minEdges(v, n)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

