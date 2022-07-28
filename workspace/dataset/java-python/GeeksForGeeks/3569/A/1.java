

// Java program to find XOR of ASCII 
// value of characters in String 
class GFG{ 
   
// Function to find the XOR of ASCII 
// value of characters in String 
static int XorAscii(String str, int len) 
{ 
   
    // store value of first character 
    int ans = (str.charAt(0)); 
   
    for (int i = 1; i < len; i++) { 
   
        // Traverse String to find the XOR 
        ans = (ans ^ ((str.charAt(i)))); 
    } 
   
    // Return the XOR 
    return ans; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
   
    String str = "geeksforgeeks"; 
    int len = str.length(); 
    System.out.print(XorAscii(str, len) +"\n"); 
   
    str = "GfG"; 
    len = str.length(); 
    System.out.print(XorAscii(str, len));  
} 
} 
  
// This code is contributed by PrinciRaj1992 

