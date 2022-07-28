

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function that returns true if 
// a palindrome can be formed using 
// exactly k characters 
static boolean isPalindrome(int freq[], int k) 
{ 
    // Variable to check if characters 
    // with odd frequency are present 
    int flag = 0; 
  
    // Variable to store maximum length 
    // of the palindrome that can be formed 
    int length = 0; 
  
    for (int i = 0; i < 26; i++)  
    { 
        if (freq[i] == 0) 
            continue; 
  
        else if (freq[i] == 1) 
            flag = 1; 
  
        else 
        { 
            if (freq[i] % 2 == 1) 
                flag = 1; 
            length += freq[i] / 2; 
        } 
    } 
  
    // If k is odd 
    if (k % 2 == 1) 
    { 
        if (2 * length + flag >= k) 
            return true; 
    } 
  
    // If k is even 
    else 
    { 
        if (2 * length >= k) 
            return true; 
    } 
  
    // If palindrome of length 
    // k cant be formed 
    return false; 
} 
  
// Function that returns true if a palindrome 
// of length k can be formed from a 
// sub-string of length m 
static boolean check(String str, int m, int k) 
{ 
    // Stores frequency of characters 
    // of a substring of length m 
    int []freq = new int[26]; 
  
    for (int i = 0; i < m; i++) 
        freq[str.charAt(i) - 'a']++; 
  
    // If a palindrome can be 
    // formed from a substring of 
    // length m 
    if (isPalindrome(freq, k)) 
        return true; 
  
    // Check for all the substrings of 
    // length m, if a palindrome of 
    // length k can be formed 
    for (int i = m; i < str.length(); i++) 
    { 
        freq[str.charAt(i-m) - 'a']--; 
        freq[str.charAt(i) - 'a']++; 
  
        if (isPalindrome(freq, k)) 
            return true; 
    } 
  
    // If no palindrome of length 
    // k can be formed 
    return false; 
} 
  
// Function to return the minimum length 
// of the sub-string whose characters can be 
// used to form a palindrome of length k 
static int find(String str, int n, int k) 
{ 
    int l = k; 
    int h = n; 
  
    // To store the minimum length of the 
    // sub-string that can be used to form 
    // a palindrome of length k 
    int ans = -1; 
  
    while (l <= h)  
    { 
        int m = (l + h) / 2; 
        if (check(str, m, k))  
        { 
            ans = m; 
            h = m - 1; 
        } 
        else
            l = m + 1; 
    } 
  
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "abcda"; 
    int n = str.length(); 
    int k = 2; 
    System.out.println(find(str, n, k)); 
    } 
} 
  
// This code is contributed by Rajput-Ji 

