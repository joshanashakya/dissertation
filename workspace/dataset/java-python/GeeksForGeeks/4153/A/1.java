

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the encrypted String 
static String encryptString(String str, int n) 
{ 
    int i = 0, cnt = 0; 
    String encryptedStr = ""; 
  
    while (i < n)  
    { 
  
        // Number of times the current 
        // character will be repeated 
        cnt = i + 1; 
  
        // Repeat the current character 
        // in the encrypted String 
        while (cnt-- >0) 
            encryptedStr += str.charAt(i); 
        i++; 
    } 
  
    return encryptedStr; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    String str = "geeks"; 
    int n = str.length(); 
    System.out.println(encryptString(str, n)); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

