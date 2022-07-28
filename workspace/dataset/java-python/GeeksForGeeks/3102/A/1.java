

// Java implementation of the above approach 
import java.util.*; 
  
public class GFG { 
  
    // Function to print the strings which 
    // satisfy the mentioned conditions 
    public static void getStrings( 
        String str, String[] arr) 
    { 
        // Iterate through all the strings 
        // in the array. 
        for (int i = 0; i < arr.length; i++) { 
  
            // check function to check the 
            // conditions for every string 
            if (check(arr[i], str)) { 
                System.out.print(arr[i] + " "); 
            } 
        } 
    } 
  
    // Function to check whether the string contains 
    // any consecutive repetitive characters 
    // and any characters other than those in str 
    public static boolean check(String s, String str) 
    { 
        char[] chars = s.toCharArray(); 
  
        // Valid characters check 
        for (char c : chars) { 
            if (!str.contains(String.valueOf(c))) { 
                return false; 
            } 
        } 
  
        // Nonrepetitive check 
        for (int i = 0; i < chars.length - 1; i++) { 
            if (chars[i] == chars[i + 1]) { 
                return false; 
            } 
        } 
        return true; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "ABCD"; 
        String[] arr 
            = { "AABCDA", "ABCDZADC", 
                "ABCDBCA", "ABCDABDCA" }; 
        getStrings(str, arr); 
    } 
} 

