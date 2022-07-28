

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to calculate power of 3 
static long calculate(int bit_cnt) 
{ 
    long res = 1; 
    while (bit_cnt-- > 0)  
    { 
        res = res * 3; 
    } 
  
    return res; 
} 
  
// Function to return the count of the 
// unset bit ( zeros ) 
static int unset_bit_count(long n) 
{ 
    int count = 0; 
    while (n > 0)  
    { 
  
        // Check the bit is 0 or not 
        if ((n & 1) == 0) 
            count++; 
              
        // Right shifting ( dividing by 2 ) 
        n = n >> 1; 
    } 
    return count; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    long n; 
    n = 2; 
  
    int count = unset_bit_count(n); 
  
    long ans = calculate(count); 
  
    System.out.println(ans); 
} 
} 
  
// This code is contributed by PrinciRaj1992  

