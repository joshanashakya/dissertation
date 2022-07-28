

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
  
  
// To store the count of 
// negative integers 
static int cnt_neg; 
  
// Check if zero exists 
static boolean exists_zero; 
  
// Function to find the count of 
// negative integers and check 
// if zero exists in the array 
static void preProcess(int []arr, int n) 
{ 
    for (int i = 0; i < n; i++)  
    { 
        if (arr[i] < 0) 
            cnt_neg++; 
        if (arr[i] == 0) 
            exists_zero = true; 
    } 
} 
  
// Function that returns true if array 
// elements can be made positive by 
// changing signs exactly k times 
static boolean isPossible(int k) 
{ 
    if (!exists_zero)  
    { 
        if (k >= cnt_neg && (k - cnt_neg) % 2 == 0) 
            return true; 
        else
            return false; 
    } 
    else 
    { 
        if (k >= cnt_neg) 
            return true; 
        else
            return false; 
    } 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int arr[] = { -1, 2, -3, 4, 5 }; 
    int n = arr.length; 
  
    // Pre-processing 
    preProcess(arr, n); 
  
    int queries[] = { 1, 2, 3, 4 }; 
    int q = arr.length; 
  
    // Perform queries 
    for (int i = 0; i < q; i++)  
    { 
        if (isPossible(queries[i])) 
            System.out.println( "Yes"); 
        else
            System.out.println( "No"); 
    } 
} 
} 
  
// This code is contributed by anuj_67.. 

