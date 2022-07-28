

// Java implementation of the above approach 
  
import java.io.*; 
  
class GFG { 
  
  
// Function to Check if the array 
// has an element which is equal to 
// product of all the remaining elements 
static boolean CheckArray(int arr[], int n) 
{ 
    int prod = 1; 
  
    // Calculate the product of all the elements 
    for (int i = 0; i < n; ++i) 
        prod *= arr[i]; 
  
    // Return true if any such element is found 
    for (int i = 0; i < n; ++i) 
        if (arr[i] == prod / arr[i]) 
            return true; 
  
    // If no element is found 
    return false; 
} 
  
  
  
    public static void main (String[] args) { 
            int arr[] = { 1, 2, 12, 3, 2 }; 
    int n =arr.length; 
  
    if (CheckArray(arr, n)) 
        System.out.println("YES"); 
  
    else
        System.out.println("NO"); 
  
    } 
} 
// This code is contributed by shs.. 

