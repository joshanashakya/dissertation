

// Java implementation of the approach 
class GFG 
{ 
  
// Binary representation of the digits 
static String bin[] = { "000", "001", "010", "011", 
                        "100", "101", "110", "111" }; 
  
// Function to return the maximum frequency 
// of s modulo with a power of 2 
static int maxFreq(String s) 
{ 
  
    // Store the binary representation 
    String binary = ""; 
  
    // Convert the octal to binary 
    for (int i = 0; i < s.length(); i++)  
    { 
        binary += bin[s.charAt(i) - '0']; 
    } 
  
    // Remove the LSB 
    binary = binary.substring(0,  
             binary.length() - 1); 
  
    int count = 1, prev = -1, i, j = 0; 
  
    for (i = binary.length() - 1;  
         i >= 0; i--, j++) 
  
        // If there is 1 in the binary representation 
        if (binary.charAt(i) == '1') 
        { 
  
            // Find the number of zeroes in between 
            // two 1's in the binary representation 
            count = Math.max(count, j - prev); 
            prev = j; 
        } 
    return count; 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    String octal = "13"; 
  
    System.out.println(maxFreq(octal)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

