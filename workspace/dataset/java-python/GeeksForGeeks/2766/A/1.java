

// Java implementation of the approach  
import java.util.HashMap; 
  
class GFG 
{ 
  
    // Function to return the count of  
    // common words in all the sentences 
    static int commonWords(String[] s)  
    { 
        int m, i, j; 
  
        // To store separate words 
        String str; 
  
        // It will be used to check if a word  
        // is present in a particuler string 
        HashMap<String, Boolean> has = new HashMap<>(); 
  
        // To store all the words of first string 
        String[] ans1 = new String[100]; 
        boolean[] ans2 = new boolean[100]; 
        int track = 0; 
  
        // m will store number of strings  
        // in given vector 
        m = s.length; 
        i = 0; 
  
        // Extract all words of first string  
        // and store it in ans 
        while (i < s[0].length())  
        { 
            str = ""; 
            while (i < s[0].length() && 
                       s[0].charAt(i) != ' ') 
            { 
                str += s[0].charAt(i); 
                i++; 
            } 
  
            // Increase i to get at starting index 
            // of the next word 
            i++; 
  
            // If str is not empty store it in map 
            if (str.compareTo("") != 0) 
            { 
                ans1[track] = str; 
                ans2[track] = true; 
                track++; 
            } 
        } 
  
        // Start from 2nd line check if any word of 
        // the first string did not match with 
        // some word in the current line 
        for (j = 1; j < m; j++) 
        { 
            has.clear(); 
            i = 0; 
            while (i < s[j].length()) 
            { 
                str = ""; 
                while (i < s[j].length() && 
                           s[j].charAt(i) != ' ') 
                { 
                    str += s[j].charAt(i); 
                    i++; 
                } 
  
                i++; 
                if (str.compareTo("") != 0) 
                    has.put(str, true); 
            } 
  
            // Check all words of this vector 
            // if it is not present in current line 
            // make it false 
            for (int k = 0; k < track; k++) 
            { 
                // System.out.println(has.get(ans1[k])); 
                if (ans2[k] != false &&  
                    !has.containsKey(ans1[k])) 
                    ans2[k] = false; 
  
                // This line is used to consider 
                // only distinct words 
                else if (ans2[k] != false &&  
                         has.containsKey(ans1[k]) &&  
                         has.get(ans1[k]) == true) 
                    has.put(ans1[k], false); 
            } 
        } 
  
        // This function will print 
        // the count of common words 
        int cnt = 0; 
  
        // If current word appears  
        // in all the sentences 
        for (int k = 0; k < track; k++) 
            if (ans2[k] == true) 
                cnt++; 
  
        return cnt; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        String[] s = { "there is a cow", "cow is our mother", 
                       "cow gives us milk and milk is sweet", 
                       "there is a boy who loves cow" }; 
  
        System.out.println(commonWords(s)); 
    } 
} 
  
// This code is contributed by 
// sanjeev2552 

