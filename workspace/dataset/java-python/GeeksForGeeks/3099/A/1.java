

// Java program to count number of strings of 
// size m such that no substring is palindrome. 
import java.io.*; 
  
class GFG { 
      
    // Return the count of strings with 
    // no palindromic substring. 
    static int numofstring(int n, int m) 
    {  
        if (n == 1) 
            return m; 
      
        if (n == 2) 
            return m * (m - 1); 
      
        return m * (m - 1) * (int)Math.pow(m - 2, n - 2); 
    } 
      
    // Driven Program 
    public static void main (String[] args)  
    { 
        int n = 2, m = 3; 
        System.out.println(numofstring(n, m)); 
    } 
} 
  
// This code is contributed by ajit. 

