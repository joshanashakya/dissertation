

// Java implementation of the above approach  
class GFG 
{ 
  
// Function that returns true if the sub-String  
// starting from index i and ending at index j  
// is a palindrome  
static boolean isPalindrome(String s, int i, int j)  
{  
    while (i < j)  
    {  
        if (s.charAt(i) != s.charAt(j))  
            return false;  
        i++;  
        j--;  
    }  
    return true;  
}  
  
// Function to get the required index  
static int getIndex(String s1, String s2, int len)  
{  
    int i = 0, j = len - 1;  
  
    // Start comparing the two Strings  
    // from both ends.  
    while (i < j)  
    {  
        // Break from the loop at first mismatch  
        if (s1.charAt(i) != s2.charAt(j)) 
        {  
            break;  
        }  
  
        i++;  
        j--;  
    }  
  
    // If it is possible to concatenate  
    // the Strings to form palindrome,  
    // return index  
    if (i == j)  
    {  
        return i - 1;  
    }  
  
    // If remaining part for s2  
    // is palindrome  
    else if (isPalindrome(s2, i, j))  
        return i - 1;  
  
    // If remaining part for s1  
    // is palindrome  
    else if (isPalindrome(s1, i, j))  
        return j;  
  
    // If not possible, return -1  
    return -1;  
}  
  
// Driver Code  
public static void main(String args[]) 
{  
    String s1 = "abcdf", s2 = "sfgba";  
    int len = s1.length();  
  
    System.out.println( getIndex(s1, s2, len));  
  
}  
}  
  
// This code is contributed by Arnab Kundu 

