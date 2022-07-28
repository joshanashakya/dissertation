

// Java implementation of the approach 
class GFG 
{ 
  
// Function that calculates occurrences 
// of given angle that can be created 
// using any 3 sides 
static int solve(int ang, int n) 
{ 
  
    // Maximum angle in a regular n-gon 
    // is equal to the interior angle 
    // If the given angle 
    // is greater than the interior angle 
    // then the given angle cannot be created 
    if ((ang * n) > (180 * (n - 2))) 
    { 
        return 0; 
    } 
  
    // The given angle times n should be divisible 
    // by 180 else it cannot be created 
    else if ((ang * n) % 180 != 0) 
    { 
        return 0; 
    } 
  
    // Initialise answer 
    int ans = 1; 
  
    // Calculate the frequency 
    // of given angle for each vertex 
    int freq = (ang * n) / 180; 
  
    // Multiply answer by frequency. 
    ans = ans * (n - 1 - freq); 
  
    // Multiply answer by the number of vertices. 
    ans = ans * n; 
  
    return ans; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int ang = 90, n = 4; 
    System.out.println(solve(ang, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

