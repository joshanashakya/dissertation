

// Efficient Java program to convert  
// all substrings from decimal to given base. 
import java.util.*; 
  
class GFG  
{ 
static void substringConversions(String str,  
                                 int k, int b) 
{ 
    int i = 0, sum = 0, counter = k-1; 
  
    // Computing the decimal of first window 
    for (i = 0; i < k; i++) 
    { 
        sum = (int) (sum + ((str.charAt(i) - '0') *  
                             Math.pow(b, counter))); 
        counter--; 
    } 
    System.out.print(sum + " "); 
      
    // prev stores the pervious decimal 
    int prev = sum; 
              
    // Computing decimal equivalents of all other windows 
    sum = 0; counter = 0; 
    for (; i < str.length(); i++) 
    { 
        // Subtracting weight of the element  
        // pushed out of window 
        sum = (int) (prev - ((str.charAt(i - k) - '0') * 
                              Math.pow(b, k - 1))); 
          
        // Multiplying the decimal by base 
        // to formulate other window  
        sum = sum * b; 
          
        // Adding the new element of window to sum 
        sum = sum + (str.charAt(i) - '0'); 
          
        // Decimal of current window 
        System.out.print(sum + " "); 
          
        // Updating prev 
        prev = sum; 
          
        counter++; 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "12212"; 
    int b = 3, k = 3; 
    substringConversions(str, b, k); 
} 
} 
  
// This code is contributed by Rajput-Ji 

