

// Java implementation of the above approach 
import java.util.*; 
  
class GFG{ 
   
// Function that arrange the array such that 
// all absolute difference between adjacent 
// element are sorted 
static void sortedAdjacentDifferences(int arr[], int n) 
{ 
    // To store the resultant array 
    int []ans = new int[n]; 
   
    // Sorting the given array 
    // in ascending order 
    Arrays.sort(arr); 
   
    // Variable to represent left and right 
    // ends of the given array 
    int l = 0, r = n - 1; 
   
    // Traversing the answer array in reverse 
    // order and arrange the array elements from 
    // arr[] in reverse order 
    for (int i = n - 1; i >= 0; i--) { 
   
        // Inserting elements in zig-zag manner 
        if (i % 2 == 1) { 
            ans[i] = arr[l]; 
            l++; 
        } 
        else { 
            ans[i] = arr[r]; 
            r--; 
        } 
    } 
   
    // Displaying the resultant array 
    for (int i = 0; i < n; i++) { 
        System.out.print(ans[i]+ " "); 
    } 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int arr[] = { 5, -2, 4, 8, 6, 4, 5 }; 
    int n = arr.length; 
   
    // Function Call 
    sortedAdjacentDifferences(arr, n); 
} 
} 
  
// This code is contributed by Princi Singh 

