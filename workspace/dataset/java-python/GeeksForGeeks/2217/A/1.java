

// Java program to find the maximum number of 
// numbers divisible by 3 in a large number 
import java.util.*; 
  
class GFG 
{ 
      
// Function to find the maximum number of 
// numbers divisible by 3 in a large number 
static int MaximumNumbers(String s) 
{ 
    // store size of the string 
    int n = s.length(); 
  
    // Stores last index of a remainder 
    int [] remIndex={-1, -1, -1}; 
  
    // last visited place of remainder 
    // zero is at 0. 
    remIndex[0] = 0; 
  
    // To store result from 0 to i 
    int[] res = new int[n + 1]; 
  
    int r = 0; 
    for (int i = 1; i <= n; i++) 
    { 
  
        // get the remainder 
        r = (r + s.charAt(i-1) - '0') % 3; 
  
        // Get maximum res[i] value 
        res[i] = res[i - 1]; 
        if (remIndex[r] != -1) 
            res[i] = Math.max(res[i], 
                    res[remIndex[r]] + 1); 
  
        remIndex[r] = i + 1; 
    } 
  
    return res[n]; 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
    String s = "12345"; 
    System.out.println(MaximumNumbers(s)); 
} 
} 
  
// This code is contributed by  
// chandan_jnu 

