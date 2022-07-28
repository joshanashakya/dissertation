

// Program to find last two digits of  
// n-th Fibonacci number 
import java.util.Arrays; 
class GFG { 
      
    // Fills f[] with first 300  
    // fibonacci numbers 
    static void precomput(long f[]) 
    { 
        /* 0th and 1st number of the 
        series are 0 and 1*/
        f[0] = 0; 
        f[1] = 1; 
        
        /* Add the previous 2 numbers in  
        the series and store last two  
        digits of result */
        for (int i = 2; i < 300; i++) 
            f[i] = (f[i-1] + f[i-2]) % 100; 
    } 
        
    // Returns last two digits of n'th 
    // Fibonacci Number 
    static long findLastDigit(long f[], int n) 
    { 
        return (f[(n%300)]); 
    } 
        
    /* Driver program to test above function */
    public static void main (String args[]) 
    { 
        // Precomputing units digit of  
        // first 300 Fibonacci numbers 
        long f[] = new long[300]; 
        Arrays.fill(f,0); 
        precomput(f); 
       
        int n = 1; 
        System.out.println(findLastDigit(f, n)); 
        n = 61; 
        System.out.println(findLastDigit(f, n)); 
        n = 7; 
        System.out.println(findLastDigit(f, n)); 
        n = 67; 
        System.out.println(findLastDigit(f, n)); 
    } 
} 
  
/*This code is contributed by Nikita Tiwari.*/

