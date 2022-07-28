

// Java Program to find nth 
// centered octagonal number 
import java.io.*; 
   
class GFG  
{ 
       
    // Function to find centered 
    // octagonal number 
    static int centeredoctagonalNumber(int n) 
    { 
        // Formula to calculate nth  
        // centered octagonal number 
        // and return it into main function 
        return 4 * n * (n - 1) + 1; 
    } 
       
    // Driver Code 
    public static void main(String args[]) 
    { 
        int n = 6; 
        System.out.print(n + "th centered " + 
                       "octagonal number: "); 
        System.out.println( 
                 centeredoctagonalNumber(n)); 
          
        n = 11; 
        System.out.print(n + "th centered " + 
                       "octagonal number: "); 
        System.out.println( 
                  centeredoctagonalNumber(n)); 
           
    } 
} 
  
// This code has been contributed by Prasad_Kshirsagar. 

