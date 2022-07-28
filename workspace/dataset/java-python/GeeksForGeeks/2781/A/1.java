

// Java program to find the minimum  
// number of characters to be  
// replaced in string S2, such 
// that S1 is a substring of S2 
import java.io.*; 
  
class GFG  
{ 
  
// Function to find the minimum  
// number of characters to be  
// replaced in string S2, such 
// that S1 is a substring of S2 
static int minimumChar(String S1, 
                       String S2) 
{ 
    // Get the sizes of both strings 
    int n = S1.length(); 
    int m = S2.length(); 
  
    int ans = Integer.MAX_VALUE ; 
  
    // Traverse the string S2 
    for (int i = 0; i < m - n + 1; i++) 
    { 
        int minRemovedChar = 0; 
  
        // From every index in S2, check  
        // the number of mis-matching  
        // characters in substring of 
        // length of S1 
        for (int j = 0; j < n; j++)  
        { 
            if (S1.charAt(j) != S2.charAt(i + j))  
            { 
                minRemovedChar++; 
            } 
        } 
  
        // Take minimum of prev and  
        // current mis-match 
        ans = Math.min(minRemovedChar, ans); 
    } 
  
    // return answer 
    return ans; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    String S1 = "abc"; 
    String S2 = "paxzk"; 
      
    System.out.println(minimumChar(S1, S2)); 
} 
} 
  
// This code is contributed by Shashank 

