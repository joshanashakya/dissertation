

// Java implementation of the approach 
import java.util.*; 
  
class GFG { 
  
    // Function that returns true if it is possible 
    // to rearrange the characters of the string 
    // such that no two consecutive characters are same 
    static boolean isPossible(char[] str) 
    { 
  
        // To store the frequency of 
        // each of the character 
        Map<Character, Integer> freq = new HashMap<>(); 
  
        // To store the maximum frequency so far 
        int max_freq = 0; 
        for (int j = 0; j < (str.length); j++) { 
            if (freq.containsKey(str[j])) { 
                freq.put(str[j], freq.get(str[j]) + 1); 
                if (freq.get(str[j]) > max_freq) 
                    max_freq = freq.get(str[j]); 
            } 
            else { 
                freq.put(str[j], 1); 
                if (freq.get(str[j]) > max_freq) 
                    max_freq = freq.get(str[j]); 
            } 
        } 
  
        // If possible 
        if (max_freq <= (str.length - max_freq + 1)) 
            return true; 
        return false; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "geeksforgeeks"; 
  
        if (isPossible(str.toCharArray())) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
} 
  
// This code is contributed by Rajput-Ji 

