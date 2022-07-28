

// Java  program to find the first k digits of n^n 
  
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class KDigitSquare 
{ 
      /* function that manually calculates  
         n^n and then removes digits until  
         k digits remain */
    public static long  firstkdigits(int n, int k) 
    { 
        //take log10 of n^n.  
        // log10(n^n) = n*log10(n) 
        double product = n * Math.log10(n); 
       
       /* We will now try to separate the decimal  
          and integral part of the /product. The  
          floor function returns the smallest integer 
          less than or equal to the argument. So in 
          this case, product - floor(product) will 
          give us the decimal part of product */
        double decimal_part = product - Math.floor(product); 
       
        // we will now exponentiate this back by  
        // raising 10 to the power of decimal part 
        decimal_part = Math.pow(10, decimal_part); 
       
        /* We now try to find the power of 10 by  
           which we will have to multiply the decimal  
           part to obtain our final answer*/
        double digits = Math.pow(10, k - 1), i = 0; 
          
        return ((long)(decimal_part * digits)); 
    } 
  
    // driver function 
    public static void main (String[] args) 
    { 
        int n = 1450; 
        int k = 6; 
        System.out.println(firstkdigits(n,k)); 
    } 
} 
  
/* This code is contributed by Mr. Somesh Awasthi */

