

// Java implementation of the approach 
class GFG 
{ 
  
static int MAX = 100; 
  
// Stores the vertices 
static int []store = new int[MAX]; 
static int n; 
  
// Graph 
static int [][]graph = new int [MAX][MAX]; 
  
// Degree of the vertices 
static int []d = new int[MAX]; 
  
// Function to check if the given set of vertices 
// in store array is a clique or not 
static boolean is_clique(int b) 
{ 
    // Run a loop for all the set of edges 
    // for the select vertex 
    for (int i = 1; i < b; i++)  
    { 
        for (int j = i + 1; j < b; j++) 
  
            // If any edge is missing 
            if (graph[store[i]][store[j]] == 0) 
                return false; 
    } 
    return true; 
} 
  
// Function to print the clique 
static void print(int n) 
{ 
    for (int i = 1; i < n; i++) 
        System.out.print(store[i] + " "); 
    System.out.print(", "); 
} 
  
// Function to find all the cliques of size s 
static void findCliques(int i, int l, int s) 
{ 
    // Check if any vertices from i+1 can be inserted 
    for (int j = i + 1; j <= n - (s - l); j++) 
  
        // If the degree of the graph is sufficient 
        if (d[j] >= s - 1) 
        { 
  
            // Add the vertex to store 
            store[l] = j; 
  
            // If the graph is not a clique of size k 
            // then it cannot be a clique 
            // by adding another edge 
            if (is_clique(l + 1)) 
  
                // If the length of the clique is 
                // still less than the desired size 
                if (l < s) 
  
                    // Recursion to add vertices 
                    findCliques(j, l + 1, s); 
  
                // Size is met 
                else
                    print(l + 1); 
        } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int edges[][] = { { 1, 2 }, 
                    { 2, 3 }, 
                    { 3, 1 }, 
                    { 4, 3 }, 
                    { 4, 5 }, 
                    { 5, 3 } }, 
    k = 3; 
    int size = edges.length; 
    n = 5; 
  
    for (int i = 0; i < size; i++) 
    { 
        graph[edges[i][0]][edges[i][1]] = 1; 
        graph[edges[i][1]][edges[i][0]] = 1; 
        d[edges[i][0]]++; 
        d[edges[i][1]]++; 
    } 
  
    findCliques(0, 1, k); 
} 
} 
  
// This code is contributed by 29AjayKumar 

