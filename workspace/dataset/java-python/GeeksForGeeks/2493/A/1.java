

// Java program to Check whether a number   
// can be represented by sum of two  
// squares using Fermat Theorem. 
import java.util.*; 
import java.lang.*; 
  
class GFG  
{ 
public static boolean judgeSquareSum(int n)  
{ 
    for (int i = 2; i * i <= n; i++)  
    { 
        int count = 0; 
        if (n % i == 0) 
        { 
            // Count all the prime factors. 
            while (n % i == 0) 
            { 
                count++; 
                n /= i; 
            } 
              
            // Ifany prime factor of the form  
            // (4k+3)(4k+3) occurs an odd  
            // number of times. 
            if (i % 4 == 3 && count % 2 != 0) 
                return false; 
        } 
    } 
      
    // If n itself is a prime number and can  
    // be expressed in the form of 4k + 3 
    // we return false. 
    return n % 4 != 3; 
} 
  
// Driver Code 
public static void main(String argc[]) 
{ 
    int n = 17; 
    if(judgeSquareSum(n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 

