

// Java implementation of the approach 
class GFG { 
  
    // Function that checks if 
    // the String contain exactly 
    // K characters having ASCII 
    // value greater than p 
    boolean isValidSubString(String r, int K, int p) 
    { 
        int c = 0; 
  
        for (int i = 0; i < r.length(); i++) { 
  
            // if ASCII value is 
            // greater than 'p' 
            if ((int)r.charAt(i) > p) { 
                c++; 
            } 
        } 
  
        // if count of satisfying 
        // characters is equal to 'K' 
        // then return true 
        if (c == K) { 
            return true; 
        } 
  
        // otherwise return false 
        else { 
            return false; 
        } 
    } 
  
    // function to count sub-Strings 
    void countSubStrings(String s, int K, int p) 
    { 
        // length of the String 
        int l = s.length(); 
  
        // count of sub-Strings 
        int count = 0; 
  
        // 'i' is the starting 
        // index for the sub-String 
        for (int i = 0; i < l; i++) { 
  
            // 'j' is the no. of characters 
            // to include in the sub-String 
            for (int j = K; (i + j) <= l; j++) { 
  
                String r = s.substring(i, (i + j)); 
  
                // check if the sub-String 
                // satisfies the condition 
                if (isValidSubString(r, K, p)) { 
                    count++; 
                } 
            } 
        } 
        System.out.println(count); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        GFG g = new GFG(); 
        String s = "abepztydba"; 
        int K = 4; 
        int p = 110; 
  
        g.countSubStrings(s, K, p); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

