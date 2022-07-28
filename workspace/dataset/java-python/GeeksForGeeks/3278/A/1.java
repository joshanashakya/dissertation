

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
      
static int MAX = 1001; 
static int prefix[][] = new int[MAX][MAX]; 
static int ar[] = new int[MAX]; 
  
// Function to calculate the prefix 
static void cal_prefix(int n, int arr[]) 
{ 
    int i, j; 
  
    // Creating one based indexing 
    for (i = 0; i < n; i++) 
        ar[i + 1] = arr[i]; 
  
    // Initilizing and creating prefix array 
    for (i = 1; i <= 1000; i++)  
    { 
        for (j = 0; j <= n; j++) 
            prefix[i][j] = 0; 
  
        for (j = 1; j <= n; j++)  
        { 
  
            // Creating a prefix array for every 
            // possible value in a given range 
            prefix[i][j] = prefix[i][j - 1] 
                        + (int)(ar[j] <= i ? 1 : 0); 
        } 
    } 
} 
  
// Function to return the kth largest element 
// in the index range [l, r] 
static int ksub(int l, int r, int n, int k) 
{ 
    int lo, hi, mid; 
  
    lo = 1; 
    hi = 1000; 
  
    // Binary searching through the 2d array 
    // and only checking the range in which 
    // the sub array is a part 
    while (lo + 1 < hi)  
    { 
        mid = (lo + hi) / 2; 
        if (prefix[mid][r] - prefix[mid][l - 1] >= k) 
            hi = mid; 
        else
            lo = mid + 1; 
    } 
  
    if (prefix[lo][r] - prefix[lo][l - 1] >= k) 
        hi = lo; 
  
    return hi; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 1, 4, 2, 3, 5, 7, 6 }; 
    int n = arr.length; 
    int k = 4; 
  
    // Creating the prefix array 
    // for the given array 
    cal_prefix(n, arr); 
  
    // Queries 
    int queries[][] = { { 1, n, 1 }, 
                        { 2, n - 2, 2 }, 
                        { 3, n - 1, 3 } }; 
    int q = queries.length; 
  
    // Perform queries 
    for (int i = 0; i < q; i++) 
        System.out.println( ksub(queries[i][0], queries[i][1], 
                    n, queries[i][2])); 
} 
} 
  
// This code is contributed by Arnab Kundu 

