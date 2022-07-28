

// Java program to find Product of all the elements 
// in an array divisible by a given number K 
  
import java.io.*; 
  
class GFG { 
  
// Function to find Product of all the elements 
// in an array divisible by a given number K 
static int findProduct(int arr[], int n, int k) 
{ 
    int prod = 1; 
  
    // Traverse the array 
    for (int i = 0; i < n; i++) { 
  
        // If current element is divisible by k 
        // multiply with product so far 
        if (arr[i] % k == 0) { 
            prod *= arr[i]; 
        } 
    } 
  
    // Return calculated product 
    return prod; 
} 
  
// Driver code 
    public static void main (String[] args) { 
        int arr[] = { 15, 16, 10, 9, 6, 7, 17 }; 
    int n = arr.length; 
    int k = 3; 
  
    System.out.println(findProduct(arr, n, k)); 
    } 
} 
  
  
// This code is contributed by inder_verma.. 

