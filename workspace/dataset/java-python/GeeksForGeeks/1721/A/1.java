

// Java Program to find nth centered 
// nonadecagonal number 
import java.io.*; 
  
class GFG { 
      
    // centered nonadecagonal 
    // function 
    static int center_nonadecagon_num(int n) 
    { 
        // Formula to calculate nth 
        // centered nonadecagonal number 
        return (19 * n * n - 19 * n + 2) / 2; 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int n = 2; 
        System.out.print ( n + "th centered "
                + "nonadecagonal number : "); 
        System.out.println (  
                   center_nonadecagon_num(n)); 
      
        n = 7; 
        System.out.print ( n + "th centered "
                + "nonadecagonal number : "); 
        System.out.println( 
                  center_nonadecagon_num(n)); 
    } 
} 
  
// This code is contributed by m_kit 

