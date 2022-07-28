

// Java program to count minimum length 
// subarray of 1's in a binary array. 
import java.io.*; 
  
class GFG  
{ 
      
// Function to count minimum length subarray 
// of 1's in binary array arr[0..n-1] 
static int getMinLength(double arr[], int n) 
{ 
    int count = 0; // intitialize count 
    int result = Integer.MAX_VALUE; // initialize result 
  
    for (int i = 0; i < n; i++)  
    { 
        if (arr[i] == 1)  
        { 
            count++; 
        } 
        else 
        { 
            if (count != 0) 
                result = Math.min(result, count); 
            count = 0; 
        } 
    } 
  
    return result; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    double arr[] = { 1, 1, 0, 0, 1, 1, 1, 0, 
                1, 1, 1, 1 }; 
    int n = arr.length; 
    System.out.println (getMinLength(arr, n)); 
  
} 
} 
  
// This code is contributed by ajit. 

