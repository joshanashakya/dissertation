

// Java implementation of  
// above approach 
import java.io.*; 
import java.util.*; 
  
class GFG  
{ 
  
// Function to count such triplets 
static int countTriplets(int arr[], 
                         int n, int m) 
{ 
    int count = 0; 
  
    // Sort the array 
    Arrays.sort(arr); 
    int end, start, mid; 
  
    // three pointer technique 
    for (end = n - 1; end >= 2; end--)  
    { 
        start = 0; mid = end - 1; 
        while (start < mid) 
        { 
  
            // Calculate the product 
            // of a triplet 
            long prod = arr[end] *  
                        arr[start] *  
                        arr[mid]; 
  
            // Check if that product  
            // is greater than m, 
            // decrement mid 
            if (prod > m) 
                mid--; 
  
            // Check if that product  
            // is greater than m, 
            // increment start 
            else if (prod < m) 
                start++; 
  
            // Check if that product  
            // is greater than m,  
            // decrement mid, increment 
            // start and increment the  
            // count of pairs 
            else if (prod == m)  
            { 
                count++; 
                mid--; 
                start++; 
            } 
        } 
    } 
  
    return count; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int []arr = { 1, 1, 1, 1, 1, 1 }; 
    int n = arr.length; 
    int m = 1; 
      
    System.out.println(countTriplets(arr, n, m)); 
} 
} 
  
// This code is contributed  
// by inder_verma. 

