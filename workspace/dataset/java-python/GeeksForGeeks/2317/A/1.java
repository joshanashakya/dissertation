

// Java Program to print Hosoya's  
// triangle of height n. 
import java.util.*; 
  
class GFG { 
      
    static int Hosoya(int n, int m) 
    { 
        // Base case 
        if ((n == 0 && m == 0) || 
            (n == 1 && m == 0) ||  
            (n == 1 && m == 1) ||  
            (n == 2 && m == 1)) 
            return 1; 
       
        // Recursive step 
        if (n > m) 
            return Hosoya(n - 1, m) 
                   + Hosoya(n - 2, m); 
              
        else if (m == n) 
            return Hosoya(n - 1, m - 1) 
                    + Hosoya(n - 2, m - 2); 
              
        else
            return 0; 
    } 
       
    // Print the Hosoya triangle of height n. 
    static void printHosoya(int n) 
    { 
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j <= i; j++)  
                System.out.print(Hosoya(i, j)  
                                        + " ");        
       
            System.out.println(""); 
        } 
    } 
  
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        int n = 5; 
        printHosoya(n); 
           
    } 
} 
  
// This code is contributed by  Arnav Kr. Mandal. 

