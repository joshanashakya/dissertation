

// Java program to check whether the  
// number has only first and last  
// bits set 
import java.util.*; 
  
class GFG 
{ 
    // function to check whether 'n' 
    // is a power of 2 or not 
    static boolean powerOfTwo(int n) 
    { 
        return ((n & n - 1) == 0); 
    } 
  
    // function to check whether the number has   
    // only first and last bits set 
    static boolean onlyFirstAndLastAreSet(int n) 
    { 
        if (n == 1) 
            return true; 
      
        return powerOfTwo(n-1);  
    } 
  
    // Driver program to test above 
    public static void main (String[] args) { 
         
       int n = Integer.parseUnsignedInt("9"); 
      
        if (onlyFirstAndLastAreSet(n)) 
            System.out.println("Yes"); 
        else
            System.out.println("No");  
    } 
}  
  
/* This code is contributed by Mr. Somesh Awasthi */

