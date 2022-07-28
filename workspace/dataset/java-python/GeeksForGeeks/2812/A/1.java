

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the count 
// of indices that satisfy 
// the given condition 
static int countIndices(int arr[], int n) 
{ 
  
    // To store the result 
    int cnt = 0; 
  
    // To store the current maximum 
    // Initialized to 0 since there are only 
    // positive elements in the array 
    int max = 0; 
    for (int i = 0; i < n; i++)  
    { 
  
        // i is a valid index 
        if (max < arr[i])  
        { 
  
            // Update the maximum so far 
            max = arr[i]; 
  
            // Increment the counter 
            cnt++; 
        } 
    } 
    return cnt; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = { 1, 2, 3, 4 }; 
    int n = arr.length; 
  
    System.out.println(countIndices(arr, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

