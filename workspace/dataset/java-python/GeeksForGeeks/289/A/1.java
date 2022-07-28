

// Java implementation of the approach 
class GFG { 
  
    // Utility function to print 
    // the contents of an array 
    static void printArray(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
  
    // Function to remove the minimum value of 
    // the array from every element of the array 
    static void removeMin(int arr[], int n) 
    { 
        int i, minVal = arr[0]; 
  
        // Get the minimum value from the array 
        for (i = 1; i < n; i++) 
            minVal = Math.min(minVal, arr[i]); 
  
        // Remove the minimum value from 
        // every element of the array 
        for (i = 0; i < n; i++) 
            arr[i] = arr[i] - minVal; 
    } 
  
    // Function to remove every element of the 
    // array from the maximum value of the array 
    static void removeFromMax(int arr[], int n) 
    { 
        int i, maxVal = arr[0]; 
  
        // Get the maximum value from the array 
        for (i = 1; i < n; i++) 
            maxVal = Math.max(maxVal, arr[i]); 
  
        // Remove every element of the array from 
        // the maximum value of the array 
        for (i = 0; i < n; i++) 
            arr[i] = maxVal - arr[i]; 
    } 
  
    // Function to print the modified array 
    // after k operations 
    static void modifyArray(int arr[], int n, int k) 
    { 
  
        // If k is odd then remove the minimum element 
        // of the array from every element of the array 
        if (k % 2 == 0) 
            removeMin(arr, n); 
  
        // Else remove every element of the array from 
        // the maximum value from the array 
        else
            removeFromMax(arr, n); 
  
        // Print the modified array 
        printArray(arr, n); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = { 4, 8, 12, 16 }; 
        int n = arr.length; 
        int k = 2; 
        modifyArray(arr, n, k); 
    } 
} 

