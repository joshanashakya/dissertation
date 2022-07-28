

// Java implementation of the approach 
class GFG { 
  
    // Function that returns 1 if str is valid 
    private static boolean isValidString(String str, int n) 
    { 
  
        // Index of first appearance of 'b' 
        int index = str.indexOf("b"); 
  
        // If str starts with 'b' 
        if (index == 0) 
            return false; 
  
        // While 'b' occurs in str 
        while (index != -1) { 
  
            // If 'b' doesn't appear after an 'a' 
            if (str.charAt(index - 1) != 'a') 
                return false; 
  
            // If 'b' is not succeeded by another 'b' 
            if (index + 1 < n && str.charAt(index + 1) != 'b') 
                return false; 
  
            // If sub-string is of the type "abbb" 
            if (index + 2 < n && str.charAt(index + 2) == 'b') 
                return false; 
  
            // If str ends with a single b 
            if (index == n - 1) 
                return false; 
  
            index = str.indexOf("b", index + 2); 
        } 
        return true; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "abbaaabbabba"; 
        int n = str.length(); 
        System.out.println(isValidString(str, n)); 
    } 
} 

