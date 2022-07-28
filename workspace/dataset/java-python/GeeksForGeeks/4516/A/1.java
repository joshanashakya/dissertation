

// Java implementation to 
// toggle the last m bits 
import java.util.*; 
import java.lang.*; 
  
public class GfG{ 
      
    // function to toggle 
    // the last m bits 
    public static int toggleLastMBits 
                      (int n, int m) 
    { 
          
        // calculating a number  
        // 'num' having 'm' bits 
        // and all are set 
        int num = (1 << m) - 1; 
   
        // toggle the last m bits 
        // and return the number 
        return (n ^ num); 
    } 
      
    // Driver function 
    public static void main(String argc[]){ 
        int n = 107; 
        int m = 4; 
        n =  toggleLastMBits(n, m); 
        System.out.println(n); 
                
    } 
} 
  
// This code is contributed by Sagar Shukla. 

