

// A java program to check the given 
// subarray is prime or not 
import java.io.*; 
  
public class GFG { 
  
    // function to check the array 
    static boolean isPrime(int a[], 
                           int lower,  
                           int upper) 
    { 
        int n = 0; 
  
        // Calculate the sum of 
        // the subarray 
        for (int i = lower - 1; 
             i <= upper - 1; i++) 
            n += a[i]; 
  
        // check the sum of the 
        // subarray is prime or 
        // not (Corner case) 
        if (n <= 1) 
            return false; 
  
        // Check from 2 to n-1 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        // taking input 
        int a[] = { 1, 2, 3, 5, 5, 4, 7, 8, 9 }; 
        int lower = 3, upper = 6; 
  
        if (isPrime(a, lower, upper)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by Sam007. 

