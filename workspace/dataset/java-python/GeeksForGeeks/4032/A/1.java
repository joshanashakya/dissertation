

// Java program to find maximum number of 
// consecutive zeroes after concatenating 
// a binary string 
  
class GFG { 
  
    // returns the maximum size of a substring 
    // consisting only of zeroes 
    // after k concatenation 
    static int max_length_substring(String st, 
                                    int n, int k) 
    { 
  
        // stores the maximum length of the 
        // required substring 
        int max_len = 0; 
  
        int len = 0; 
        for (int i = 0; i < n; ++i) { 
  
            // if the current character is 0 
            if (st.charAt(i) == '0') 
                len++; 
            else
                len = 0; 
  
            // stores maximum length of current 
            // substrings with zeroes 
            max_len = Math.max(max_len, len); 
        } 
  
        // if the whole string is filled with zero 
        if (max_len == n) 
            return n * k; 
  
        int pref = 0, suff = 0; 
  
        // computes the length of the maximal 
        // prefix which contains only zeroes 
        for (int i = 0; st.charAt(i) == '0'; ++i, ++pref) 
            ; 
  
        // computes the length of the maximal  
        // suffix which contains only zeroes 
        for (int i = n - 1; st.charAt(i) == '0'; --i, ++suff) 
            ; 
  
        // if more than 1 concatenations are to be made 
        if (k > 1) 
            max_len = Math.max(max_len, pref + suff); 
  
        return max_len; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 6; 
        int k = 3; 
        String st = "110010"; 
        int ans = max_length_substring(st, n, k); 
  
        System.out.println(ans); 
    } 
} 

