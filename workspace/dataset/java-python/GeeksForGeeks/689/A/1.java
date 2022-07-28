

// Java implemenation to find the 
// maximum product of the bitonic 
// subsequence of size 3 
import java.util.*; 
  
class GFG{ 
   
// Function to find the maximum 
// product of bitonic subsequence 
// of size 3 
static int maxProduct(int arr[], int n){ 
       
    // Intialize ans to -1 if no such 
    // subsequence exist in the array 
    int ans = -1; 
       
    // Nested loops to choose the three 
    // elements of the array 
    for (int i = 0; i < n - 2; i++) { 
        for (int j = i + 1; j < n - 1; j++) { 
            for (int k = j + 1; k < n; k++) { 
                   
                // Condition to check if 
                // they form a bitonic subsequence 
                if (arr[i] < arr[j] && 
                      arr[j] > arr[k]) 
                    ans = Math.max( 
                       ans, arr[i] * arr[j] * arr[k] 
                       ); 
            } 
        } 
    } 
    return ans; 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 8, 3, 7 }; 
   
    int n = arr.length; 
   
    // Function call 
    System.out.print(maxProduct(arr, n) +"\n");     
} 
} 
  
// This code is contributed by 29AjayKumar 

