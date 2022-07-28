

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
    // Function to return the maximum count of  
    // selection possible from the given array  
    // following the given process 
    static int maxSelectionCount(int a[], int n)  
    { 
        // Initialize result 
        int res = 0; 
  
        // Sorting the array 
        Arrays.sort(a); 
  
        // Initialize the select variable 
        int select = 1; 
  
        // Loop through array 
        for (int i = 0; i < n; i++) 
        { 
            // If selection is possible 
            if (a[i] >= select)  
            { 
                res++; // Increment result 
                select++; // Increment selection variable 
            } 
        } 
  
        return res; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int arr[] = {4, 2, 1, 3, 5, 1, 4}; 
  
        int N = arr.length; 
  
        System.out.println(maxSelectionCount(arr, N)); 
    } 
} 
  
// This code contributed by Rajput-Ji 

