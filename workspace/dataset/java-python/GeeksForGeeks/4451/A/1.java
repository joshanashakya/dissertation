

// Java code for Inverse Pyramid 
import java.util.*; 
  
class GFG { 
      
    // function for inverse pyramid print 
    static void pyramid(int n) 
    { 
        int i, j, num, gap; 
      
        // outer loop to handle number 
        // of rows n in this case 
        for (i = n; i >= 1; i--) { 
              
            // inner loop to create right triangle 
            // gaps on left side of pyramid 
            for (gap = n - 1; gap >= i; gap--) { 
                System.out.print(" "); 
                System.out.print(" "); 
            } 
              
            // initializing value corresponding  
            // to ASCII value of 'A'  
            num = 'A'; 
      
            // loop to print characters on 
            // left side of pyramid 
            for (j = 1; j <= i; j++) { 
                System.out.print((char)num++ + " "); 
            } 
              
            // loop to print characters on 
            // right side of pyramid 
            for (j = i - 1; j >= 0; j--) { 
                System.out.print((char)--num + " "); 
            } 
              
            System.out.println(""); 
        } 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args) 
    { 
        int n = 9; 
        pyramid(n); 
      
    } 
} 
  
// This article is contributed by Gitanjali. 

