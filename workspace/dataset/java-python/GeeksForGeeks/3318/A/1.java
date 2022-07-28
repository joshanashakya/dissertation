

// Java program to find minimum number 
// of characters to be removed to make 
// a string alternate. 
import java.io.*; 
  
public class GFG { 
  
    // Returns count of minimum characters to 
    // be removed to make s alternate. 
    static int countToMake0lternate(String s) 
    { 
        int result = 0; 
  
        for (int i = 0; i < (s.length() - 1); i++) 
  
            // if two alternating characters 
            // of string are same 
            if (s.charAt(i) == s.charAt(i + 1)) 
                result++; // then need to 
        // delete a character 
  
        return result; 
    } 
  
    // Driver code 
    static public void main(String[] args) 
    { 
        System.out.println(countToMake0lternate("000111")); 
        System.out.println(countToMake0lternate("11111")); 
        System.out.println(countToMake0lternate("01010101")); 
    } 
} 
  
// This code is contributed by vt_m. 

