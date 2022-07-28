

// Java program to find the Longest continuous 
// sequence of '0' after repeating Given string K time 
class GFG 
{ 
  
// Function to find the longest substring of 0's 
static int longest_substring(String s, int k) 
{ 
    // To store size of the string 
    int n = s.length(); 
      
    if(k > 1) 
    { 
        s += s; 
        n *= 2; 
    }  
      
    // To store the required answer 
    int ans = 0; 
      
    // Find the longest substring of 0's 
    int i = 0; 
    while (i < n) 
    { 
        int x = 0; 
          
        // Run a loop upto s[i] is zero 
        while (i < n && s.charAt(i) == '0') 
        { 
            x++; i++; 
        } 
        ans = Math.max(ans, x); 
        i++; 
    } 
      
    // Check the conditions 
    if(k == 1 || ans != n) 
        return ans; 
          
    else
        return (ans / 2) * k; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    String s = "010001000"; 
      
    int k = 4; 
      
    // Function call 
    System.out.println(longest_substring(s, k)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

