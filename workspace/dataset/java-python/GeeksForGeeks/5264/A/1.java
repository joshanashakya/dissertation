

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the lexicographically 
// smallest palindrome that can be made from 
// the given string after replacing 
// the required characters 
static String makePalindrome(char[] str) 
{ 
    int i = 0, j = str.length - 1; 
  
    while (i <= j)  
    { 
  
        // If characters are missing at both the positions 
        // then substitute it with 'a' 
        if (str[i] == '*' && str[j] == '*')  
        { 
            str[i] = 'a'; 
            str[j] = 'a'; 
        } 
  
        // If only str[j] = '*' then update it 
        // with the value at str[i] 
        else if (str[j] == '*') 
            str[j] = str[i]; 
  
        // If only str[i] = '*' then update it 
        // with the value at str[j] 
        else if (str[i] == '*') 
            str[i] = str[j]; 
  
        // If characters at both positions 
        // are not equal and != '*' then the string 
        // cannot be made palindrome 
        else if (str[i] != str[j]) 
            return "-1"; 
  
        i++; 
        j--; 
    } 
  
    // Return the required palindrome 
    return String.valueOf(str); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    char[] str = "na*an".toCharArray(); 
  
    System.out.println(makePalindrome(str)); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

