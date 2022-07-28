

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
static class pair 
{  
    int first, second;  
    public pair(int first, int second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}  
  
static int N = 100005; 
  
// To store the graph 
static Vector<Integer> []gr = new Vector[N]; 
  
// To store colour of each vertex 
static int []colour = new int[N]; 
  
// To store edges 
static Vector<pair> edges = new Vector<>(); 
  
// To check graph is bipartite or not 
static boolean bip; 
  
// Function to add edges 
static void add_edge(int x, int y) 
{ 
    gr[x].add(y); 
    gr[y].add(x); 
    edges.add(new pair(x, y)); 
} 
  
// Function to check given graph 
// is bipartite or not 
static void dfs(int x, int col) 
{ 
    // colour the vertex x 
    colour[x] = col; 
  
    // For all it's child vertices 
    for (Integer i : gr[x]) 
    { 
        // If still not visited 
        if (colour[i] == -1) 
            dfs(i, col ^ 1); 
  
        // If visited and having 
        // same colour as parent 
        else if (colour[i] == col) 
            bip = false; 
    } 
} 
  
// Function to convert the undirected 
// graph into the directed graph such that 
// there is no path of length greater than 1 
static void Directed_Graph(int n, int m) 
{ 
  
    // Initially each vertex has no colour 
    for (int i = 0; i < N; i++) 
        colour[i] = -1; 
  
    // Suppose bipartite is possible 
    bip = true; 
  
    // Call bipartite function 
    dfs(1, 1); 
  
    // If bipartite is not possible 
    if (!bip)  
    { 
        System.out.print(-1); 
        return; 
    } 
  
    // If bipartite is possible 
    for (int i = 0; i < m; i++)  
    { 
  
        // Make an edge from vertex having 
        // colour 1 to colour 0 
        if (colour[edges.get(i).first] == 0) 
        { 
            Collections.swap(edges, edges.get(i).first,  
                                    edges.get(i).second); 
        } 
  
        System.out.println(edges.get(i).first + " " +  
                           edges.get(i).second); 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 4, m = 3; 
    for (int i = 0; i < N; i++) 
        gr[i] = new Vector<>(); 
          
    // Add edges 
    add_edge(1, 2); 
    add_edge(1, 3); 
    add_edge(1, 4); 
  
    // Function call 
    Directed_Graph(n, m); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

