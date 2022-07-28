

// Java implementation to 
// check if one of the two 
// numbers is one's complement 
// of the other 
  
import java.util.*; 
import java.lang.*; 
  
public class GfG{ 
  
    // function to check 
    // if all the bits are set 
    // or not in the binary 
    // representation of 'n' 
    public static boolean areAllBitsSet(long n) 
    { 
        // all bits are not set 
        if (n == 0) 
            return false; 
    
        // if true, then all bits are set 
        if (((n + 1) & n) == 0) 
            return true; 
    
        // else all bits are not set 
        return false; 
    } 
   
    // function to check if 
    // one of the two numbers 
    // is one's complement 
    // of the other 
    public static boolean isOnesComplementOfOther(long a,  
                             long b) 
    { 
        return areAllBitsSet(a ^ b); 
    } 
      
    // Driver function  
    public static void main(String argc[]){ 
        long a = 10, b = 5; 
       
        if (isOnesComplementOfOther(a,b)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
           
} 
  
// This code is contributed by Sagar Shukla 

