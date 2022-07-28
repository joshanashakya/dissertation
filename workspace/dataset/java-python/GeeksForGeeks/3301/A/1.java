

// Java program to find number of pairs of integers 
// i, j such that s[i] is an anagram of s[j]. 
import java.util.*; 
class GFG 
{ 
      
// Function to find number of pairs of integers 
// i, j such that s[i] is an anagram of s[j]. 
static int anagram_pairs(String []s, int n) 
{ 
    // To store count of strings 
    Map<String, Integer> mp = new HashMap<>(); 
  
    // Traverse all strings and store in the map 
    for (int i = 0; i < n; i++)  
    { 
        // Sort the string 
        char []chArr = s[i].toCharArray(); 
        Arrays.sort(chArr); 
        s[i] = new String(chArr); 
          
        // Store in the map 
        if(mp.containsKey(s[i])) 
        { 
            mp.put(s[i], mp.get(s[i]) + 1); 
        } 
        else
        { 
            mp.put(s[i], 1); 
        } 
    } 
  
    // To store the number of pairs 
    int ans = 0; 
  
    // Traverse through the map 
    for (Map.Entry<String,  
                   Integer> i : mp.entrySet()) 
    { 
        int k = i.getValue(); 
  
        // Count the pairs for each string 
        ans += (k * (k - 1)) / 2; 
    } 
  
    // Return the required answer 
    return ans; 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    String [] s = { "aaab", "aaba", "baaa", 
                            "cde", "dec" }; 
  
    int n = s.length; 
  
    // Function call 
    System.out.println(anagram_pairs(s, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

