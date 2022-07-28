

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
    // Function to check is it 
    // possible to rearrange the string 
    // such that every odd length 
    // substring is palindrome 
    static boolean IsPossible(String s) 
    { 
  
        // Length of the string 
        int n = s.length(); 
  
        // To count number of distinct 
        // character in string 
        HashSet<Character> count = new HashSet<>(); 
  
        // To count frequency of 
        // each character 
        HashMap<Character, Integer> map = new HashMap<>(); 
  
        for (int i = 0; i < n; i++)  
        { 
  
            // Inserting into set 
            count.add(s.charAt(i)); 
  
            // Incrementing the frequency 
            map.put(s.charAt(i), map.get(s.charAt(i)) ==  
                    null ? 1 : map.get(s.charAt(i)) + 1); 
        } 
  
        // All characters in 
        // the string are same 
        if (count.size() == 1) 
            return true; 
  
        // There are more than 2 different 
        // character in string 
        if (count.size() > 2) 
            return false; 
  
        String newString = count.toArray().toString(); 
  
        // Currently there is 2 different 
        // character in string 
        int j = 0; 
        char it = newString.charAt(j); 
  
        // Get the frequencies of the 
        // characters that present 
        // in string 
        int x = 0, y = 0; 
        x = map.get(it) == null ? 0 : map.get(it); 
        j++; 
  
        it = newString.charAt(j); 
        y = map.get(it) == null ? 0 : map.get(it); 
  
        // Difference between their 
        // count is less than or 
        // equal to 1 
        if (Math.abs(x - y) <= 1) 
            return true; 
        return false; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        String s = "aaaddad"; 
        if (IsPossible(s)) 
            System.out.println("YES"); 
        else
            System.out.println("NO"); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

