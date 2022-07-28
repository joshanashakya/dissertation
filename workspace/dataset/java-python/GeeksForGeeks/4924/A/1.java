

// Java implementation of the above approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find the Number of sub-Strings 
// without using given character 
static int countSubString(char []S, char L[], int n) 
{ 
    int []freq = new int[26]; 
    int ans = 0; 
  
    // Mark the given characters in 
    // the freq array 
    for (int i = 0; i < n; i++)  
    { 
        freq[(int)(L[i] - 'a')] = 1; 
    } 
  
    // Count variable to store the count 
    // of the characters until a character 
    // from given L is encountered 
    int count = 0; 
  
    for (int x : S) 
    { 
  
        // If a character from L is encountered, 
        // then the answer variable is incremented by 
        // the value obtained by using 
        // the mentioned formula and count is set to 0 
        if (freq[(int)(x - 'a')] > 0)  
        { 
            ans += (count * count + count) / 2; 
            count = 0; 
        } 
        else
            count++; 
    } 
  
    // For last remaining characters 
    ans += (count * count + count) / 2; 
  
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String S = "abcpxyz"; 
    char L[] = { 'a', 'p', 'q' }; 
    int n = L.length; 
  
    System.out.print(countSubString(S.toCharArray(), L, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

