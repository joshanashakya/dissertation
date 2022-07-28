

// Java program to print the product 
// of the consecutive elements. 
import java .io.*; 
  
class GFG 
{ 
// Function to print pairwise 
// consecutive product 
static void pairwiseProduct(int[] arr,  
                            int n) 
{ 
    int prod = 1; 
    for (int i = 0; i < n - 1; i++) 
    { 
  
        // multiply the alternate numbers 
        prod = arr[i] * arr[i + 1]; 
        System.out.print(prod + " "); 
    } 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int[] arr = { 4, 10, 15, 5, 6 }; 
    int n = arr.length; 
  
    pairwiseProduct(arr, n); 
} 
} 
  
// This code is contributed  
// by anuj_67.. 

