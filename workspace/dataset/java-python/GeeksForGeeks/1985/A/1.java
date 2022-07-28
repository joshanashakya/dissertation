

// Java code to Print first k  
// digits of 1/n where n is a  
// positive integer 
import java.io.*; 
  
class GFG  
{ 
    // Function to print first  
    // k digits after dot in value 
    // of 1/n. n is assumed to be  
    // a positive integer. 
    static void print(int n, int k) 
    { 
        // Initialize remainder 
        int rem = 1;  
          
        // Run a loop k times to print k digits 
        for (int i = 0; i < k; i++) 
        { 
            // The next digit can always be  
            // obtained as doing (10*rem)/10 
            System.out.print( (10 * rem) / n); 
  
            // Update remainder 
            rem = (10 * rem) % n; 
              
        } 
          
    } 
      
    // Driver program  
    public static void main(String []args) 
    { 
        int n = 7, k = 3; 
        print(n, k); 
        System.out.println(); 
          
        n = 21; 
        k = 4; 
        print(n, k); 
          
    } 
} 
  
// This article is contributed by vt_m 

