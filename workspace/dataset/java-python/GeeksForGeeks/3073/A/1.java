

// Java program to find modular inverse of  
// all numbers from 1 to n using naive 
// method 
import java.io.*; 
  
class GFG { 
      
    // A naive method to find modular 
    // multiplicative inverse of 'a' 
    // under modulo 'prime' 
    static int modInverse(int a, int prime) 
    { 
        a = a % prime; 
        for (int x = 1; x  <prime; x++) 
        if ((a * x) % prime == 1) 
            return x; 
          
        return -1; 
    } 
      
    static void printModIverses(int n, int prime) 
    { 
        for (int i = 1; i <= n; i++) 
        System.out.print(modInverse(i, prime) + " "); 
    } 
      
    // Driver Program 
    public static void main(String args[]) 
    { 
        int n = 10, prime = 17; 
        printModIverses(n, prime); 
    } 
} 
  
  
// This code is contributed by Nikita Tiwari. 

