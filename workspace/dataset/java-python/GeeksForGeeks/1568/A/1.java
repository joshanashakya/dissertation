

// Java program to count number of non 
// increasing subarrays 
class GFG 
{ 
      
static int countNonIncreasing(int arr[], int n) 
{ 
    // Initialize result 
    int cnt = 0; 
  
    // Initialize length of current non 
    // increasing subarray 
    int len = 1; 
  
    // Traverse through the array 
    for (int i = 0; i < n - 1; ++i) 
    { 
  
        // If arr[i+1] is less than or equal to arr[i], 
        // then increment length 
        if (arr[i + 1] >= arr[i]) 
            len++; 
  
        // Else Update count and reset length 
        else 
        { 
            cnt += (((len + 1) * len) / 2); 
            len = 1; 
        } 
    } 
  
    // If last length is more than 1 
    if (len > 1) 
        cnt += (((len - 1) * len) / 2); 
  
    return cnt; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 5, 2, 3, 7, 1, 1 }; 
    int n =arr.length; 
  
    System.out.println(countNonIncreasing(arr, n)); 
} 
} 
  
// This code is contributed by Code_Mech 

