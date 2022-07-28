

// Java implementation of the approach 
import java.util.*; 
class GFG 
{ 
  
// Function to check if  
// the string is palindrome  
static boolean checkPalindrome(String s) 
{  
    for (int i = 0; i < s.length(); i++) 
    { 
        if(s.charAt(i) != s.charAt(s.length() - i - 1))  
            return false; 
    } 
    return true; 
}  
  
// Function that checks whether  
// all the palindromic  
// sub-strings are of odd length.  
static boolean CheckOdd(String s)  
{ 
int n = s.length(); 
for (int i = 0; i < n; i++) 
{ 
      
    // Creating each substring  
    String x = ""; 
    for (int j = i; j < n; j++) 
    { 
        x += s.charAt(j); 
          
        // If the sub-string is  
        // of even length and  
        // is a palindrome then,  
        // we return False  
        if(x.length() % 2 == 0 &&  
           checkPalindrome(x) == true) 
            return false; 
        } 
    } 
      
    return true; 
} 
  
// Driver code  
public static void main(String args[]) 
{ 
    String s = "geeksforgeeks"; 
    if(CheckOdd(s))  
        System.out.print("YES");  
    else
        System.out.print("NO");  
} 
} 
  
// This code is contributed 
// by Arnab Kundu 

