

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{ 
      
static int n= 3 ; 
static class Pair 
{ 
    int first , second; 
    Pair(int a, int b) 
    { 
        first = a; 
        second = b; 
    } 
} 
  
// Function to return the minimum steps  
// required to reach the end of the matrix  
static int minSteps(int arr[][])  
{  
    // Array to determine whether  
    // a cell has been visited before  
    boolean v[][] = new boolean[n][n];  
  
    // Queue for bfs  
    Queue<Pair> q = new LinkedList<Pair>();  
  
    // Initializing queue  
    q.add(new Pair( 0, 0 ));  
  
    // To store the depth of search  
    int depth = 0;  
  
    // BFS algorithm  
    while (q.size() != 0)  
    {  
  
        // Current queue size  
        int x = q.size();  
        while (x-->0)  
        {  
  
            // Top-most element of queue  
            Pair y = q.peek();  
  
            // To store index of cell  
            // for simplicity  
            int i = y.first, j = y.second;  
            q.remove();  
  
            // Base case  
            if (v[i][j])  
                continue;  
  
            // If we reach (n-1, n-1)  
            if (i == n - 1 && j == n - 1)  
                return depth;  
  
            // Marking the cell visited  
            v[i][j] = true;  
  
            // Pushing the adjacent cells in the  
            // queue that can be visited  
            // from the current cell  
            if (i + arr[i][j] < n)  
                q.add(new Pair( i + arr[i][j], j ));  
            if (j + arr[i][j] < n)  
                q.add(new Pair( i, j + arr[i][j] ));  
        }  
        depth++;  
    }  
    return -1;  
}  
  
// Driver code  
public static void main(String args[]) 
{  
    int arr[][] = { { 1, 1, 1 },  
                    { 1, 1, 1 },  
                    { 1, 1, 1 } };  
  
    System.out.println(minSteps(arr));  
} 
} 
  
// This code is contributed by Arnab Kundu 

