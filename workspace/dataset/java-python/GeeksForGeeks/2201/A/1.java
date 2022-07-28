

// Java implementation of the approach 
class GFG 
{ 
  
// Function to return the maximum count 
// of required elements 
static int findMax(int arr[], int n) 
{ 
  
    // divisible[i] will store true 
    // if arr[i] is divisible by 
    // any element on its right 
    boolean []divisible = new boolean[n]; 
  
    // To store the maximum required count 
    int res = 0; 
  
    // For every element of the array 
    for (int i = n - 1; i > 0; i--) 
    { 
  
        // If the current element is 
        // divisible by any element 
        // on its right 
        if (divisible[i]) 
            continue; 
  
        // Find the count of element 
        // on the left which are divisible 
        // by the current element 
        int cnt = 0; 
        for (int j = 0; j < i; j++)  
        { 
  
            // If arr[j] is divisible then 
            // set divisible[j] to true 
            if ((arr[j] % arr[i]) == 0) 
            { 
                divisible[j] = true; 
                cnt++; 
            } 
        } 
  
        // Update the maximum required count 
        res = Math.max(res, cnt); 
    } 
    return res; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = { 8, 1, 28, 4, 2, 6, 7 }; 
    int n = arr.length; 
  
    System.out.println(findMax(arr, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

