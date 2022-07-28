

// Java program to print a pattern using single 
// loop and continue statement 
import java.io.*; 
  
class GFG { 
  
    // printPattern function to print pattern 
    static void printPattern(int n) 
    { 
        // Variable initialization 
        // Line count 
        int line_no = 1;  
      
        // Loop to print desired pattern 
        int curr_star = 0; 
        for ( line_no = 1; line_no <= n;) 
        { 
            // If current star count is less than 
            // current line number 
            if (curr_star < line_no) 
            { 
                System.out.print ( "* "); 
                curr_star++; 
                continue; 
            } 
      
            // Else time to print a new line 
            if (curr_star == line_no) 
            { 
                System.out.println (""); 
                line_no++; 
                curr_star = 0; 
            } 
        } 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
            printPattern(7); 
    } 
} 
  
// This code is contributed by vt_m 

