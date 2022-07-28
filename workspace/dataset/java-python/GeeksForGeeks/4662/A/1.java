

// Java implementation of above approach 
import java.util.*; 
  
class GFG 
{ 
    // Function that counts all the 
    // sub-strings of length 'k' 
    // which have all identical characters 
    static void solve(String s, int k) 
    { 
        // count of sub-strings, length, 
        // initial position of sliding window 
        int count = 0, length = 0, pos = 0; 
      
        // map to store the frequency of 
        // the characters of sub-string 
        HashMap<Character, Integer> m =  
                            new HashMap<Character, Integer>(); 
      
        for (int i = 0; i < s.length(); i++)  
        { 
      
            // increase the frequency of the character 
            // and length of the sub-string 
            if(m.containsKey(s.charAt(i))) 
                m.put(s.charAt(i), m.get(s.charAt(i))+1); 
            else
                m.put(s.charAt(i), 1); 
                  
            length++; 
      
            // if the length of the sub-string 
            // is greater than K 
            if (length > k)  
            { 
      
                // remove the character from 
                // the beginning of sub-string 
                m.put(s.charAt(pos), m.get(s.charAt(pos)) -1 ); 
                pos++; 
                length--; 
            } 
      
            // if the length of the sub string 
            // is equal to k and frequency of one 
            // of its characters is equal to the 
            // length of the sub-string 
            // i.e. all the characters are same 
            // increase the count 
            if (length == k && m.get(s.charAt(i)) == length) 
                count++; 
        } 
      
        // display the number 
        // of valid sub-strings 
        System.out.println( count); 
    } 
      
    // Driver code 
    public static void main (String[] args)  
    { 
          
        String s = "aaaabbbccdddd"; 
        int k = 4; 
      
        solve(s, k); 
    } 
} 
  
// This code is contributed by ihritik 

