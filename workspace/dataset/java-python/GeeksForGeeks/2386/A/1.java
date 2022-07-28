

// Java implementation of the approach 
import java.io.*; 
  
class GFG 
{ 
      
// Function that returns true if the number 
// represented by arr[] is even in base r 
static boolean isEven(int arr[], int n, int r) 
{ 
  
    // If the base is even, then 
    // the last digit is checked 
    if (r % 2 == 0) 
    { 
        if (arr[n - 1] % 2 == 0) 
            return true; 
    } 
  
    // If base is odd, then the 
    // number of odd digits are checked 
    else { 
  
        // To store the count of odd digits 
        int oddCount = 0; 
        for (int i = 0; i < n; ++i) { 
            if (arr[i] % 2 != 0) 
                oddCount++; 
        } 
        if (oddCount % 2 == 0) 
            return true; 
    } 
  
    // Number is odd 
    return false; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
      
    int arr[] = { 1, 0 }; 
    int n = arr.length; 
    int r = 2; 
  
    if (isEven(arr, n, r)) 
  
        System.out.println ("Even"); 
    else
      
        System.out.println("Odd"); 
} 
} 
  
// This code is contributed by jit_t. 

