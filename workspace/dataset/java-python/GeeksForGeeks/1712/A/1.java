

// Java Program to find nth 
// centered dodecahedral number 
import java.io.*; 
  
class GFG { 
  
    // Function to find centered 
    // dodecahedral number 
    static int CenteredDodecahedral_num(int n) 
    { 
          
        // Formula to calculate nth 
        // centered dodecahedral number 
        // and return it into main function. 
          
        return (2 * n + 1) *  
                     (5 * n * n + 5 * n + 1); 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
  
        int n = 3; 
          
        // print result 
        System.out.print( n + "th Centered "
                + "Dodecahedral number : "); 
        System.out.println ( 
                CenteredDodecahedral_num(n)); 
  
        n = 10; 
          
        // print result 
        System.out.print( n + "th Centered "
                + "Dodecahedral number : "); 
        System.out.println(  
               CenteredDodecahedral_num(n)); 
    } 
} 
  
// This code is contributed by m_kit. 

