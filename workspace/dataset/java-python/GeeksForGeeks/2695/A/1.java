

// Java Program to count all even 
// decimal value substring . 
import java.io.*; 
  
class GFG  
{ 
    // generate all substring in arr[0..n-1] 
    static int evenDecimalValue(String str, int n) 
    { 
       // store the count 
       int result = 0; 
  
       // Pick starting point 
       for (int i = 0; i < n; i++)  
       { 
  
          // Pick ending point 
          for (int j = i; j < n; j++)  
          { 
  
            int decimalValue = 0; 
            int powerOf2 = 1; 
  
            // substring between current  
            // starting and ending points 
            for (int k = i; k <= j; k++)  
            { 
                decimalValue += ((str.charAt(k) -  
                                 '0') * powerOf2); 
  
                // increment power of 2 by one 
                powerOf2 *= 2; 
            } 
  
            if (decimalValue % 2 == 0) 
                result++; 
          } 
      } 
      return result; 
    } 
  
    // Driver code 
    public static void main (String[] args)  
    { 
       String str = "10010"; 
       int n = 5; 
       System.out.println(evenDecimalValue(str, n)); 
      
    } 
} 
  
//This code is contributed by Gitanjali. 

