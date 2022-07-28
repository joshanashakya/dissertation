

// Java implementation of the approach 
class gfg 
{ 
      
// Function to return the minimum cost 
static int getMinCost(int n, int m) 
{ 
    int cost = (n - 1) * m + (m - 1) * n; 
    return cost; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 4, m = 5; 
    System.out.println(getMinCost(n, m)); 
} 
} 
  
// This code is contributed by Code_Mech. 

