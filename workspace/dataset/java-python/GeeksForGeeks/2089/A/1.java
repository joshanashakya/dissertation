

// Java implementation of the approach 
import java.util.Arrays; 
class GFG { 
  
    // Utility function to print 
    // the contents of an array 
    static void printArr(int arr[], int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
  
    // Function to sort elements 
    // in between multiples of k 
    static void sortArr(int arr[], int n, int k) 
    { 
  
        // To store the index of 
        // previous multiple of k 
        int prev = -1; 
        for (int i = 0; i < n; i++) { 
            if (arr[i] % k == 0) { 
  
                // If it is not the 
                // first multiple of k 
                if (prev != -1) 
  
                    // Sort the elements in between  
                    // the previous and the current  
                    // multiple of k 
                    Arrays.sort(arr, prev + 1, i); 
  
                // Update previous to be current 
                prev = i; 
            } 
        } 
  
        // Print the updated array 
        printArr(arr, n); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 2, 1, 13, 3, 7, 8, 21, 13, 12 }; 
        int n = arr.length; 
        int k = 2; 
        sortArr(arr, n, k); 
    } 
} 

