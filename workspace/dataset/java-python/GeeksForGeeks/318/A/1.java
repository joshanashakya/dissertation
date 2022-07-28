

// Java implementation of the approach 
import java.io.*; 
  
class GFG  
{ 
  
// Function to return the length of the 
// longest sub-array having positive XOR 
static int StrictlyPositiveXor(int []A, int N) 
{ 
  
    // To store the XOR 
    // of all the elements 
    int allxor = 0; 
  
    // To check if all the 
    // elements of the array are 0s 
    boolean checkallzero = true; 
  
    for (int i = 0; i < N; i += 1)  
    { 
  
        // Take XOR of all the elements 
        allxor ^= A[i]; 
  
        // If any positive value is found 
        // the make the checkallzero false 
        if (A[i] > 0) 
            checkallzero = false; 
    } 
  
    // If complete array is the answer 
    if (allxor != 0) 
        return N; 
  
    // If all elements are equal to zero 
    if (checkallzero) 
        return -1; 
  
    // Initialize l and r 
    int l = N, r = -1; 
  
    for (int i = 0; i < N; i += 1) 
    { 
  
        // First positive value of the array 
        if (A[i] > 0)  
        { 
            l = i + 1; 
            break; 
        } 
    } 
    for (int i = N - 1; i >= 0; i -= 1)  
    { 
  
        // Last positive value of the array 
        if (A[i] > 0)  
        { 
            r = i + 1; 
            break; 
        } 
    } 
  
    // Maximum length among 
    // these two subarrays 
    return Math.max(N - l, r - 1); 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int A[] = { 1, 0, 0, 1 }; 
  
    int N = A.length; 
  
    System.out.print(StrictlyPositiveXor(A, N)); 
} 
} 
  
// This code is contributed by anuj_67.. 

