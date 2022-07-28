

// Java program to count minimum palindromic 
// subsequences to be removed to make  
// an string empty. 
import java.io.*; 
  
class GFG { 
      
// A function to check if a string 
// str is palindrome 
static boolean isPalindrome(String str) 
{ 
    // Start from leftmost and rightmost 
    // corners of str 
    int l = 0; 
    int h = str.length() - 1; 
  
    // Keep comparing characters  
    // while they are same 
    while (h > l) 
        if (str.charAt(l++) != str.charAt(h--)) 
            return false; 
  
    return true; 
} 
  
// Returns count of minimum palindromic  
// subseuqnces to be removed to 
// make string empty 
static int minRemovals(String str) 
{ 
    // If string is empty 
    if (str.charAt(0) == '') 
        return 0; 
  
    // If string is palindrome 
    if (isPalindrome(str)) 
        return 1; 
  
    // If string is not palindrome 
    return 2; 
} 
  
// Driver code to test above 
public static void main (String[] args)  
{ 
    System.out.println (minRemovals("010010")); 
    System.out.println (minRemovals("0100101")); 
          
} 
} 
  
// This code is contributed by vt_m. 

