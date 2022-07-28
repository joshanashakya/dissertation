

// JAVA Code for Sum of the 
// sequence 2, 22, 222,... 
import java.util.*; 
  
class GFG { 
      
    // function which return the 
    // the sum of series 
    static double sumOfSeries(int n) 
    { 
        return 0.0246 * (Math.pow(10, n) 
                            - 1 - (9 * n)); 
    } 
      
    /* Driver program */
    public static void main(String[] args)  
    { 
         int n = 3; 
         System.out.println(sumOfSeries(n)); 
    } 
} 
  
// This code is contributed by Arnav Kr. Mandal. 

