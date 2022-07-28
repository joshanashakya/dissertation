

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
    // Function to return maximum number 
    // that can be formed from the string 
    static String maxNumber(String str, int n) 
    { 
  
        // To store the frequency of 'z' and 'n' 
        // in the given string 
        int[] freq = new int[2]; 
  
        for (int i = 0; i < n; i++) 
        { 
            if (str.charAt(i) == 'z') 
  
                // Number of zeroes 
                freq[0]++; 
                  
            else if (str.charAt(i) == 'n') 
  
                // Number of ones 
                freq[1]++; 
        } 
  
        // To store the requried number 
        String num = ""; 
  
        // Add all the ones 
        for (int i = 0; i < freq[1]; i++) 
            num += '1'; 
  
        // Add all the zeroes 
        for (int i = 0; i < freq[0]; i++) 
            num += '0'; 
  
        return num; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        String str = "roenenzooe"; 
        int n = str.length(); 
  
        System.out.println(maxNumber(str, n)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

