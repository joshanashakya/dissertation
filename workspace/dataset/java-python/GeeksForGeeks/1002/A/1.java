

// Java implementation of the approach 
class GFG 
{ 
  
static int MAX = 10; 
  
// Function that returns true 
// if ch is a digit 
static boolean isDigit(char ch) 
{ 
    if (ch >= '0' && ch <= '9') 
        return true; 
    return false; 
} 
  
// Function that returns true 
// if str contains all the 
// digits from 0 to 9 
static boolean allDigits(String str, int len) 
{ 
  
    // To mark the present digits 
    boolean []present = new boolean[MAX]; 
  
    // For every character of the String 
    for (int i = 0; i < len; i++)  
    { 
  
        // If the current character is a digit 
        if (isDigit(str.charAt(i))) 
        { 
  
            // Mark the current digit as present 
            int digit = str.charAt(i) - '0'; 
            present[digit] = true; 
        } 
    } 
  
    // For every digit from 0 to 9 
    for (int i = 0; i < MAX; i++) 
    { 
  
        // If the current digit is 
        // not present in str 
        if (!present[i]) 
            return false; 
    } 
  
    return true; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "Geeks12345for69708"; 
    int len = str.length(); 
  
    if (allDigits(str, len)) 
        System.out.print("Yes"); 
    else
        System.out.print("No"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

