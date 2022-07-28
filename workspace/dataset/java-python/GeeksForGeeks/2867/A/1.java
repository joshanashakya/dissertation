

// Java program to count minimum reduce 
// operations to make a palindrome 
import java.io.*; 
  
class GFG  
{ 
    // Returns count of minimum character 
    // reduce operations to make palindrome. 
    static int countReduce(String str) 
    { 
        int n = str.length(); 
        int res = 0; 
      
        // Compare every character of first half 
        // with the corresponding character of 
        // second half and add difference to 
        // result. 
        for (int i = 0; i < n / 2; i++) 
            res += Math.abs(str.charAt(i)  
                   - str.charAt(n - i - 1)); 
      
        return res; 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
        String str = "abcd"; 
        System.out.println( countReduce(str)); 
              
    } 
} 
  
// This code is contributed by vt_m. 

