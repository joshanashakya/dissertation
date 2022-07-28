

// Java Program to count all even 
// decimal value substring . 
import java.io.*; 
  
class GFG  
{ 
    // function return count of  
    // even decimal value substring 
    static int evenDecimalValue(String str, int n) 
    { 
        // store the count of even 
        // decimal value substring 
        int result = 0; 
        for (int i = 0; i < n; i++)  
        { 
  
            // substring started with '0' 
            if (str.charAt(i) == '0')  
            { 
  
                // increment result by (n-i) 
                // because all substring which  
                // are generate by this character  
                // produce even decimal value. 
                result += (n - i); 
            } 
        } 
        return result; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "10010"; 
        int n = 5; 
        System.out.println(evenDecimalValue(str, n)); 
    } 
} 
// This code is contributed  
// by Gitanjali. 

