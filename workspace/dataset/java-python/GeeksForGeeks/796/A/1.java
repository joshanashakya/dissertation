

// Java program to find the count of  
// positive integer of agiven number 
// of digits that contain atleast one zero 
import java.io.*; 
import java.math.*; 
  
class GFG { 
      
    // Returns count of 'd' digit  
    // integers have 0 as a digit 
    static int findCount(int d) 
    { 
        return 9 * (int)((Math.pow(10, d - 1)  
                         - Math.pow(9, d - 1))); 
    } 
      
    // utility function to count 
    // the required answer 
    static int findCountUpto(int d) 
    { 
        // Count of numbers with digits  
        // smaller than or equal to d. 
        int totalCount = 0; 
        for (int i = 1; i <= d; i++) 
            totalCount += findCount(i); 
      
        return totalCount; 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        int d = 1; 
        System.out.println(findCountUpto(d)); 
      
        d = 2; 
        System.out.println( findCountUpto(d) ); 
      
        d = 4; 
        System.out.println(findCountUpto(d)); 
    } 
} 
  
  
/*This code is contributed by Nikita Tiwari.*/

