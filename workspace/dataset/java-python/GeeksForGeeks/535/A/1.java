

// Java program to find the sum of elements 
// present in all subsequences 
import java.io.*; 
  
class GFG { 
      
    // Returns numeric value of a  
    // subsequence of s. The subsequence 
    // to be picked is decided using bit 
    // pattern of num (We pick all those 
    // digits for which there is a set  
    // bit in num) 
    static int findSubSequence(String s,  
                                int num) 
    {  
        // Initialize the result 
        int res = 0; 
      
        // till n!=0 
        int i = 0; 
        while (num > 0) { 
              
            // if i-th bit is set  
            // then add this number 
            if ((num & 1) == 1) 
                res += s.charAt(i) - '0'; 
            i++; 
              
            // right shift i 
            num = num >> 1; 
        } 
      
        return res; 
    } 
  
    // function to find combined sum 
    // of all individual subsequence 
    // sum 
    static int combinedSum(String s) 
    { 
          
        // length of String 
        int n = s.length(); 
          
        // stores the combined 
        int c_sum = 0; 
      
        // 2^n-1 subsequences 
        int range = (1 << n) - 1; 
      
        // loop for all subsequences 
        for (int i = 0; i <= range; i++) 
            c_sum += findSubSequence(s, i); 
      
        // returns the combined sum 
        return c_sum; 
    } 
  
    // Driver function 
    public static void main (String[] args) { 
      
        String s = "123"; 
        System.out.println(combinedSum(s)); 
    } 
  
} 
  
// This code is contributed by Anuj_ 67 

