

// Java implementation of the approach 
import java.io.*; 
  
class GFG 
{ 
          
// Function to check if the bitwise AND 
// of the array elements is even or odd 
static void checkEvenOdd(int []arr, int n) 
{ 
    for (int i = 0; i < n; i++)  
    { 
  
        // If at least an even element is present 
        // then the bitwise AND of the 
        // array elements will be even 
        if (arr[i] % 2 == 0)  
        { 
            System.out.print("Even"); 
            return; 
        } 
    } 
    System.out.println("Odd"); 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int []arr = { 2, 12, 20, 36, 38 }; 
    int n = arr.length; 
      
    checkEvenOdd(arr, n); 
} 
} 
  
// This code is contributed by @tushil 

