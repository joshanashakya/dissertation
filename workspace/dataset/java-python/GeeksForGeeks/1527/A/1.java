

import java.util.*; 
  
class GFG 
{ 
  
// function to count pairs in an array 
// whose absolute difference is 
// divisible by k 
static void countPairs(int arr[], int n, int k) 
{ 
  
    // initilize count as zero. 
    int i, j, cnt = 0; 
  
    // loop to count the valid pair 
    for (i = 0; i < n - 1; i++) 
    { 
        for (j = i + 1; j < n; j++) 
        { 
            if ((arr[i] - arr[j] + k) % k == 0) 
                cnt += 1; 
        } 
    } 
    System.out.print(cnt +"\n"); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    // input array 
    int arr[] = {3, 3, 3}; 
    int k = 3; 
  
    // calculate the size of array 
    int n = arr.length; 
  
    // function to count the valid pair 
    countPairs(arr, n, k); 
} 
} 
  
// This code is contributed by 29AjayKumar 

