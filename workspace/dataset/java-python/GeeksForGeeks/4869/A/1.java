

// Java program to print array elements in 
// alternative increasing and decreasing 
// order 
import java.util.*; 
class Solution 
{ 
   
// Function to print array elements in 
// alternative increasing and decreasing 
// order 
static void printArray(int arr[], int n) 
{ 
    // First sort the array in increasing order 
    Arrays.sort(arr); 
   
    int l = 0, r = n - 1, flag = 0, i; 
   
    // start with 2 elements in 
    // increasing order 
    int k = 2; 
   
    // till all the elements are not printed 
    while (l <= r) { 
        // printing the elements in 
        // increasing order 
        if (flag == 0) { 
            for (i = l; i < l + k && i <= r; i++) 
                System.out.print(arr[i] + " "); 
   
            flag = 1; 
            l = i; 
        } 
        else // printing the elements in 
        // decreasing order 
        { 
            for (i = r; i > r - k && i >= l; i--) 
                System.out.print(arr[i] + " "); 
   
            flag = 0; 
            r = i; 
        } 
   
        // increasing the number of elements 
        // to printed in next iteration 
        k++; 
    } 
} 
   
// Driver Code 
public static void main(String args[]) 
{ 
    int n = 6; 
   
    int arr[] = { 1, 2, 3, 4, 5, 6 }; 
   
    printArray(arr, n); 
   
  
} 
  
} 
//contributed by Arnab Kundu 

