

// Java program to find nth 
// term of the given series 
import java.io.*; 
  
class GFG { 
  
    // Function to find nth term 
    // of the given series 
    static void findNthTerm(int n) 
    { 
        // Let us find roots of 
        // equation x * (x + 1)/2 = n 
        n = n * 2; 
        int a = 1, b = 1, c = -1 * n; 
        int d = b * b - 4 * a * c; 
        double sqrt_val = Math.sqrt(Math.abs(d)); 
        int x1 = (int)((-b + sqrt_val) / (2 * a)); 
        int x2 = (int)((-b - sqrt_val) / (2 * a)); 
  
        if (x1 >= 1) 
            System.out.println((char)('a' + x1)); 
        else if (x2 >= 1) 
            System.out.println((char)('a' + x2)); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int n = 12; 
        findNthTerm(n); 
  
        n = 288; 
        findNthTerm(n); 
    } 
} 
  
// This code has been contributed 
// by anuj_67. 

