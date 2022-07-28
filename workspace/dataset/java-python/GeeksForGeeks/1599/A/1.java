

//Java implementation of the approach 
import java.util.Arrays;  
import java.io.*; 
  
class GFG  
{ 
static int N = 20; 
  
// To store the factorials 
static int []fact=new int[N]; 
  
// Function to update fact[] array 
// such that fact[i] = i! 
static void pre() 
{ 
  
    // 0! = 1 
    fact[0] = 1; 
    for (int i = 1; i < N; i++) 
    { 
  
        // i! = i * (i - 1)! 
        fact[i] = i * fact[i - 1]; 
    } 
} 
  
// Function to return the count 
// of possible permutations 
static int CountPermutation(int a[], int n) 
{ 
  
    // To store the result 
    int ways = 1; 
  
    // Sort the array 
    Arrays.sort(a); 
  
    // Initial size of the block 
    int size = 1; 
    for (int i = 1; i < n; i++)  
    { 
  
        // Increase the size of block 
        if (a[i] == a[i - 1])  
        { 
            size++; 
        } 
        else
        { 
  
            // Update the result for 
            // the previous block 
            ways *= fact[size]; 
  
            // Reset the size to 1 
            size = 1; 
        } 
    } 
  
    // Update the result for 
    // the last block 
    ways *= fact[size]; 
  
    return ways; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int a[] = { 1, 2, 4, 4, 2, 4 }; 
    int n = a.length; 
      
    // Pre-calculating factorials 
    pre(); 
      
    System.out.println (CountPermutation(a, n)); 
} 
} 
  
// This code is contributed by Sachin 

