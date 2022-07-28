

// Java program to check if a number is pronic or not 
  
import java.io.*; 
import java.util.*; 
import java.math.*; 
  
class GFG  
{ 
  
    // Function to check Pronic Number 
    static boolean pronic_check(int n)  
    { 
        int x = (int)(Math.sqrt(n)); 
      
        // Checking Pronic Number by  
        // multiplying consecutive numbers 
        if (x * (x + 1) == n) 
            return true; 
        else
            return false; 
    } 
      
    // Driver Code 
    public static void main(String[] args)  
    { 
        int n = 56;         
        if (pronic_check(n)==true) 
            System.out.println("YES"); 
        else
            System.out.println("NO"); 
    } 
} 

