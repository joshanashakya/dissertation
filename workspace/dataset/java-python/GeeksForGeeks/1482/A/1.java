

// Java implementation to find original  
// array from the encrypted array 
  
class GFG 
{ 
    // Finds and prints the elements  
    // of the original array 
    static void findAndPrintOriginalArray(int arr[],  
                                          int n) 
    { 
        // total sum of elements 
        // of encrypted array 
        int arr_sum = 0; 
        for (int i = 0; i < n; i++) 
            arr_sum += arr[i]; 
  
        // total sum of elements 
        // of original array 
        arr_sum = arr_sum / (n - 1); 
  
        // calculating and displaying 
        // elements of original array 
        for (int i = 0; i < n; i++) 
            System.out.print(arr_sum - arr[i] + " "); 
    } 
  
    // Driver program to test above 
    public static void main (String[] args) 
    { 
        int arr[] = {10, 14, 12, 13, 11}; 
        int n =arr.length; 
        findAndPrintOriginalArray(arr, n); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

