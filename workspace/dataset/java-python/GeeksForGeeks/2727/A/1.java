

// Java implementation of the approach 
class GFG 
{ 
      
// Function that returns true if s is palindrome 
static boolean isPalindrome(String s) 
{ 
    int i = 0; 
    int j = s.length() - 1; 
  
    while (i < j)  
    { 
        if (s.charAt(i) != s.charAt(j)) 
            return false; 
        i++; 
        j--; 
    } 
  
    return true; 
} 
  
// Function to return the required index 
static int getIndex(String S1, String S2, int n) 
{ 
  
    String S = ""; 
  
    for (int i = 0; i < n; i++) 
    { 
  
        // Copy the ith character in S 
        S = S + S1.charAt(i); 
        String Temp = ""; 
  
        // Copy all the character of string 
        // s2 in Temp 
        for (int j = i + 1; j < n; j++) 
            Temp += S2.charAt(j); 
  
        // Check whether the string is palindrome 
        if (isPalindrome(S + Temp))  
        { 
            return i; 
        } 
    } 
  
    return -1; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String S1 = "abcdf", S2 = "sfgba"; 
    int n = S1.length(); 
  
    System.out.println(getIndex(S1, S2, n)); 
} 
} 
  
// This code is contributed by Code_Mech. 

