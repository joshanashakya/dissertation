

// Java implementation of the approach  
import java.util.*; 
  
class GFG  
{ 
  
// Function to return the minimum steps 
// required to reach the end 
// of the given array 
static int minSteps(int arr[], int n) 
{ 
    // Array to determine whether 
    // a cell has been visited before 
    boolean[] v = new boolean[n]; 
  
    // Queue for bfs 
    Queue<Integer> q = new LinkedList<>(); 
  
    // Push the source i.e. index 0 
    q.add(0); 
  
    // Variable to store 
    // the depth of search 
    int depth = 0; 
  
    // BFS algorithm 
    while (q.size() > 0) 
    { 
  
        // Current queue size 
        int x = q.size(); 
        while (x-- > 0) 
        { 
  
            // Top-most element of queue 
            int i = q.peek(); 
            q.poll(); 
  
            // Base case 
            if (v[i]) 
                continue; 
  
            // If we reach the destination 
            // i.e. index (n - 1) 
            if (i == n - 1) 
                return depth; 
  
            // Marking the cell visited 
            v[i] = true; 
  
            // Pushing the adjacent nodes 
            // i.e. indices reachable 
            // from the current index 
            if (i + arr[i] < n) 
                q.add(i + arr[i]); 
            if (i - arr[i] >= 0) 
                q.add(i - arr[i]); 
        } 
        depth++; 
    } 
  
    return -1; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = { 1, 1, 1, 1, 1, 1 }; 
    int n = arr.length; 
    System.out.println(minSteps(arr, n)); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

