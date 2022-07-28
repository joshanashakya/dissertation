

// Java implementation of the approach 
import java.util.*; 
  
class Gfg  
{  
  
// Function to return the count 
// of prime factors of n 
public static int composite_factors(int n) 
{ 
    int count = 0; 
    int i, j; 
  
    // Initialise array with 0 
    int[] a=new int[n+1]; 
    for( i = 0; i < n; i++) 
    { 
        a[i]=0; 
    } 
    for (i = 1; i <= n; ++i)  
    { 
        if (n % i == 0) 
        { 
  
            // Stored i value into an array 
            a[i] = i; 
        } 
    } 
  
    // Every non-zero value at a[i] denotes 
    // that i is a factor of n 
    for (i = 2; i <= n; i++)  
    { 
        j = 2; 
        int p = 1; 
  
        // Find if i is prime 
        while (j < a[i])  
        { 
            if (a[i] % j == 0)  
            { 
                p = 0; 
                break; 
            } 
            j++; 
        } 
  
        // If i is a factor of n 
        // and i is not prime 
        if (p == 0 && a[i] != 0)  
        { 
            count++; 
        } 
      
} 
    return count; 
} 
  
  
// Driver code 
public static void main(String[] args)  
{  
    int n = 100; 
      
    System.out.println(composite_factors(n)); 
  
} 
} 
  
// This code is contributed by nidhi16bcs2007 

