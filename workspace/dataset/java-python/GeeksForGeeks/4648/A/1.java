

// Java program to find minimal 0 Fibonacci 
// for a prime number p 
import java.io.*; 
  
class FibZero 
{ 
    // Function that returns position of first Fibonacci number 
    // whose modulo p is 0 
    static int findMinZero(int p) 
    { 
        int first = 1, second = 1, number = 2, next = 1; 
        while (next > 0) 
        { 
            // add previous two remainders and  
            // then take its modulo p. 
            next = (first + second) % p; 
            first = second; 
            second = next; 
            number++; 
        } 
        return number; 
    } 
      
    // Driver program 
    public static void main (String[] args)  
    { 
        int p = 7; 
        System.out.println("Minimal zero is " + findMinZero(p)); 
    } 
} 

