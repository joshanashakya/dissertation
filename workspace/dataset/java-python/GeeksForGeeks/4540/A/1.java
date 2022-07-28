

// Java Program to count number of ways  
// to split array into two groups such  
// that each group has equal XOR value 
import java.io.*; 
import java.util.*; 
  
class GFG { 
  
// Return the count number of ways to split 
// array into two groups such that each group 
// has equal XOR value. 
static int countgroup(int a[], int n) { 
    int xs = 0; 
    for (int i = 0; i < n; i++) 
    xs = xs ^ a[i]; 
  
    // We can split only if XOR is 0. Since 
    // XOR of all is 0, we can consider all 
    // subsets as one group. 
    if (xs == 0) 
    return (1 << (n - 1)) - 1; 
  
    return 0; 
} 
  
// Driver program 
public static void main(String args[]) { 
    int a[] = {1, 2, 3}; 
    int n = a.length; 
    System.out.println(countgroup(a, n)); 
} 
} 
  
// This code is contributed by Nikita Tiwari. 

