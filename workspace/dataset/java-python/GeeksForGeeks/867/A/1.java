

// Java program to find the minimum 
// product of sum of pair of element 
// in array arr[] 
import java.util.*; 
  
class GFG{ 
   
// Function to find the minimum 
// product 
static int minimumProduct(int[] arr, int n) 
{ 
   
    // Sort the array using STL 
    // sort() function 
    Arrays.sort(arr); 
   
    // Intialise product to 1 
    int product = 1; 
   
    for (int i = 0; i < n; i += 2) { 
   
        // Find product of sum of 
        // all pairs 
        product *= (arr[i] + arr[i + 1]); 
    } 
   
    // Return the product 
    return product; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 6, 3, 1, 7, 8 }; 
    int n = arr.length; 
   
    // Function call to find product 
    System.out.print(minimumProduct(arr, n) +"\n"); 
} 
} 
  
// This code is contributed by sapnasingh4991 

