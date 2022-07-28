

// Java program to print all distinct subsequences 
// of a string. 
import java.util.*; 
  
class GFG { 
  
    // Finds and stores result in st for a given 
    // string s. 
    static void generate(Set<String> st, String s) 
    { 
        if (s.length() == 0) { 
            return; 
        } 
  
        // If current string is not already present. 
        if (!st.contains(s)) { 
            st.add(s); 
  
            // Traverse current string, one by one 
            // remove every character and recur. 
            for (int i = 0; i < s.length(); i++) { 
                String t = s; 
                t = t.substring(0, i) + t.substring(i + 1); 
                generate(st, t); 
            } 
        } 
        return; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        String s = "xyz"; 
        TreeSet<String> st = new TreeSet<>(); 
        generate(st, s); 
        for (String str : st) { 
            System.out.println(str); 
        } 
    } 
} 
  
// This code has been contributed by 29AjayKumar 
// modified by rahul_107 

