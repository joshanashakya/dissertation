

// Java program to find minimum range 
// increments to sort an array 
  
  
import java.io.*; 
  
class GFG { 
  
// Function to find minimum range 
// increments to sort an array 
static int minMovesToSort(int arr[], int n) 
{ 
    int moves = 0; 
  
    int i, mn = arr[n - 1]; 
  
    for (i = n - 2; i >= 0; i--) { 
  
        // If current element is found greater than 
        // last element 
        // Increment all terms in 
        // range i+1 to n-1 
        if (arr[i] > mn) 
            moves += arr[i] - mn; 
  
        mn = arr[i]; // Minimum in range i to n-1 
    } 
  
    return moves; 
} 
  
// Driver Code 
  
  
    public static void main (String[] args) { 
        int arr[] = { 3, 5, 2, 8, 4 }; 
  
    int n = arr.length; 
  
    System.out.println( minMovesToSort(arr, n)); 
    } 
} 
// This code is contributed by anuj_67.. 

