

// Java program to count number of substrings 
// divisible by 4 
import java.io.*; 
  
class GFG  
{ 
    // Function to count number of substrings 
    // divisible by 4 
    static int countDivisbleby4(String s) 
    { 
        int n = s.length(); 
       
        // In the first loop we will count number of  
        // 0's, 4's and 8's present in the string 
        int count = 0; 
        for (int i = 0; i < n; ++i)  
            if (s.charAt(i) == '4' || s.charAt(i) == '8' || s.charAt(i) == '0') 
                count++ ; 
       
        // In second loop we will convert pairs 
        // of two consecutive characters into 
        // integer and store it in variable h . 
        // Then we check whether h is divisible by 4 
        // or not . If h is divisible we increases 
        // the count with ( i + 1 ) as index of 
        // first character of pair 
        for (int i = 0; i < n - 1; ++i)  
        { 
            int h = ( s.charAt(i) - '0' ) * 10 + ( s.charAt(i+1) - '0' );  
            if (h % 4 == 0)   
                count = count + i + 1 ; 
        } 
   
        return count; 
    } 
      
    // driver program 
    public static void main (String[] args)  
    { 
        String s = "124"; 
        System.out.println(countDivisbleby4(s)); 
    } 
} 
  
// Contributed by Pramod Kumar 

