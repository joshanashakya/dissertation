

// Java implementation of the approach 
import java.util.*; 
import java.lang.*; 
  
class GFG { 
  
    // Function to return the converted string 
    // after replacing every consonant sequence 
    // with its length 
    static String replaceConsonants(String str) 
    { 
  
        // To store the resultant string 
        String res = ""; 
        int i = 0, count = 0; 
  
        // Checking each character 
        // for consonant sequence 
        while (i < str.length()) { 
  
            // Count the length of consonants sequence 
            if (str.charAt(i) != 'a'
                && str.charAt(i) != 'e'
                && str.charAt(i) != 'i'
                && str.charAt(i) != 'o'
                && str.charAt(i) != 'u') { 
                i++; 
                count++; 
            } 
            else { 
  
                // Add the length in the string 
                if (count > 0) 
                    res += count; 
  
                // Add the vowel 
                res += str.charAt(i); 
  
                i++; 
                count = 0; 
            } 
        } 
  
        // Check for the last consonant sequence 
        // in the string 
        if (count > 0) 
            res += count; 
  
        // Return the resultant string 
        return res; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "abcdeiop"; 
        System.out.println(replaceConsonants(str)); 
    } 
} 
  
// This code is contributed by Code_Mech. 

