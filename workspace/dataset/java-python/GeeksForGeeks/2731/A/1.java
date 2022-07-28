

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
    static String reverse(String input)  
    { 
        char[] a = input.toCharArray(); 
        int l, r = 0; 
        r = a.length - 1; 
        for (l = 0; l < r; l++, r--)  
        { 
            // Swap values of l and r  
            char temp = a[l]; 
            a[l] = a[r]; 
            a[r] = temp; 
        } 
        return String.valueOf(a); 
    } 
  
    // Function to check whether 
    // the string is a palindrome 
    static boolean isPalindrome(String r)  
    { 
        String p = r; 
  
        // reverse the string to 
        // compare with the  
        // original string 
        p = reverse(p); 
          
        // check if both are same 
        return (r.equals(p)); 
    } 
  
    // Function to check whether the string 
    // has prefix and suffix substrings 
    // of length greater than 1 
    // which are palindromes. 
    static boolean CheckStr(String s)  
    { 
        int l = s.length(); 
  
        // check all prefix substrings 
        int i; 
        for (i = 2; i <= l; i++)  
        { 
  
            // check if the prefix substring 
            // is a palindrome 
            if (isPalindrome(s.substring(0, i)))  
            { 
                break; 
            } 
        } 
  
        // If we did not find any palindrome prefix 
        // of length greater than 1. 
        if (i == (l + 1))  
        { 
            return false; 
        } 
  
        // check all suffix substrings, 
        // as the string is reversed now 
        i = 2; 
        for (i = 2; i <=l; i++)  
        { 
  
            // check if the suffix substring 
            // is a palindrome 
            if (isPalindrome(s.substring(l-i,l)))  
            { 
                return true; 
            } 
        } 
  
        // If we did not find a suffix 
        return false; 
    } 
  
    // Driver code 
    public static void main(String args[])  
    { 
        String s = "abccbarfgdbd"; 
        if (CheckStr(s))  
        { 
            System.out.println("Yes"); 
        }  
        else
        { 
            System.out.println("No"); 
        } 
    } 
} 
  
// This code is contributed by Rajput-Ji 

