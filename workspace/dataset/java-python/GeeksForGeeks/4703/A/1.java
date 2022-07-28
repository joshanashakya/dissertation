

// Java implementation of the approach  
import java.util.*; 
  
class GFG  
{ 
      
    // Function to return the highest power  
    // of 2 less than or equal to n  
    static int prevPowerof2(int n)  
    {  
        int p = (int)(Math.log(n) / Math.log(2));  
          
        return (int)Math.pow(2, p);  
    }  
      
    // Function to return the smallest power  
    // of 2 greater than or equal to n  
    static int nextPowerOf2(int n)  
    {  
        int p = 1;  
        if ((n == 0) && !((n & (n - 1)) == 0)) 
            return n;  
      
        while (p < n)  
            p <<= 1;  
      
        return p;  
    }  
      
    // Function that returns the minimum  
    // absolute difference between n  
    // and any power of 2  
    static int minDiff(int n)  
    {  
        int low = prevPowerof2(n);  
        int high = nextPowerOf2(n);  
      
        return Math.min(n - low, high - n);  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int n = 6;  
      
        System.out.println(minDiff(n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

