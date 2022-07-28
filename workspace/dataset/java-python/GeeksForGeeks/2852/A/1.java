

// Java program to solve the above problem 
import java.util.Arrays; 
  
class GFG 
{ 
  
// Function to check if string is palindrome or not 
static boolean isPalindrome(String s) 
{ 
    for (int i = 0; i < s.length(); ++i) 
    { 
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) 
        { 
            return false; 
        } 
    } 
    return true; 
} 
  
// Function to check if it is possible to 
// get result by making just one cut 
static boolean ans(String s) 
{ 
    String s2 = s; 
  
    for (int i = 0; i < s.length(); ++i)  
    { 
        // Appending last element in front 
        s2 = s2.charAt(s2.length()-1) + s2; 
          
        // Removing last element 
        s2 = s2.substring(0,s2.length()-1); 
  
        // Checking whether string s2 is palindrome 
        // and different from s. 
        if ((s == null ? s2 != null : !s.equals(s2)) &&  
                                        isPalindrome(s2)) 
        { 
            return true; 
        } 
    } 
    return false; 
} 
  
static int solve(String s) 
{ 
    // If length is <=3 then it is impossible 
    if (s.length() <= 3)  
    { 
        return -1; 
    } 
  
    // Array to store frequency of characters 
    int cnt[] = new int[25]; 
  
    // Store count of characters in a array 
    for (int i = 0; i < s.length(); i++)  
    { 
        cnt[s.charAt(i) - 'a']++; 
    } 
  
    // Condition for edge cases 
    if (Arrays.stream(cnt).max().getAsInt() >= 
                                (s.length() - 1))  
    { 
        return -1; 
    } 
    else 
    { 
        // Return 1 if it is possible to get palindromic 
        // string in just one cut. 
        // Else we can always reached in two cuttings. 
        return (ans(s) ? 1 : 2); 
    } 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
        String s = "nolon"; 
        System.out.println(solve(s)); 
    } 
} 
  
// This code contributed by Rajput-Ji 

