

// Java implementation of the approach 
import java.io.*; 
  
class GFG 
{ 
  
// Function to return the minimum 
// moves required 
static int minMoves(int n, int a[], int k) 
{ 
    int ct1[] = new int [k]; 
    int ct0[] = new int[k]; 
    int moves = 0; 
  
    // Count the number of 1s and 2s 
    // at each X such that i % K = X 
    for (int i = 0; i < n; i++) 
        if (a[i] == 1) 
            ct1[i % k]++; 
        else
            ct0[i % k]++; 
  
    // Choose the minimum elements to change 
    for (int i = 0; i < k; i++) 
        moves += Math.min(ct1[i], ct0[i]); 
  
    // Return the minimum moves required 
    return moves; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int k = 2; 
    int a[] = { 1, 0, 0, 0, 1, 0 }; 
    int n = a.length; 
    System.out.println(minMoves(n, a, k)); 
} 
} 
  
// This is code contributed by inder_verma 

