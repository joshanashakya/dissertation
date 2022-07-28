

// Java program to find the largest  
// palindromic subsequence  
class GFG 
{ 
  
// Function to find the largest  
// palindromic subsequence  
static String largestPalinSub(String s)  
{  
    String res = "";  
    char mx = s.charAt(0);  
  
    // Find the largest character  
    for (int i = 1; i < s.length(); i++)  
        mx = (char)Math.max((int)mx,  
                  (int)s.charAt(i));  
  
    // Append all occurrences of largest  
    // character to the resultant string  
    for (int i = 0; i < s.length(); i++)  
        if (s.charAt(i) == mx)  
            res += s.charAt(i);  
  
    return res;  
}  
  
// Driver Code 
public static void main(String []args) 
{ 
    String s = "geeksforgeeks";  
    System.out.println(largestPalinSub(s)); 
} 
} 
  
// This code is contributed by 
// Rituraj Jain 

