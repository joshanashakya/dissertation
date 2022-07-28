

// Java implementation of the approach 
class GFG 
{ 
      
// Function to return the minimum positive 
// integer satisfying the given equation 
static int MinimumX(int a, int b, int c, int k) 
{ 
    int x = Integer.MAX_VALUE; 
  
    if (k <= c) 
        return 0; 
  
    int h = k - c; 
    int l = 0; 
  
    // Binary search to find the value of x 
    while (l <= h)  
    { 
        int m = (l + h) / 2; 
        if ((a * m * m) + (b * m) > (k - c))  
        { 
            x = Math.min(x, m); 
            h = m - 1; 
        } 
        else if ((a * m * m) + (b * m) < (k - c)) 
            l = m + 1; 
        else
            return m; 
    } 
  
    // Return the answer 
    return x; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a = 3, b = 2, c = 4, k = 15; 
    System.out.println(MinimumX(a, b, c, k)); 
} 
} 
  
// This code is contributed by Code_Mech.  

