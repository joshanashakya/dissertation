

// Java implementation of the approach 
class GFG  
{ 
    // Function to return the count of 
    // required non-overlapping sub-strings 
    static int countSubStr(char[] s, int n) 
    { 
  
        // To store the required count 
        int count = 0; 
        for (int i = 0; i < n - 2😉  
        { 
  
            // If "010" matches the sub-string 
            // starting at current index i 
            if (s[i] == '0' && s[i + 1] == '1'
                    && s[i + 2] == '0') 
            { 
                count++; 
                i += 3; 
            }  
            // If "101" matches the sub-string 
            // starting at current index i 
            else if (s[i] == '1' && s[i + 1] == '0'
                    && s[i + 2] == '1')  
            { 
                count++; 
                i += 3; 
            } 
            else 
              
            { 
                i++; 
            } 
        } 
  
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        char[] s = "10101010101".toCharArray(); 
        int n = s.length; 
  
        System.out.println(countSubStr(s, n)); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

