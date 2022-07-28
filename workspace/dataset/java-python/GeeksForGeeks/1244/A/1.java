

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
static char []CHARS = "0123456789ABCDEF".toCharArray(); 
static int DIGITS = 16; 
  
// Function that returns true 
// if s is divisible by m 
static boolean isDivisible(String s, int m) 
{ 
    // Map to map characters to real values 
    Map<Character, Integer> mp = new HashMap<>(); 
  
    for (int i = 0; i < DIGITS; i++) 
    {          
        mp. put(CHARS[i], i); 
    } 
  
    // To store the remainder at any stage 
    int r = 0; 
  
    // Find the remainder 
    for (int i = 0; i < s.length(); i++)  
    { 
        r = (r * 16 + mp.get(s.charAt(i))) % m; 
    } 
  
    // Check the value of remainder 
    if (r == 0) 
        return true; 
    return false; 
} 
  
// Driver code 
public static void main(String []args)  
{ 
    String s = "10"; 
    int m = 3; 
  
    if (isDivisible(s, m)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

