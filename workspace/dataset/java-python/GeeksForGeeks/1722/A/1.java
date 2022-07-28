

// Java Program to find nth Centered 
// cube number 
import java.io.*; 
  
class GFG { 
      
    // Function to find 
    // Centered cube number 
    static int centered_cube(int n) 
    { 
        // Formula to calculate nth 
        // Centered cube number & 
        // return it into main function. 
        return (2 * n + 1) * ( n * n + n + 1); 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        int n = 3; 
        System.out.print (n + "th Centered"
                         + " cube number: "); 
        System.out.println (centered_cube(n)); 
      
        n = 10; 
        System.out.print ( n + "th Centered"
                         + " cube number: "); 
        System.out.println (centered_cube(n)); 
    } 
} 
  
// This code is contributed by m_kit. 

