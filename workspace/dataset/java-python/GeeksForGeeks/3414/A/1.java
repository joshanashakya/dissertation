

// Java implementation to find the  
// length of longest palindromic 
// sub-String using Recursion 
class GFG{ 
   
// Function to find maximum 
// of the two variables 
static int max(int x, int y) 
{ 
    return (x > y) ? x : y; 
} 
   
// Function to find the longest 
// palindromic subString : Recursion 
static int longestPalindromic(String str,  
             int i, int j, int count) 
{ 
       
    // Base condition when the start 
    // index is greater than end index 
    if (i > j) 
        return count; 
       
    // Base condition when both the  
    // start and end index are equal 
    if (i == j) 
        return (count + 1); 
           
    // Condition when corner characters 
    // are equal in the String 
    if (str.charAt(i) == str.charAt(j)) { 
           
        // Recursive call to find the 
        // longest Palindromic String 
        // by excluding the corner characters 
        count = longestPalindromic(str, i + 1,  
                  j - 1, count + 2); 
        return max(count,  
        max(longestPalindromic(str, i + 1, j, 0),  
         longestPalindromic(str, i, j - 1, 0))); 
    } 
       
    // Recursive call to find the  
    // longest Palindromic String 
    // by including one corner  
    // character at a time 
    return Math.max( 
       longestPalindromic(str, i + 1, j, 0),  
       longestPalindromic(str, i, j - 1, 0)); 
} 
   
// Function to find the longest  
// palindromic sub-String 
static int longest_palindromic_substr(String str) 
{ 
    // Utility function call 
    return longestPalindromic(str, 0,  
                 str.length() - 1, 0); 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    String str = "aaaabbaa"; 
       
    // Function Call 
    System.out.print(longest_palindromic_substr(str)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

