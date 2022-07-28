

// Java program to make a number odd 
import java.io.*; 
  
class GFG 
{ 
    static int makeOdd(int n) 
    { 
        // Return 1 if already odd 
        if (n % 2 != 0) 
            return 1; 
  
        // Check on dividing with a number when 
        // the result becomes odd Return that number 
        int i; 
        for (i = 2 ; i <= n ; i++) 
  
            // If n is divided by i and n/i is odd 
            // then return i 
            if ((n % i  == 0) && ((n / i) % 2 == 1)) 
                break; 
  
        return i; 
    } 
  
    // Driver code 
    public static void main (String[] args) 
    { 
        int n = 36; 
        int res = makeOdd(n); 
        System.out.println(res); 
    } 
} 
  
// This code is contributed by Pramod Kumar 

