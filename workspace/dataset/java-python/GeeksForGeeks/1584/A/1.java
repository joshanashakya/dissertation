

// Java program to find modular  
// inverse of a under modulo m 
// This program works only if  
// m is prime. 
import java.io.*; 
  
class GFG { 
  
    // Function to find modular inverse of a  
    // under modulo m Assumption: m is prime 
    static void modInverse(int a, int m) 
    { 
        int g = gcd(a, m); 
        if (g != 1) 
            System.out.println("Inverse doesn't exist"); 
        else 
        { 
            // If a and m are relatively prime, then modulo inverse 
            // is a^(m-2) mode m 
            System.out.println("Modular multiplicative inverse is " + 
                                power(a, m - 2, m)); 
        } 
    } 
      
    // To compute x^y under modulo m 
    static int power(int x, int y, int m)  
    { 
        if (y == 0) 
            return 1; 
          
        int p = power(x, y / 2, m) % m; 
        p = (p * p) % m; 
      
        if (y % 2 == 0) 
            return p; 
        else
            return (x * p) % m; 
    } 
      
    // Function to return gcd of a and b 
    static int gcd(int a, int b)  
    { 
        if (a == 0) 
            return b; 
        return gcd(b % a, a); 
    } 
      
    // Driver Program 
    public static void main(String args[]) 
    { 
        int a = 3, m = 11; 
        modInverse(a, m); 
    } 
} 
  
// This code is contributed by Nikita Tiwari. 

