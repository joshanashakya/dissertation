

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
  
// Function to calculate the degree  
// of all the vertices 
static void init(int degree[], 
                     pair[] edges, int n) 
{ 
    // Initializing degree of  
    // all the vertices as 0 
    for (int i = 0; i < n; i++)  
    { 
        degree[i] = 0; 
    } 
  
    // For each edge from A to B,  
    // degree[A] and degree[B] 
    // are increased by 1 
    for (int i = 0; i < edges.length; i++)  
    { 
        degree[edges[i].first]++; 
        degree[edges[i].second]++; 
    } 
} 
  
// Function to perform the queries 
static void performQueries(pair [] edges, 
                           int []q, int n) 
{ 
    // To store the of degree 
    // of all the vertices 
    int []degree = new int[n]; 
  
    // Calculate the degree for all the vertices 
    init(degree, edges, n); 
  
    // For every query 
    for (int i = 0; i < q.length; i++) 
    { 
  
        int node = q[i]; 
        if (node == 0) 
        { 
            System.out.println("No"); 
            continue; 
        } 
          
        // If the current node has 1 degree 
        if (degree[node] == 1) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    // Number of vertices 
    int n = 6; 
  
    // Edges of the tree 
    pair[] edges = {new pair(0, 1),  
                    new pair(0, 2), 
                    new pair(1, 3),  
                    new pair(1, 4),  
                    new pair(4, 5)}; 
  
    // Queries 
    int []q = { 0, 3, 4, 5 }; 
  
    // Perform the queries 
    performQueries(edges, q, n); 
} 
} 
  
// This code is contributed by Rajput-Ji 

