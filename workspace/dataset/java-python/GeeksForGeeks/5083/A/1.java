

// Java implementation to check whether the two   
// numbers differ at one bit position only 
import java.io.*; 
import java.util.*; 
  
class GFG { 
      // function to check if x is power of 2 
      static boolean isPowerOfTwo(int x)  
      { 
             // First x in the below expression is 
             // for the case when x is 0  
             return x!= 0 && ((x & (x - 1)) == 0); 
      } 
  
      // function to check whether the two numbers  
      // differ at one bit position only  
      static boolean differAtOneBitPos(int a, int b) 
      { 
             return isPowerOfTwo(a ^ b); 
      }  
      // Driver code 
      public static void main(String args[]) 
      { 
             int a = 13, b = 9; 
             if (differAtOneBitPos(a, b) == true) 
                 System.out.println("Yes"); 
             else
                 System.out.println("No"); 
      } 
}  
  
// This code is contributed by rachana soma 

