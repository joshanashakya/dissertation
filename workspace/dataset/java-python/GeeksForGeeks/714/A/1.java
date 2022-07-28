

// Java implementation of the approach  
import java.io.*; 
  
class GFG  
{ 
      
static int MAX = 100000; 
static int bitscount = 32; 
  
// Array to store bit-wise 
// prefix count 
static int [][]prefix_count = new int [bitscount][MAX]; 
  
// Function to find the prefix sum 
static void findPrefixCount(int arr[], int n) 
{ 
  
    // Loop for each bit 
    for (int i = 0; i < bitscount; i++) 
    { 
        // Loop to find prefix count 
        prefix_count[i][0] = ((arr[0] >> i) & 1); 
        for (int j = 1; j < n; j++)  
        { 
            prefix_count[i][j] = ((arr[j] >> i) & 1); 
            prefix_count[i][j] += prefix_count[i][j - 1]; 
        } 
    } 
} 
  
// Function to answer query 
static int rangeOr(int l, int r) 
{ 
  
    // To store the answer 
    int ans = 0; 
  
    // Loop for each bit 
    for (int i = 0; i < bitscount; i++) 
    { 
        // To store the number of variables 
        // with ith bit set 
        int x; 
        if (l == 0) 
            x = prefix_count[i][r]; 
        else
            x = prefix_count[i][r] 
                - prefix_count[i][l - 1]; 
  
        // Condition for ith bit 
        // of answer to be set 
        if (x != 0) 
            ans = (ans | (1 << i)); 
    } 
  
    return ans; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
      
    int arr[] = { 7, 5, 3, 5, 2, 3 }; 
    int n = arr.length; 
    findPrefixCount(arr, n); 
    int queries[][] = { { 1, 3 }, { 4, 5 } }; 
    int q = queries.length; 
    for (int i = 0; i < q; i++) 
            System.out.println (rangeOr(queries[i][0],queries[i][1])); 
  
} 
} 
  
// This code is contributed by Tushil.  

