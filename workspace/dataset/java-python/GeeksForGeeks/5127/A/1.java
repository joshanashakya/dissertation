

// Java Program to print triangular number series till n 
import java.util.*; 
  
class GFG { 
      
    // Function to find triangular number 
    static void triangular_series(int n) 
    { 
        int i, j = 1, k = 1; 
       
        // For each iteration increase j by 1 
        // and add it into k 
        for (i = 1; i <= n; i++) { 
  
            System.out.printf("%d ", k); 
            j = j + 1; // Increasing j by 1 
            k = k + j; // Add value of j into k and update k 
        } 
    } 
      
    // Driver function  
    public static void main(String[] args)  
    { 
            int n = 5; 
            triangular_series(n); 
    } 
} 
          
// This code is contributed by Arnav Kr. Mandal. 

