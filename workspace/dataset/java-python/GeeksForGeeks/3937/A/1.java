

// Java implementation of the above approach 
import java.io.*; 
  
class GFG { 
      
    static boolean isPossibleToZero(int a[], int n) 
    {  
        // converting array element into number 
        int num = 0; 
        for (int i = 0; i < n; i++) 
            num = num * 10 + a[i];  
      
        // Check if divisible by 11 
        return (num % 11 == 0); 
    } 
      
    // Driver program 
    public static void main (String[] args) 
    { 
  
        int arr[] = {0, 1, 1, 0}; 
        int n = arr.length; 
        if (isPossibleToZero(arr, n)) 
                System.out.println( "YES"); 
        else
                System.out.println ("NO"); 
    } 
} 
  
// This code is contributed by @ajit 

