

// Java program to find the array formed 
// from the difference of each element  
// from the largest element in the given array 
import java.util.*; 
  
class GFG 
{ 
static void difference(int arr[], int n) 
{ 
    // Initializing current largest  
    // as the first element. 
    int largest = arr[0]; 
    int i; 
  
    // For loop to compute  
    // the largest element 
    for (i = 0; i < n; i++) 
    { 
  
        // Checking if the current element  
        // is greater than the defined largest 
        if (largest < arr[i]) 
            largest = arr[i]; 
    } 
  
    // For loop to replace the elements  
    // in the array with the difference  
    for (i = 0; i < n; i++) 
        arr[i] = largest - arr[i]; 
  
    // For loop to print the elements 
    for (i = 0; i < n; i++) 
        System.out.print(arr[i] + " "); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 10, 5, 9, 3, 2 }; 
    int n = arr.length; 
    difference(arr, n); 
} 
} 
  
// This code is contributed by 29AjayKumar 

