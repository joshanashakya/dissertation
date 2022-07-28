

// Java program to find LCM of  
// array of number is divisible  
// by a prime number k or not 
import java.lang.*; 
import java.util.*; 
  
class GFG 
{ 
    // Function to check any number  
    // of array is divisible by k or not 
    static boolean func( int a[], int k) 
    { 
        // If any array element is divisible 
        // by k, then LCM of whole array 
        // should also be divisible. 
        for (int i = 0; i < a.length; i++) 
            if (a[i] % k == 0) 
            return true; 
        return false; 
    } 
  
    // Driver Code 
    public static void main(String args[]) 
    { 
        int[] a = {14, 27, 38, 76, 84}; 
        int k = 19; 
        boolean res = func(a, k); 
        System.out.println(res); 
    } 
} 

