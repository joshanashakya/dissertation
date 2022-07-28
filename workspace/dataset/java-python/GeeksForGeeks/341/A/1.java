

// Java implementation of the approach 
import java.text.*; 
  
class GFG 
{ 
      
// Recursive Function with static 
// variables p and f 
static double p = 1, f = 1; 
static double e(int x, int n) 
{ 
    double r; 
  
    // Termination condition 
    if (n == 0) 
        return 1; 
  
    // Recursive call 
    r = e(x, n - 1); 
  
    // Update the power of x 
    p = p * x; 
  
    // Factorial 
    f = f * n; 
  
    return (r + p / f); 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int x = 4, n = 15; 
    DecimalFormat df = new DecimalFormat("0.######"); 
    System.out.println(df.format(e(x, n))); 
  
} 
} 
  
// This code is contributed by mits 

