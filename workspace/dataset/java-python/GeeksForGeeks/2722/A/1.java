

// Java implementation of the approach 
class GFG 
{ 
    // Function to find longest prefix suffix 
    static int [] compute_lps(String s) 
    { 
        int n = s.length(); 
      
        // To store longest prefix suffix 
        int [] lps = new int [n]; 
      
        // Length of the previous 
        // longest prefix suffix 
        int len = 0; 
      
        // lps[0] is always 0 
        lps[0] = 0; 
        int i = 1; 
      
        // Loop calculates lps[i] for i = 1 to n - 1 
        while (i < n)  
        { 
            if (s.charAt(i) == s.charAt(len))  
            { 
                len++; 
                lps[i] = len; 
                i++; 
            } 
      
            // (pat[i] != pat[len]) 
            else 
            { 
                if (len != 0) 
                    len = lps[len - 1]; 
                // Also, note that we do not increment 
                // i here 
      
                // If len = 0 
                else
                { 
                    lps[i] = 0; 
                    i++; 
                } 
            } 
        } 
      
        return lps; 
    } 
      
    // Function to find the longest substring 
    // which is prefix as well as a 
    // sub-string of s[1...n-2] 
    static void Longestsubstring(String s) 
    { 
        // Find longest prefix suffix 
        int [] lps = compute_lps(s); 
        int n = s.length(); 
      
        // If lps of n-1 is zero 
        if (lps[n - 1] == 0) 
        { 
            System.out.println(-1); 
            return; 
        } 
      
        for (int i = 0; i < n - 1; i++)  
        { 
      
            // At any position lps[i] equals to lps[n - 1] 
            if (lps[i] == lps[n - 1])  
            { 
                System.out.println(s.substring(0, lps[i])); 
                return; 
            } 
        } 
      
        // If answer is not possible 
        if (lps[lps[n - 1] - 1] == 0) 
            System.out.println(-1); 
        else
            System.out.println(s.substring(0, lps[lps[n - 1] - 1])); 
    } 
      
    // Driver code 
    public static void main (String [] args) 
    { 
        String s = "fixprefixsuffix"; 
      
        // function call 
        Longestsubstring(s); 
      
    } 
} 
  
// This code is contributed by ihritik  

