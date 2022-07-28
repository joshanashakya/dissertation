

// Java program to find nth dodecahedral  
// number 
import java.io.*; 
  
class GFG { 
  
    // Function to find dodecahedral number 
    static int dodecahedral_num(int n) 
    { 
          
        // Formula to calculate nth 
        // dodecahedral number 
        // and return it into main function. 
        return n * (3 * n - 1) * 
                           (3 * n - 2) / 2; 
    } 
      
    // Driver Code 
    public static void main (String[] args) 
    { 
        int n = 5; 
        // print result 
        System.out.print( n + "the Dodecahedral"
                                  + " number:"); 
        System.out.println( dodecahedral_num(n)); 
    } 
} 
  
// This code is contributed by anuj_67. 

