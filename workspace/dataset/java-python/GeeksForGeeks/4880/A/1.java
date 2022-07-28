

// Java for printing smallest n number in order 
import java.util.*; 
  
class GFG  
{ 
  
  
// Function to print smallest n numbers 
static void printSmall(int arr[], int asize, int n) 
{ 
    // Make copy of array 
    int []copy_arr = Arrays.copyOf(arr,asize); 
  
    // Sort copy array 
    Arrays.sort(copy_arr); 
  
    // For each arr[i] find whether 
    // it is a part of n-smallest 
    // with binary search 
    for (int i = 0; i < asize; ++i) 
    { 
        if (Arrays.binarySearch(copy_arr,0,n, arr[i])>-1) 
            System.out.print(arr[i] + " "); 
    } 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = { 1, 5, 8, 9, 6, 7, 3, 4, 2, 0 }; 
    int asize = arr.length;  
    int n = 5; 
    printSmall(arr, asize, n); 
} 
} 
  
// This code is contributed by Princi Singh 

