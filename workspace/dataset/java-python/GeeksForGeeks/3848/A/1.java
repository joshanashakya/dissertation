

// Java implementation of the approach 
class GFG 
{ 
  
// Utility function to print the 
// elements of an array 
static void printArray(int arr[], int n) 
{ 
    for (int i = 0; i < n; i++)  
    { 
        System.out.print(arr[i] + " "); 
    } 
} 
  
  
  
  
// Function to generate the array 
// with the given operations 
static void generateArr(int arr[], int n) 
{ 
  
    // Base cases 
    if (n == 0) 
        return; 
    if (n == 1)  
    { 
        System.out.print(arr[0]); 
        return; 
    } 
  
    // To suffixMax[i] will store the maximum 
    // element in the subarray arr[i...n-1] 
    int []suffixMax = new int[n]; 
    suffixMax[n - 1] = arr[n - 1]; 
    for (int i = n - 2; i >= 0; i--) 
        suffixMax[i] = Math.max(arr[i],  
                                suffixMax[i + 1]); 
  
    // To store the minimum element on the left 
    int minSoFar = arr[0]; 
  
    // The first element has no 
    // element on its left 
    arr[0] = suffixMax[1]; 
  
    // From the second element to the 
    // second last element 
    for (int i = 1; i < n - 1; i++)  
    { 
  
        // Store a copy of the currene element 
        int temp = arr[i]; 
  
        // Absolute difference of the maximum 
        // element to the right and the 
        // minimum element to the left 
        arr[i] = Math.abs(suffixMax[i + 1] -  
                                 minSoFar); 
  
        // Update the minimum element so far 
        minSoFar = Math.min(minSoFar, temp); 
    } 
  
    // The last element has no 
    // element on its right 
    arr[n - 1] = minSoFar; 
  
    // Print the updated array 
    printArray(arr, n); 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int arr[] = { 1, 5, 2, 4, 3 }; 
    int n = arr.length; 
  
    generateArr(arr, n); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

