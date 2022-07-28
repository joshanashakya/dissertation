

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function that returns true if s contains 
// three consecutive 1's 
static boolean check(String s) 
{ 
    int n = s.length(); 
    for (int i = 2; i < n; i++)  
    { 
        if (s.charAt(i) == '1' &&  
          s.charAt(i-1) == '1' &&  
          s.charAt(i-2) == '1') 
            return true; 
    } 
    return false; 
} 
  
// Function to return the count 
// of required strings 
static int countStr(int i, String s) 
{ 
    if (i < 0) 
    { 
        if (check(s)) 
            return 1; 
        return 0; 
    } 
    char[] myNameChars = s.toCharArray(); 
    myNameChars[i] = '0'; 
    s = String.valueOf(myNameChars); 
  
    int ans = countStr(i - 1, s); 
    char[] myChar = s.toCharArray(); 
    myChar[i] = '1'; 
    s = String.valueOf(myChar); 
  
    ans += countStr(i - 1, s); 
    char[]myChar1 = s.toCharArray(); 
    myChar1[i] = '0'; 
    s = String.valueOf(myChar1); 
  
    return ans; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int N = 4; 
    String s = "0000"; 
    System.out.println(countStr(N - 1, s)); 
} 
} 
  
// This code is contributed by 
// Surendra_Gangwar 

