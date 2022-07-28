

// Java implementation of above approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to return length of 
// smallest subarray containing both 
// maximum and minimum value 
static int minSubarray(int A[], int n) 
{ 
  
    // find maximum and minimum 
    // values in the array 
    int minValue = A[0]; 
    for(int i = 1; i < n; i++) 
    { 
        if(A[i] < minValue) 
            minValue = A[i]; 
    } 
    int maxValue = A[0]; 
    for(int i = 1; i < n; i++) 
    { 
        if(A[i] > maxValue) 
            maxValue = A[i]; 
    } 
  
    int pos_min = -1, pos_max = -1,  
        ans = Integer.MAX_VALUE; 
  
    // iterate over the array and set answer 
    // to smallest difference between position 
    // of maximum and position of minimum value 
    for (int i = 0; i < n; i++)  
    { 
  
        // last occurrence of minValue 
        if (A[i] == minValue) 
            pos_min = i; 
  
        // last occurrence of maxValue 
        if (A[i] == maxValue) 
            pos_max = i; 
  
        if (pos_max != -1 && pos_min != -1) 
            ans = Math.min(ans,  
                  Math.abs(pos_min - pos_max) + 1); 
    } 
  
    return ans; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int A[] = { 1, 5, 9, 7, 1, 9, 4 }; 
    int n = A.length; 
  
    System.out.println(minSubarray(A, n)); 
} 
} 
  
// This code is contributed by 
// Surendra_Gangwar 

