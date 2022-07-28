

// Java code to find the unit  
// digit of x  raised to power y. 
import java.io.*; 
import java.util.*; 
  
class GFG { 
      
    // find unit digit 
    static int unitnumber(int x, int y) 
    { 
        // Get last digit of x 
        x = x % 10; 
              
        // Last cyclic modular value 
        if(y!=0) 
             y = y % 4 + 4; 
      
        // here we simply return the  
        // unit digit or the power  
        // of a number 
        return (((int)(Math.pow(x, y))) % 10); 
    } 
      
      
    public static void main (String[] args) 
    { 
        int x = 133, y = 5; 
      
        // get unit digit number here we pass  
        // the unit digit of x and the last  
        // cyclicity number that is y%4 
        System.out.println(unitnumber(x, y));  
      
    } 
} 
  
// This code is contributed by Gitanjali. 

