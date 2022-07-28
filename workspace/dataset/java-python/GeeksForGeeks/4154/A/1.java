

// Java implementation of the approach 
class GFG { 
  
    // Function that return true if sub-string  
    // of length k starting at index i is also  
    // a prefix of the string 
    static boolean isPrefix(String str, int len, int i, int k) 
    { 
        // k length sub-string cannot start at index i 
        if (i + k > len) 
            return false; 
        for (int j = 0; j < k; j++) { 
  
            // Character mismatch between the prefix 
            // and the sub-string starting at index i 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
            i++; 
        } 
        return true; 
    } 
  
    // Function that returns true if str is K-periodic 
    static boolean isKPeriodic(String str, int len, int k) 
    { 
        // Check whether all the sub-strings 
        // str[0, k-1], str[k, 2k-1] ... are equal 
        // to the k length prefix of the string 
        for (int i = k; i < len; i += k) 
            if (!isPrefix(str, len, i, k)) 
                return false; 
        return true; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "geeksgeeks"; 
        int len = str.length(); 
        int k = 5; 
  
        if (isKPeriodic(str, len, k)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
    } 
} 

