

// Java Implementation to print all the 
// Maximal Increasing Sub-array of array 
import java.util.*; 
  
class GFG 
{ 
  
// Function to print each of maximal 
// contiguous increasing subarray 
static void printmaxSubseq(int arr[], int n) 
{ 
    int i; 
  
    // Loop to iterate through the array and print 
    // the maximal contiguous increasing subarray. 
    for (i = 0; i < n ; i++)  
    { 
        // Condition to check whether the element at i, is 
        // greater than its next neighbouring element or not. 
        if (i + 1 < n && arr[i] < arr[i + 1]) 
            System.out.print(arr[i] + " "); 
        else
            System.out.print(arr[i] + "\n"); 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 9, 8, 11, 13, 10, 15, 14, 16, 20, 5 }; 
    int n = arr.length; 
    printmaxSubseq(arr, n); 
} 
} 
  
// This code is contributed by 29AjayKumar 

