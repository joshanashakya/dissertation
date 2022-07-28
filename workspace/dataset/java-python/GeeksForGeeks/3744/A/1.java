

// Java program to find the number of step to reduce n to 1 
  
import java.io.*; 
class GFG 
{ 
    // Function to return number of steps for reduction 
    static int stepRequired(int n) 
    { 
        // builtin function to count set bits 
        return Integer.bitCount(n - 1); 
    } 
      
    // Driver program 
    public static void  main(String []args) 
    { 
        int n = 94; 
        System.out.println(stepRequired(n));  
      
    } 
} 
  
  
// This code is contributed by  
// ihritik 

