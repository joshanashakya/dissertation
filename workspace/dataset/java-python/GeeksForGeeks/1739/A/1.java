

// Java Program to 
// find deltaX 
import java.io.*; 
  
class GFG 
{ 
    // function to find delta X 
    static int findDelta(int a, int b,  
                         int c, int d) 
    { 
        return (b * c - a *  
                d) / (d - c); 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        int a = 3, b = 9,  
            c = 3, d = 5; 
      
        // u0394X is code  
        // for delta sign 
        System.out.print("\u0394X = " +  
                findDelta(a, b, c, d)); 
    } 
} 
  
// This code is contributed  
// by Manish Shaw(manishshaw1) 

