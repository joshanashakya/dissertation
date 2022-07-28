

// Java implementation of the approach 
class GFG 
{ 
      
    // Function that returns true if  
    // str[i...j] is a palindrome  
    static boolean isPalindrome(String str,  
                               int i, int j)  
    { 
        while (i < j) 
        { 
            if (str.charAt(i) != str.charAt(j)) 
            { 
                return false; 
            } 
            i++; 
            j--; 
        } 
        return true; 
    } 
  
    // Function to return the length of the  
    // longest palindromic sub-string such that  
    // it starts and ends with the character ch  
    static int maxLenPalindrome(String str, int n, char ch)  
    { 
        int maxLen = 0; 
  
        for (int i = 0; i < n; i++) 
        { 
  
            // If current character is  
            // a valid starting index  
            if (str.charAt(i) == ch) 
            { 
  
                // Instead of finding the ending index from  
                // the beginning, find the index from the end  
                // This is because if the current sub-string  
                // is a palindrome then there is no need to check  
                // the sub-strings of smaller length and we can  
                // skip to the next iteration of the outer loop  
                for (int j = n - 1; j >= i; j--)  
                { 
  
                    // If current character is  
                    // a valid ending index  
                    if (str.charAt(j) == ch)  
                    { 
  
                        // If str[i...j] is a palindrome then update  
                        // the length of the maximum palindrome so far  
                        if (isPalindrome(str, i, j))  
                        { 
                            maxLen = Math.max(maxLen, j - i + 1); 
                            break; 
                        } 
                    } 
                } 
            } 
        } 
        return maxLen; 
    } 
  
    // Driver code  
    public static void main(String[] args)  
    { 
        String str = "lapqooqpqpl"; 
        int n = str.length(); 
        char ch = 'p'; 
  
        System.out.println(maxLenPalindrome(str, n, ch)); 
    } 
} 
  
// This code is contributed by Princi Singh 

