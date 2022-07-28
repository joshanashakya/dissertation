

// java implementation of 
// doors open or closed 
import java.io.*; 
  
class GFG { 
      
    // Function to check whether 'n' 
    // has even number of factors or not 
    static boolean hasEvenNumberOfFactors(int n) 
    { 
        double root_n = Math.sqrt(n); 
      
        // if 'n' is a perfect square 
        // it has odd number of factors 
        if ((root_n*root_n) == n) 
            return false; 
      
        // else 'n' has even 
        // number of factors 
        return true; 
    } 
      
    // Function to find and print 
    // status of each door 
    static void printStatusOfDoors(int n) 
    { 
        for (int i = 1 ; i <= n; i++) 
        { 
            // If even number of factors 
            // final status is closed 
            if (hasEvenNumberOfFactors(i)) 
                System .out.print( "closed" + " "); 
      
            // else odd number of factors 
            // final status is open 
            else
                System.out.print( "open" + " "); 
        } 
    } 
      
    // Driver program 
    public static void main (String[] args) { 
        int n = 5; 
        printStatusOfDoors(n); 
          
    } 
} 
  
// This article is contributed by vt_m 

