

// Java implementation of the approach 
class GFG{ 
   
// Function to check if a String 
// is made up of k alternating characters 
static boolean isKAlternating(String s, int k) 
{ 
    if (s.length() < k) 
        return false; 
   
    int checker = 0; 
   
    // Check if all the characters at 
    // indices 0 to K-1 are different 
    for (int i = 0; i < k; i++) { 
   
        int bitAtIndex = s.charAt(i) - 'a'; 
   
        // If that bit is already set in 
        // checker, return false 
        if ((checker & (1 << bitAtIndex)) > 0) { 
            return false; 
        } 
   
        // Otherwise update and continue by 
        // setting that bit in the checker 
        checker = checker | (1 << bitAtIndex); 
    } 
   
    for (int i = k; i < s.length(); i++) 
        if (s.charAt(i - k) != s.charAt(i) ) 
            return false; 
   
    return true; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    String str = "acdeac"; 
    int K = 4; 
   
    if (isKAlternating(str, K)) 
        System.out.print("Yes" +"\n"); 
    else
        System.out.print("No" +"\n");  
} 
} 
  
// This code is contributed by sapnasingh4991 

