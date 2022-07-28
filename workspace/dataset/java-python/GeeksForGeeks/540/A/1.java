

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to return the maximum 
// possible pairs of gloves 
static int cntgloves(int arr[], int n) 
{ 
    // To store the required count 
    int count = 0; 
  
    // Sort the original array 
    Arrays.sort(arr); 
  
    for (int i = 0; i < n - 1😉 
    { 
  
        // A valid pair is found 
        if (arr[i] == arr[i + 1])  
        { 
            count++; 
  
            // Skip the elements of 
            // the current pair 
            i = i + 2; 
        } 
  
        // Current elements doesn't make 
        // a valid pair with any other element 
        else
        { 
            i++; 
        } 
    } 
    return count; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 6, 5, 2, 3, 5, 2, 2, 1 }; 
    int n = arr.length; 
  
    System.out.println(cntgloves(arr, n)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

