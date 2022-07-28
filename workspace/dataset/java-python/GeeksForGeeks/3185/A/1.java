

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to return the maximum value of (x + y + z) 
// such that (ax + by + cz = n) 
static int maxResult(int n, int a, int b, int c) 
{ 
    int maxVal = 0; 
  
    // i represents possible values of a * x 
    for (int i = 0; i <= n; i += a) 
  
        // j represents possible values of b * y 
        for (int j = 0; j <= n - i; j += b) 
        { 
            float z = (n - (i + j)) / c; 
  
            // If z is an integer 
            if (Math.floor(z) == Math.ceil(z)) 
            { 
                int x = i / a; 
                int y = j / b; 
                maxVal = Math.max(maxVal, x + y + (int)z); 
            } 
        } 
  
    return maxVal; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 10, a = 5, b = 3, c = 4; 
    System.out.println(maxResult(n, a, b, c)); 
} 
} 
  
// This code is contributed by 
// Surendra_Gangwar 

