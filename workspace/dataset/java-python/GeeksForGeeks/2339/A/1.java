

// Java program to find the smallest  
// number to be added to make the  
// sum of left and right subarrays equal 
import java.io.*; 
import java.util.*; 
  
class GFG  
{ 
  
// Function to find the minimum  
// value to be added 
static int findMinEqualSums(int[] a, int N) 
{ 
    // Variable to store  
    // entire array sum 
    int sum = 0; 
    for (int i = 0; i < N; i++)  
    { 
        sum += a[i]; 
    } 
  
    // Variables to store sum of 
    // subarray1 and subarray 2 
    int sum1 = 0, sum2 = 0; 
  
    // minimum value to be added 
    int min = Integer.MAX_VALUE; 
  
    // Traverse through the array 
    for (int i = 0; i < N; i++) 
    { 
        // Sum of both halves 
        sum1 += a[i]; 
        sum2 = sum - sum1; 
  
        // Calculate minimum number  
        // to be added 
        if (Math.abs(sum1 - sum2) < min)  
        { 
            min = Math.abs(sum1 - sum2); 
        } 
  
        if (min == 0)  
        { 
            break; 
        } 
    } 
  
    return min; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int[] a = { 3, 2, 1, 5, 7, 8 }; 
  
    // Length of array 
    int N = a.length; 
  
    System.out.println(findMinEqualSums(a, N)); 
} 
} 

