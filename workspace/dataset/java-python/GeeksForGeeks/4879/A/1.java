

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the count 
// of different arrays 
static int countSum(int N, int L, int R) 
{ 
  
    // No such combination exists 
    if (L > R) 
    { 
        return 0; 
    } 
  
    // Arrays formed with single elements 
    if (N == 1) 
    { 
        return R - L + 1; 
    } 
  
    if (N > 1) 
    { 
        return (N - 2) * (R - L) + 1; 
    } 
    return 0; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int N = 4, L = 4, R = 6; 
  
    System.out.print(countSum(N, L, R)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

