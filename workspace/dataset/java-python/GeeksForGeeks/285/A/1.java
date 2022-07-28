

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
  
// Function that generates the 
// array b[] when n is even 
static void solveEven(int n, int arr[], int b[]) 
{ 
    int left = n - 1; 
  
    // Fill the first half of the final array 
    // with reversed sequence 
    for (int i = 0; i < (n / 2); ++i) 
    { 
        b[i] = arr[left]; 
        left = left - 2; 
        if (left < 0) 
            break; 
    } 
  
    // Fill the second half 
    int right = 0; 
    for (int i = n / 2; i <= n - 1; ++i) 
    { 
        b[i] = arr[right]; 
        right = right + 2; 
        if (right > n - 2) 
            break; 
    } 
} 
  
// Function that generates the 
// array b[] when n is odd 
static void solveOdd(int n, int arr[], int b[]) 
{ 
  
    // Fill the first half of the final array 
    // with reversed sequence 
    int left = n - 1; 
    for (int i = 0; i < (n / 2) + 1; ++i)  
    { 
        b[i] = arr[left]; 
        left = left - 2; 
        if (left < 0) 
            break; 
    } 
  
    // Fill the second half 
    int right = 1; 
    for (int i = (n / 2) + 1; i <= n - 1; ++i)  
    { 
        b[i] = arr[right]; 
        right = right + 2; 
        if (right > n - 2) 
            break; 
    } 
} 
  
// Function to find the final array b[] 
// after n operations of given type 
static void solve(int n, int arr[]) 
{ 
  
    // Create the array b 
    int b[] = new int[n]; 
  
    // If the array size is even 
    if (n % 2 == 0) 
        solveEven(n, arr, b); 
    else
        solveOdd(n, arr, b); 
  
    // Print the final array elements 
    for (int i = 0; i <= n - 1; ++i) 
    { 
        System.out.print( b[i] + " "); 
    } 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int []arr = { 1, 2, 3, 4 }; 
    int n = arr.length; 
      
    solve(n, arr); 
} 
} 
  
// This code is contributed by anuj_67.. 

