

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
static String CHARS = "qwertyuiopasdfghjklzxcvbnm"; 
static int MAX = 26; 
  
// Function to return the modified String 
static String getString(char[] str, int n) 
{ 
  
    // Map to store the next character 
    // on the keyboard for every 
    // possible lowercase character 
    Map<Character, Character> uMap = new HashMap<>(); 
    for (int i = 0; i < MAX; i++) 
    { 
        uMap. put(CHARS.charAt(i),  
                  CHARS.charAt((i + 1) % MAX)); 
    } 
  
    // Update the String 
    for (int i = 0; i < n; i++)  
    { 
        str[i] = uMap.get(str[i]); 
    } 
    return String.valueOf(str); 
} 
  
// Driver code 
public static void main(String []args)  
{ 
    String str = "geeks"; 
    int n = str.length(); 
  
    System.out.println(getString(str.toCharArray(), n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

