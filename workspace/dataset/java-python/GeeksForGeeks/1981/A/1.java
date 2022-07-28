

// Java program to count all pairs with bit difference 
// as k 
  
import java.io.*; 
  
class GFG { 
  
  
// Utility function to count total ones in a number 
static int bitCount(int n) 
{ 
    int count = 0; 
    while (n>0) 
    { 
        if ((n & 1)>0) 
            ++count; 
        n >>= 1; 
    } 
    return count; 
} 
  
// Function to count pairs of K different bits 
static long countPairsWithKDiff(int arr[], int n, int k) 
{ 
    long  ans = 0; // initialize final answer 
  
    for (int i = 0; i < n-1; ++i) 
    { 
        for (int j = i + 1; j < n; ++j) 
        { 
            int xoredNum = arr[i] ^ arr[j]; 
  
            // Check for K differ bit 
            if (k == bitCount(xoredNum)) 
                ++ans; 
        } 
    } 
    return ans; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
            int k = 2; 
    int arr[] = {2, 4, 1, 3, 1}; 
    int n =arr.length; 
  
    System.out.println( "Total pairs for k = " + k + " are "
        + countPairsWithKDiff(arr, n, k) + "\n"); 
    } 
} 
// This code is contributed by shs.. 

