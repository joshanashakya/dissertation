

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{ 
  
// Function to return Xor in a range 
// of a binary array 
static int xorRange(int pre[], int l, int r) 
{ 
  
    // To store the count of 1s 
    int cntOnes = pre[r]; 
    if (l - 1 >= 0) 
        cntOnes -= pre[l - 1]; 
  
    // If number of ones are even 
    if (cntOnes % 2 == 0) 
        return 0; 
  
    // If number of ones are odd 
    else
        return 1; 
} 
  
// Function to perform the queries 
static void performQueries(int queries[][], int q, 
                           int a[], int n) 
{ 
    // To store prefix sum 
    int []pre = new int[n]; 
  
    // pre[i] stores the number of 
    // 1s from pre[0] to pre[i] 
    pre[0] = a[0]; 
    for (int i = 1; i < n; i++) 
        pre[i] = pre[i - 1] + a[i]; 
  
    // Perform queries 
    for (int i = 0; i < q; i++) 
        System.out.println(xorRange(pre, queries[i][0],  
                                         queries[i][1])); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int a[] = { 1, 0, 1, 1, 0, 1, 1 }; 
    int n = a.length; 
  
    // Given queries 
    int queries[][] = { { 0, 3 }, { 0, 2 } }; 
    int q = queries.length; 
  
    performQueries(queries, q, a, n); 
} 
} 
  
// This code is contributed by Princi Singh 

