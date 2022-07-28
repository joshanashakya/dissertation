

// Java program to calculate nPr 
  
import java.util.*; 
  
public class GFG { 
  
    static int fact(int n) 
    { 
        if (n <= 1) 
            return 1; 
        return n * fact(n - 1); 
    } 
  
    static int nPr(int n, int r) 
    { 
        return fact(n) / fact(n - r); 
    } 
  
    public static void main(String args[]) 
    { 
        int n = 5; 
        int r = 2; 
  
        System.out.println(n + "P" + r + " = "
                           + nPr(n, r)); 
    } 
} 

