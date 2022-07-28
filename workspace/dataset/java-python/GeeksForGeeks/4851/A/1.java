

// Java Program to find nth 
// centered decagonal number 
import java.io.*; 
  
class GFG  
{ 
      
    // Centered decagonal 
    // number function 
    static int centereddecagonalnum(int n) 
    { 
          
    // Formula to calculate nth 
    // centered decagonal number & 
    // return it into main function. 
    return (5 * n * n + 5 * n + 1); 
    } 
  
    // Driver Code 
    public static void main (String[] args)  
    { 
        int n = 5; 
        System.out.print(n + "th centered " +  
                       "decagonal number: "); 
        System.out.println(centereddecagonalnum(n)); 
  
        n = 9; 
        System.out.print(n + "th centered " +  
                       "decagonal number: "); 
        System.out.println(centereddecagonalnum(n)); 
    } 
} 
  
// This code is contributed by m_kit 

