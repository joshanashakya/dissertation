

// Java program to find factorial of given number 
  
import java.io.*; 
  
class GFG { 
  
    static int factorial(int n) 
    { 
          
        // single line to find factorial 
        return (n == 1 || n == 0) ? 1 : n *  
                                factorial(n - 1); 
    } 
  
    public static void main(String[] args) 
    { 
          
        int num = 5; 
          
        System.out.println("Factorial of " + num +  
                           " is " + factorial(num)); 
    } 
} 
  
// This code is contributed by Ajit. 

