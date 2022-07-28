

// Java program to find the number 
// of pairs such that the path between 
// every pair contains two given vertices 
import java.util.*; 
  
class GFG{ 
static int N = 1000001; 
static int c, n, m, a, b; 
   
// Function to perform DFS on the given graph 
// by fixing the a vertex 
static void dfs(int a, int b, Vector<Integer> v[], int vis[]) 
{ 
    // To mark a particular vertex as visited 
    vis[a] = 1; 
   
    // Variable to store the count of the 
    // vertices which can be reached from a 
    c++; 
   
    // Performing the DFS by iterating over 
    // the visited array 
    for (int i : v[a]) { 
   
        // If the vertex is not visited 
        // and removing the vertex b 
        if (vis[i] == 0 && i != b) 
            dfs(i, b, v, vis); 
    } 
} 
   
// Function to return the number of pairs 
// such that path between any two pairs 
// consists the given two vertices A and B 
static void Calculate(Vector<Integer> v[]) 
{ 
   
    // Initializing the visited array 
    // and assigning it with 0's 
    int []vis = new int[n + 1]; 
    Arrays.fill(vis, 0); 
  
    // Initially, the count of vertices is 0 
    c = 0; 
   
    // Performing DFS by removing the vertex B 
    dfs(a, b, v, vis); 
   
    // Count the vertices which cannot be 
    // reached after removing the vertex B 
    int ans1 = n - c - 1; 
   
    // Again reinitializing the visited array 
    Arrays.fill(vis, 0); 
   
    // Setting the count of vertices to 0 to 
    // perform the DFS again 
    c = 0; 
   
    // Performing the DFS by removing the vertex A 
    dfs(b, a, v, vis); 
   
    // Count the vertices which cannot be 
    // reached after removing the vertex A 
    int ans2 = n - c - 1; 
   
    // Multiplying both the vertices set 
    System.out.print(ans1 * ans2+ "\n"); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    n = 7; 
    m = 7; 
    a = 3; 
    b = 5; 
   
    int edges[][] = { { 1, 2 }, 
                       { 2, 3 }, 
                       { 3, 4 }, 
                       { 4, 5 }, 
                       { 5, 6 }, 
                       { 6, 7 }, 
                       { 7, 5 } }; 
    Vector<Integer> []v = new Vector[n + 1]; 
    for(int i= 0; i <= n; i++) { 
        v[i] = new Vector<Integer>(); 
    } 
    // Loop to store the graph 
    for (int i = 0; i < m; i++) { 
        v[edges[i][0]].add(edges[i][1]); 
        v[edges[i][1]].add(edges[i][0]); 
    } 
   
    Calculate(v); 
} 
} 
  
// This code is contributed by Rajput-Ji 

