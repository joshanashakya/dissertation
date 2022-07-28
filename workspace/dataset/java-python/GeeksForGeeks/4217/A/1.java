

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to return the count of the  
// required strings 
static int findAnswer(String str1, String str2, int n) 
{ 
    int l = 0, r = 0; 
    int ans = 2; 
  
    // Searching index after longest common  
    // prefix ends 
    for (int i = 0; i < n; ++i)  
    { 
        if (str1.charAt(i) != str2.charAt(i))  
        { 
            l = i; 
            break; 
        } 
    } 
  
    // Searching index before longest common 
    // suffix ends 
    for (int i = n - 1; i >= 0; i--)  
    { 
        if (str1.charAt(i) != str2.charAt(i)) 
        { 
            r = i; 
            break; 
        } 
    } 
  
    // If str1 = str2 
    if (r < l) 
        return 26 * (n + 1); 
  
    // If only 1 character is different 
    // in both the strings 
    else if (l == r) 
        return ans; 
    else { 
  
        // Checking remaining part of string  
        // for equality 
        for (int i = l + 1; i <= r; i++)  
        { 
            if (str1.charAt(i) != str2.charAt(i - 1))  
            { 
                ans--; 
                break; 
            } 
        } 
  
        // Searching in right of string h 
        // (g to h) 
        for (int i = l + 1; i <= r; i++)  
        { 
            if (str1.charAt(i-1) != str2.charAt(i)) 
            { 
                ans--; 
                break; 
            } 
        } 
  
        return ans; 
    } 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    String str1 = "toy", str2 = "try"; 
    int n = str1.length(); 
    System.out.println(findAnswer(str1, str2, n)); 
      
} 
} 
  
// This code is contributed by 
// Surendra_Gangwar 

