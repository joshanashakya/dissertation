

// Java program to find sum of all the elements 
// in an array divisible by a given number K 
  
import java.io.*; 
  
class GFG { 
  
// Function to find sum of all the elements 
// in an array divisible by a given number K 
static int findSum(int arr[], int n, int k) 
{ 
    int sum = 0; 
  
    // Traverse the array 
    for (int i = 0; i < n; i++) { 
  
        // If current element is divisible by k 
        // add it to sum 
        if (arr[i] % k == 0) { 
            sum += arr[i]; 
        } 
    } 
  
    // Return calculated sum 
    return sum; 
} 
  
    // Driver code 
    public static void main (String[] args) { 
      
    int arr[] = { 15, 16, 10, 9, 6, 7, 17 }; 
    int n = arr.length; 
    int k = 3; 
  
    System.out.println( findSum(arr, n, k)); 
    } 
} 
  
// this code is contributed by anuj_67.. 

