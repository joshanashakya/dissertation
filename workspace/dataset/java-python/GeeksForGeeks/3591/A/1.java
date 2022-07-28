

// Java implementation of the approach  
class GfG  
{  
  
// Function to return the number of ways  
// to remove edges from the graph so that  
// odd number of edges are left in the graph  
static int countWays(int N)  
{  
    // Total number of edges  
    int E = (N * (N - 1)) / 2;  
  
    if (N == 1)  
        return 0;  
  
    return (int)Math.pow(2, E - 1);  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    int N = 4;  
    System.out.println(countWays(N));  
} 
}  
  
// This code is contributed by Prerna Saini 

