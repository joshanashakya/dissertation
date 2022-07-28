

// Java program to find maximum 
// length prefix of one string  
// occur as subsequence in another 
// string. 
public class GFG {      
      
    // Return the maximum length  
    // prefix which is subsequence. 
    static int maxPrefix(String s,  
                         String t) 
    { 
        int count = 0; 
      
        // Iterating string T. 
        for (int i = 0; i < t.length(); i++) 
        { 
            // If end of string S. 
            if (count == s.length()) 
                break; 
      
            // If character match,   
            // increment counter. 
            if (t.charAt(i) == s.charAt(count)) 
                count++; 
        } 
      
        return count; 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
        String S = "digger"; 
        String T = "biggerdiagram"; 
      
        System.out.println(maxPrefix(S, T)); 
    } 
} 
// This code is contributed by Sumit Ghosh 

