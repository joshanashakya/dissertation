

// Java Program to find number  
// of way to split string such  
// that each partition starts  
// with distinct character with  
// maximum number of partitions. 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
  
// Returns the number of we  
// can split the string 
static int countWays(String s) 
{ 
    int count[] = new int[26]; 
  
    // Finding the frequency of 
    // each character. 
    for (int i = 0; i < s.length(); i++) 
        count[s.charAt(i) - 'a']++; 
  
    // making frequency of first  
    // character of string equal to 1. 
    count[s.charAt(0) - 'a'] = 1; 
  
    // Finding the product of frequency  
    // of occurrence of each character. 
    int ans = 1; 
    for (int i = 0; i < 26; ++i) 
        if (count[i] != 0) 
            ans *= count[i]; 
  
    return ans; 
} 
  
// Driver Code 
public static void main(String ags[]) 
{ 
    String s = "acbbcc"; 
    System.out.println(countWays(s)); 
} 
} 
  
// This code is contributed 
// by Subhadeep 

