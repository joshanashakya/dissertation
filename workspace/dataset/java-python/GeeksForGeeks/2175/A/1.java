

// JAVA Program to print kth prime factor 
import java.io.*; 
import java.math.*; 
  
class GFG{ 
      
    // A function to generate prime factors 
    // of a given number n and return k-th 
    // prime factor 
    static int kPrimeFactor(int n, int k) 
    { 
        // Find the number of 2's that  
        // divide k 
        while (n % 2 == 0) 
        { 
            k--; 
            n = n / 2; 
            if (k == 0) 
             return 2; 
        } 
       
        // n must be odd at this point.  
        // So we can skip one element 
        // (Note i = i +2) 
        for (int i = 3; i <= Math.sqrt(n); i = i + 2) 
        { 
            // While i divides n, store i  
            // and divide n 
            while (n % i == 0) 
            { 
                if (k == 1) 
                  return i; 
       
                k--; 
                n = n / i; 
            } 
        } 
       
        // This condition is to handle the  
        // case where n is a prime number  
        // greater than 2 
        if (n > 2 && k == 1) 
            return n; 
       
        return -1; 
    } 
       
    // Driver Program 
    public static void main(String args[]) 
    { 
        int n = 12, k = 3; 
        System.out.println(kPrimeFactor(n, k)); 
        n = 14; k = 3; 
        System.out.println(kPrimeFactor(n, k)); 
    } 
} 
  
/*This code is contributed by Nikita Tiwari.*/

