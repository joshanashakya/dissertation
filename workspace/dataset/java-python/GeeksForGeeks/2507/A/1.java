

// Java program to Count the  
// numbers within a given range  
// in which when you subtract  
// a number from its reverse,  
// the difference is a product of k 
import java.io.*; 
import java.math.*; 
  
class GFG { 
      
    static boolean isRevDiffDivisible(int x, int k) 
    {  
        // function to check if the number 
        // and its reverse have their  
        // absolute difference divisible by k 
        int n = x; 
        int m = 0; 
        int flag; 
        while (x > 0)  
        {  
            // reverse the number 
            m = m * 10 + x % 10; 
            x /= 10; 
        } 
          
        return (Math.abs(n - m) % k == 0); 
    } 
      
    static int countNumbers(int l, int r, int k) 
    { 
        int count = 0;  
        for (int i = l; i <= r; i++)  
            if (isRevDiffDivisible(i, k))      
                ++count;  
        return count; 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int l = 35, r = 45, k = 5; 
        System.out.println(countNumbers(l, r, k)); 
    } 
} 
  
// This code is contributed  
// by Nikita Tiwari. 

