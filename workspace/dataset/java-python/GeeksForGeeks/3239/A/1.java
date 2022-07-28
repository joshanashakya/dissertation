

// Java rogram to check if the XOR 
// of an array is Even or Odd 
import java.util.*; 
  
class GFG{ 
  
// Function to check if the XOR of 
// an array of integers is Even or Odd 
static String check(int []arr, int n) 
{ 
    int count = 0; 
  
    for (int i = 0; i < n; i++) { 
  
        // Count the number 
        // of odd elements 
        if ((arr[i] & 1)!=0) 
            count++; 
    } 
  
    // If count of odd elements 
    // is odd, then XOR will be odd 
    if ((count & 1)!=0) 
        return "Odd"; 
  
    // Else even 
    else
        return "Even"; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int []arr = { 3, 9, 12, 13, 15 }; 
    int n = arr.length; 
  
    // Function call 
    System.out.println(check(arr, n)); 
} 
} 
  
// This code is contributed by Surendra_Gangwar 

