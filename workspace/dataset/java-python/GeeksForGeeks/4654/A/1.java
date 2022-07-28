

// java program to check if a query 
// string is present is given set. 
import java.io.*; 
  
public class GFG { 
  
    static int MAX_CHAR = 256; 
      
    static boolean isPresent(String s, String q) 
    { 
          
        // Count occurrences of all 
        // characters in s. 
        int []freq = new int[MAX_CHAR]; 
        for (int i = 0; i < s.length(); i++) 
            freq[s.charAt(i)]++; 
      
        // Check if number of occurrences of 
        // every character in q is less than 
        // or equal to that in s. 
        for (int i = 0; i < q.length(); i++) 
        { 
            freq[q.charAt(i)]--; 
              
            if (freq[q.charAt(i)] < 0)  
                return false; 
        } 
      
        return true; 
    } 
      
    // driver program 
    static public void main (String[] args) 
    { 
        String s = "abctd"; 
        String q = "cat"; 
      
        if (isPresent(s, q)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by vt_m. 

