

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
      
// Function to return the minimum cost 
static int MinimumCost(int a[], int n, int x) 
{ 
  
    // Re-compute the array 
    for (int i = 1; i < n; i++)  
    { 
        a[i] = Math.min(a[i], 2 * a[i - 1]); 
    } 
  
    int ind = 0; 
  
    int sum = 0; 
  
    // Add answers for set bits 
    while (x > 0)  
    { 
  
        // If bit is set 
        if (x != 0 ) 
            sum += a[ind]; 
  
        // Increase the counter 
        ind++; 
  
        // Right shift the number 
        x = x >> 1; 
    } 
  
    return sum; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
  
    int a[] = { 20, 50, 60, 90 }; 
    int x = 7; 
    int n =a.length; 
    System.out.println (MinimumCost(a, n, x)); 
} 
} 
  
// This Code is contributed by akt_mit  

