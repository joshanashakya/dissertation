

// Java implementation of the above approach 
import java.util.*; 
  
class GFG  
{  
  
// Function to convert N into base K 
static int toK(int N, int K) 
{ 
  
    // Weight of each digit 
    int w = 1; 
    int s = 0; 
    while (N != 0) 
    { 
        int r = N % K; 
        N = N / K; 
        s = r * w + s; 
        w *= 10; 
    } 
    return s; 
  
} 
  
// Function to check for consecutive 0 
static boolean check(int N) 
{ 
  
    // Flag to check if there are consecutive  
    // zero or not 
    boolean fl = false; 
    while (N != 0) 
    { 
  
        int r = N % 10; 
        N = N / 10; 
  
        // If there are two consecutive zero  
        // then returning False 
        if (fl == true && r == 0) 
            return false; 
        if (r > 0) 
        { 
            fl = false; 
            continue; 
        } 
        fl = true; 
    } 
    return true; 
} 
  
// We first convert to given base, then 
// check if the converted number has two 
// consecutive 0s or not 
static void hasConsecutiveZeroes(int N, int K) 
{ 
    int z = toK(N, K); 
    if (check(z)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int N = 15; 
    int K = 8; 
    hasConsecutiveZeroes(N, K); 
} 
} 
  
// This code is contributed by Princi Singh 

