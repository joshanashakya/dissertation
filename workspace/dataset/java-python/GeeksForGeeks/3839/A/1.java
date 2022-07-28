

// Java implementation of the approach 
class GFG 
{ 
static int MOD = 2019; 
  
// Function to return the minimum 
// possible value of (i * j) % 2019 
static int min_modulo(int l, int r) 
{ 
    // If we can get a number 
    // divisible by 2019 
    if (r - l >= MOD) 
        return 0; 
    else 
    { 
  
        // Find the minimum value 
        // by running nested loops 
        int ans = MOD - 1; 
        for (int i = l; i <= r; i++)  
        { 
            for (int j = i + 1; j <= r; j++) 
            { 
                ans = Math.min(ans, (i * j) % MOD); 
            } 
        } 
        return ans; 
    } 
} 
  
// Driver code 
public static void main(String []args)  
{ 
    int l = 2020, r = 2040; 
  
    System.out.println(min_modulo(l, r)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

