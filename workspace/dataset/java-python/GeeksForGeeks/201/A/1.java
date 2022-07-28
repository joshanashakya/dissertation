

// Java program to find the longest  
// palindrome in a String formed by  
// concatenating its prefix and suffix 
import java.util.*; 
  
class GFG{ 
   
// Function to check whether 
// the String is a palindrome 
static boolean isPalindrome(String r) 
{ 
    String p = r; 
   
    // Reverse the String to 
    // compare with the 
    // original String 
    p = reverse(p); 
   
    // Check if both are same 
    return (r.equals(p)); 
} 
   
// Function to find the longest 
// palindrome in a String formed by 
// concatenating its prefix and suffix 
static String PrefixSuffixPalindrome(String str) 
{ 
    // Length of the String 
    int n = str.length(), len = 0; 
   
    // Finding the length upto which 
    // the suffix and prefix forms a 
    // palindrome together 
    for (int i = 0; i < n / 2; i++) { 
        if (str.charAt(i) != str.charAt(n - i - 1)) { 
            len = i; 
            break; 
        } 
    } 
   
    // Check whether the String 
    // has prefix and suffix subStrings 
    // which are palindromes. 
    String prefix = "", suffix = ""; 
    String midPal = ""; 
   
    // Removing the suffix and prefix 
    // subStrings which already forms 
    // a palindrome and storing them 
    // in separate Strings 
    prefix = str.substring(0, len); 
    suffix = str.substring(n - len); 
    str = str.substring(len, (n - 2 * len) + len); 
   
    // Check all prefix subStrings 
    // in the remaining String str 
    for (int i = 1; i <= str.length(); i++) { 
        String y = str.substring(0, i); 
   
        // Check if the prefix subString 
        // is a palindrome 
        if (isPalindrome(y)) { 
   
            // If the prefix subString 
            // is a palindrome then check 
            // if it is of maximum length 
            // so far 
            if (midPal.length() < y.length()) { 
                midPal = y; 
            } 
        } 
    } 
   
    // Check all the suffix subStrings 
    // in the remaining String str 
    for (int i = 1; i <= str.length(); i++) { 
        String y = str.substring(str.length() - i); 
   
        // Check if the suffix subString 
        // is a palindrome 
        if (isPalindrome(y)) { 
   
            // If the suffix subString 
            // is a palindrome then check 
            // if it is of maximum length 
            // so far 
            if (midPal.length() < y.length()) { 
                midPal = y; 
            } 
        } 
    } 
   
    // Combining all the thee parts 
    // of the answer 
    String answer = prefix + midPal + suffix; 
   
    return answer; 
} 
static String reverse(String input) { 
    char[] a = input.toCharArray(); 
    int l, r = a.length - 1; 
    for (l = 0; l < r; l++, r--) { 
        char temp = a[l]; 
        a[l] = a[r]; 
        a[r] = temp; 
    } 
    return String.valueOf(a); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    String str = "abcdfdcecba"; 
   
    System.out.print(PrefixSuffixPalindrome(str)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

