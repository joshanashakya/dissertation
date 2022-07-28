

// Java implementation of the approach 
import java.util.*; 
      
class GFG 
{ 
  
// Function that returns true if the 
// number formed by the last digits of 
// all the elements is divisible by 10 
static boolean isDivisible(int arr[], int n) 
{ 
    // Last digit of the last element 
    int lastDigit = arr[n - 1] % 10; 
  
    // Number formed will be divisible by 10 
    if (lastDigit == 0) 
        return true; 
  
    return false; 
} 
  
// Driver code 
static public void main ( String []arg) 
{ 
    int arr[] = { 12, 65, 46, 37, 99 }; 
    int n = arr.length; 
  
    if (isDivisible(arr, n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by Rajput-Ji 

