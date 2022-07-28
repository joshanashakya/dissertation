

// Java program to Check  
// if similar subsequences  
// exist or not 
import java.io.*; 
import java.util.*; 
import java.util.Arrays; 
  
class GFG 
{ 
// Function to check if 
// similar subsequences 
// occur in a string or not 
static boolean check(String s,  
                     int l) 
{ 
    int freq[] = new int[26]; 
    Arrays.fill(freq, 0); 
      
    // iterate and count 
    // the frequency 
    for (int i = 0; i < l; i++)  
    { 
        // counting frequency 
        // of the letters 
        freq[s.charAt(i) - 'a']++;  
    } 
  
    // check if frequency is more 
    // than once of any character 
    for (int i = 0; i < 26; i++)  
    { 
        if (freq[i] >= 2) 
            return true; 
    } 
    return false; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    String s = "geeksforgeeks"; 
    int l = s.length(); 
    if (check(s, l)) 
        System.out.print("YES"); 
    else
        System.out.print("NO"); 
} 
} 

