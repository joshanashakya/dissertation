

// Java implemenation to find the 
// Nth occurrence of a character 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find the 
// Nth occurrence of a character 
static int findNthOccur(String str, 
                    char ch, int N) 
{ 
    int occur = 0; 
  
    // Loop to find the Nth 
    // occurence of the character 
    for (int i = 0; i < str.length(); i++)  
    { 
        if (str.charAt(i) == ch) 
        { 
            occur += 1; 
        } 
        if (occur == N) 
            return i; 
    } 
    return -1; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    String str = "geeks"; 
    char ch = 'e'; 
    int N = 2; 
    System.out.print(findNthOccur(str, ch, N)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

