

// Java program to print the given pattern 
import java.util.*; 
  
class GfG { 
  
    // Function to print pattern for 
    // given value of n 
    static void pattern(int n) 
    { 
        int p, k = 1; 
          
        // Outer "for" loop for number of rows 
        for (int i = 1; i <= n; i++) { 
              
            // set the value of "p" as "k". 
            p = k; 
  
            // Inner "for" loop for number of columns 
            for (int j = 1; j <= i; j++) { 
                  
                // print the values 
                System.out.print(p); 
                System.out.print(" "); 
                  
                // change in value of "p" for 
                // every elements after the  
                // first element of each row . 
                p = p - (n + j - i); 
            } 
              
            // Print the next line 
            System.out.println(); 
  
            // value of "k" for first  
            // element of every row. 
            k = k + 1 + n - i; 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int n = 5; 
  
        // Function calling 
        pattern(n); 
    } 
} 

