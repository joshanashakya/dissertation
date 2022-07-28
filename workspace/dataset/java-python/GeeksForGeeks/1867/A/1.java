

// Java implementation of above approach 
import java.util.*; 
  
class GFG  
{ 
  
// Function to return the String generated 
// by appending "10" n-1 times 
static String constructString(int n) 
{ 
    // Initialising String as empty 
    String s = ""; 
    for (int i = 0; i < n; i++)  
    { 
        s += "10"; 
    } 
    return s; 
} 
  
// Function to return the decimal equivalent 
// of the given binary String 
static int binaryToDecimal(String n) 
{ 
    String num = n; 
    int dec_value = 0; 
  
    // Initializing base value to 1 
    // i.e 2^0 
    int base = 1; 
  
    int len = num.length(); 
    for (int i = len - 1; i >= 0; i--)  
    { 
        if (num.charAt(i) == '1') 
            dec_value += base; 
        base = base * 2; 
    } 
  
    return dec_value; 
} 
  
// Function that calls the constructString 
// and binarytodecimal and returns the answer 
static int findNumber(int n) 
{ 
    String s = constructString(n - 1); 
    int num = binaryToDecimal(s); 
    return num; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int n = 4; 
  
    System.out.println(findNumber(n)); 
} 
} 
  
/* This code is contributed by PrinciRaj1992 */

