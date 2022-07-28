

// Java implementation of the approach 
class GFG { 
  
    // Function that returns true if s1 
    // is equal to reverse of s2 
    static boolean isReverseEqual(String s1, String s2) 
    { 
  
        // If both the strings differ in length 
        if (s1.length() != s2.length()) 
            return false; 
  
        int len = s1.length(); 
        for (int i = 0; i < len; i++) 
  
            // In case of any character mismatch 
            if (s1.charAt(i) != s2.charAt(len - i - 1)) 
                return false; 
  
        return true; 
    } 
  
    // Function to return teh first word whose 
    // reverse is also present in the array 
    static String getWord(String str[], int n) 
    { 
  
        // Check every string 
        for (int i = 0; i < n - 1; i++) 
  
            // Pair with every other string 
            // appearing after the current string 
            for (int j = i + 1; j < n; j++) 
  
                // If first string is equal to the 
                // reverse of the second string 
                if (isReverseEqual(str[i], str[j])) 
                    return str[i]; 
  
        // No such string exists 
        return "-1"; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str[] = { "geeks", "for", "skeeg" }; 
        int n = str.length; 
  
        System.out.print(getWord(str, n)); 
    } 
} 

