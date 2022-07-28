

// Java Program to find the nth Cake number 
import java.io.*; 
  
class GFG { 
      
    // function for Cake number 
    static int number_cake(int n) 
    { 
          
        // formula for find Cake number 
        // nth term 
        return (n * n * n + 5 * n + 6) / 6; 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        // For 2nd cake Number 
        int n = 2; 
        System.out.println( number_cake(n)); 
      
        // For 8th cake Number 
        n = 8; 
        System.out.println( number_cake(n)); 
          
        // For 25th cake Number 
        n = 25; 
        System.out.println( number_cake(n)); 
    } 
} 
  
// This code is contributed by anuj_67. 

