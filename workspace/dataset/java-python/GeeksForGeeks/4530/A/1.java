

// JAVA Code to Check if a 
// given number is sparse or not 
import java.util.*; 
  
class GFG { 
      
    // Return true if n is 
    // sparse,else false 
    static int checkSparse(int n) 
    { 
  
        // n is not sparse if there 
        // is set in AND of n and n/2 
        if ((n & (n>>1)) >=1) 
            return 0; 
       
        return 1; 
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
        System.out.println(checkSparse(72)) ; 
        System.out.println(checkSparse(12)) ; 
        System.out.println(checkSparse(2)) ; 
        System.out.println(checkSparse(3)) ; 
        } 
    } 
  
//This code is contributed by Arnav Kr. Mandal. 

