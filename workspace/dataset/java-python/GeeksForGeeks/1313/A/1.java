

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
    // Function that removes the 
    // characters which have even 
    // frequencies in the string 
    static void solve(String s) 
    { 
        // create a map to store the 
        // frequency of each character 
        HashMap<Character, Integer> m = new HashMap<>(); 
          
        for (int i = 0; i < s.length(); i++)  
        { 
            if(m.containsKey(s.charAt(i))) 
                        m.put(s.charAt(i),  
                        m.get(s.charAt(i)) + 1);  
            else
                m.put(s.charAt(i), 1); 
        } 
      
        // to store the new string 
        String new_string = ""; 
      
        // remove the characters which 
        // have even frequencies 
        for (int i = 0; i < s.length(); i++) 
        { 
      
            // if the character has 
            // even frequency then skip 
            if (m.get(s.charAt(i)) % 2 == 0) 
                continue; 
      
            // else concatenate the 
            // character to the new string 
            new_string = new_string + s.charAt(i); 
        } 
      
        // display the modified string 
        System.out.println(new_string); 
    } 
      
    // Driver code 
    public static void main(String []args) 
    { 
        String s = "aabbbddeeecc"; 
      
        // remove the characters which 
        // have even frequencies 
        solve(s); 
    } 
} 
  
// This code is contributed by ihritik 

