

// Java program to find 
// sum of given series 
import java.util.*; 
  
class GFG { 
      
    // function to find sum of series 
    static long sum(long n) 
    { 
        long root = (long)Math.sqrt(n); 
        long ans = 0; 
       
        for (int i = 1; i <= root; i++)  
            ans += n / i; 
           
        ans = 2 * ans - (root * root); 
          
        return ans; 
    } 
      
    /* Driver code */
    public static void main(String[] args)  
    { 
        long n = 35; 
        System.out.println(sum(n)); 
    } 
} 
      
// This code is contributed by Arnav Kr. Mandal.         

