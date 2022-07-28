

// Java program to count number of strictly 
// decreasing subarrays in O(n) time. 
  
import java.io.*; 
  
class GFG { 
  
  
// Function to count the number of strictly 
// decreasing subarrays 
static int countDecreasing(int A[], int n) 
{ 
    int cnt = 0; // Initialize result 
  
    // Initialize length of current 
    // decreasing subarray 
    int len = 1; 
  
    // Traverse through the array 
    for (int i = 0; i < n - 1; ++i) { 
        // If arr[i+1] is less than arr[i], 
        // then increment length 
        if (A[i + 1] < A[i]) 
            len++; 
  
        // Else Update count and reset length 
        else { 
            cnt += (((len - 1) * len) / 2); 
            len = 1; 
        } 
    } 
  
    // If last length is more than 1 
    if (len > 1) 
        cnt += (((len - 1) * len) / 2); 
  
    return cnt; 
} 
  
// Driver program 
    public static void main (String[] args) { 
    int A[] = { 100, 3, 1, 13 }; 
    int n = A.length; 
  
    System.out.println(countDecreasing(A, n)); 
    } 
} 
// This code is contributed by anuj_67.. 

