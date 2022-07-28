

//Java program of above approach 
  
import java.io.*; 
  
class GFG { 
    // function to find longest subarray 
static int longestsubarray(int arr[],  
                        int n, int k) 
{ 
    int current_count = 0; 
      
    // this will contain length of  
    // longest subarray found 
    int max_count = 0; 
  
    for (int i = 0; i < n; i++)  
    { 
        if (arr[i] % k == 0) 
            current_count++; 
        else
            current_count = 0; 
        max_count = Math.max(current_count,  
                            max_count); 
    } 
    return max_count; 
} 
  
// Driver code 
    public static void main (String[] args) { 
int arr[] = { 2, 5, 11, 32, 64, 88 }; 
    int n = arr.length; 
    int k = 8; 
    System.out.println(longestsubarray(arr, n, k)); 
} 
} 
  
// This code is contributed  
// by ajit 

