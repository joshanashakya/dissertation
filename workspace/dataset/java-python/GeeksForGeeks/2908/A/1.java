

// Java implementation of above approach 
class GFG 
{ 
// Function to find the number of tiles 
static int solve(double M,  
                 double N, double s) 
{ 
    // no of tiles 
    int ans = ((int)(Math.ceil(M / s)) *  
               (int)(Math.ceil(N / s))); 
  
    return ans; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    // input length and breadth of 
    // rectangle and side of square 
    double N = 12, M = 13, s = 4; 
  
    System.out.println(solve(M, N, s)); 
} 
} 
  
// This Code is contributed by mits 

