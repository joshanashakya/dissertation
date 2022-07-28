

// Java program to find Nth hexadecagon 
// number 
import java.io.*; 
  
class GFG { 
  
    // Function to calculate hexadecagonal 
    // number 
    static long hexadecagonalNum(long n) 
    { 
        return ((14 * n * n) - 12 * n) / 2; 
    } 
      
    // Drivers Code 
    public static void main (String[] args) 
    { 
        long n = 5; 
        System.out.println( n + "th "
          + "Hexadecagonal number : "
              + hexadecagonalNum(n)); 
                
        n = 9; 
        System.out.println( n + "th "
          + "Hexadecagonal number : "
              + hexadecagonalNum(n)); 
    } 
} 
  
// This code contribued by anuj_67. 

