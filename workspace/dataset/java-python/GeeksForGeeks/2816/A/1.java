

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to return the minimum  
// operations of the given type required  
// to convert string s to string t 
static int minOperations(String s,  
                        String t, int n) 
{ 
    int ct0 = 0, ct1 = 0; 
    for (int i = 0; i < n; i++) 
    { 
  
        // Characters are already equal 
        if (s.charAt(i) == t.charAt(i)) 
            continue; 
  
        // Increment count of 0s 
        if (s.charAt(i) == '0') 
            ct0++; 
  
        // Increment count of 1s 
        else
            ct1++; 
    } 
  
    return Math.max(ct0, ct1); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    String s = "010", t = "101"; 
    int n = s.length(); 
    System.out.println(minOperations(s, t, n)); 
} 
} 
  
// This code is contributed by 
// Surendra_Gangwar 

