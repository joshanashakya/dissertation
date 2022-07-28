

// Java code to find the minimum cost to 
// reverse the edges 
class GFG  
{ 
  
// Function to calculate min cost for  
// reversing the edges 
static int minCost(int[][] graph, int n) 
{ 
  
    int cost1 = 0, cost2 = 0; 
      
    // bool array to mark start and  
    // end node of a graph 
    boolean []start = new boolean[n + 1]; 
    boolean []end = new boolean[n + 1]; 
  
    for (int i = 0; i < n; i++)  
    { 
        int a = graph[i][0]; 
        int b = graph[i][1]; 
        int c = graph[i][2]; 
  
        // This edge must start from b 
        // and end at a 
        if (start[a] || end[b])  
        { 
            cost2 += c; 
            start[b] = true; 
            end[a] = true; 
        } 
  
        // This edge must start from a 
        // and end at b 
        else 
        { 
            cost1 += c; 
            start[a] = true; 
            end[b] = true; 
        } 
    } 
  
    // Return minimum of both posibilities 
    return Math.min(cost1, cost2); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int n = 5; 
      
    // Adjacency list representation 
    // of a graph 
    int [][]graph = {{ 1, 2, 7 }, 
                     { 5, 1, 8 }, 
                     { 5, 4, 5 }, 
                     { 3, 4, 1 }, 
                     { 3, 2, 10 }}; 
  
    int ans = minCost(graph, n); 
    System.out.println(ans); 
} 
} 
  
// This code is contributed by Rajput-Ji 

