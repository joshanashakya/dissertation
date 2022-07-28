

// Java implementation of the approach 
import java.util.*; 
  
class GFG { 
  
    static int MAX_CHAR = 256; 
  
    // Function to return the count of valid sub-strings 
    static int countSubStrings(String s, String anotherStr, int k)  
    { 
        // Store all characters of anotherStr in a  
        // direct index table for quick lookup. 
        boolean illegal[] = new boolean[MAX_CHAR]; 
        for (int i = 0; i < anotherStr.length(); i++)  
        { 
            illegal[anotherStr.charAt(i)] = true; 
        } 
  
        // To store distinct output substrings 
        HashSet<String> us = new HashSet<String>(); 
  
        // Traverse through the given string and 
        // one by one generate substrings beginning 
        // from s[i]. 
        for (int i = 0; i < s.length(); ++i)  
        { 
  
            // One by one generate substrings ending 
            // with s[j] 
            String ss = ""; 
            int count = 0; 
            for (int j = i; j < s.length(); ++j)  
            { 
  
                // If character is illegal 
                if (illegal[s.charAt(j)]) 
                { 
                    ++count; 
                } 
                ss = ss + s.charAt(j); 
  
                // If current substring is valid 
                if (count <= k)  
                { 
                    us.add(ss); 
                }  
                  
                // If current substring is invalid, 
                // adding more characters would not 
                // help. 
                else 
                { 
                    break; 
                } 
            } 
        } 
  
        // Return the count of distinct sub-strings 
        return us.size(); 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        String str = "acbacbacaa"; 
        String anotherStr = "abcdefghijklmnopqrstuvwxyz"; 
        int k = 2; 
        System.out.println(countSubStrings(str, anotherStr, k)); 
    } 
} 
  
// This code is contributed by PrinciRaj1992 

