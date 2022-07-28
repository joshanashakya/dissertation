

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function that returns true if x is a power of 2 
static boolean isPowerOfTwo(int x) 
{ 
    if (x == 0) 
        return false; 
  
    // If x & (x-1) = 0 then x is a power of 2 
    if ((x & (x - 1)) == 0) 
        return true; 
    else
        return false; 
} 
  
// Function to return the required count 
static int countNum(int a[], int n) 
{ 
    int count = 0; 
  
    for (int i = 0; i < n; i++) { 
  
        // If a[i] or (a[i]+1) is a power of 2 
        if (isPowerOfTwo(a[i]) || isPowerOfTwo(a[i] + 1)) 
            count++; 
    } 
  
    return count; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 5, 6, 9, 3, 1 }; 
  
    int n = arr.length; 
  
    System.out.println(countNum(arr, n)); 
  
} 
} 
  
// This code is contributed by 
// Sahil_Shelangia 

