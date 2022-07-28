

// Java Program to check if three straight  
// line are concurrent or no 
import java.io.*; 
  
class GFG { 
  
    // Return true if three line are concurrent, 
    // else false. 
    static boolean checkConcurrent(int a1, int b1, 
                   int c1, int a2, int b2, int c2,  
                           int a3, int b3, int c3) 
    { 
        return (a3 * (b1 * c2 - b2 * c1) +  
                b3 * (c1 * a2 - c2 * a1) +  
                c3 * (a1 * b2 - a2 * b1) == 0); 
    } 
      
    // Driven Program 
    public static void main (String[] args)  
    { 
        int a1 = 2, b1 = -3, c1 = 5; 
        int a2 = 3, b2 = 4, c2 = -7; 
        int a3 = 9, b3 = -5, c3 = 8; 
      
        if(checkConcurrent(a1, b1, c1, a2, b2, 
                               c2, a3, b3, c3))  
            System.out.println( "Yes"); 
        else
            System.out.println( "No"); 
    } 
} 
  
// This code is contributed by anuj_67. 

