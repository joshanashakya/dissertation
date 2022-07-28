

// Java implementation of above approach 
import java.util.*; 
  
class GFG 
{ 
  
    static int x = 26; 
    static int mod = 3001; 
  
    // Function to find the required count 
    static void CntSubstr(char[] s, int l) 
    { 
        // Variable to the hash 
        int hash = 0; 
  
        // Finding hash of substring 
        // (0, l-1) using random number x 
        for (int i = 0; i < l; i++)  
        { 
            hash = (hash * x + (s[i] - 97)) % mod; 
        } 
  
        // Computing x^(l-1) 
        int pow_l = 1; 
        for (int i = 0; i < l - 1; i++)  
        { 
            pow_l = (pow_l * x) % mod; 
        } 
  
        // Unordered set to add hash values 
        HashSet<Integer> result = new HashSet<Integer>(); 
        result.add(hash); 
  
        // Generating all possible hash values 
        for (int i = l; i < s.length; i++)  
        { 
            hash = ((hash - pow_l * (s[i - l] - 97) 
                    + 2 * mod) * x + (s[i] - 97)) % mod; 
            result.add(hash); 
        } 
  
        // Print the result 
        System.out.println(result.size()); 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        String s = "abcba"; 
  
        int l = 2; 
  
        CntSubstr(s.toCharArray(), l); 
    } 
} 
  
// This code contributed by Rajput-Ji 

