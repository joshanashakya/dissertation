

// Java program to find  
// the midpoint of a line 
import java.io.*; 
  
class GFG  
{ 
    // function to find the 
    // midpoint of a line 
    static void midpoint(int x1, int x2, 
                          int y1, int y2) 
    { 
        System.out.print((x1 + x2) / 2 + 
                        " , " + (y1 + y2) / 2) ;  
    } 
  
    // Driver code 
    public static void main (String[] args)  
    { 
        int x1 =-1, y1 = 2 ; 
        int x2 = 3, y2 = -6 ;  
        midpoint(x1, x2, y1, y2); 
              
    } 
} 
  
// This code is contributed by vt_m. 

