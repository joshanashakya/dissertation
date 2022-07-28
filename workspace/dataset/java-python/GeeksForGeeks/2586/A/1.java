

// Java program to find the N-th  
// term in 1, 11, 55, 239, 991, .... 
import java.util.*; 
  
class GFG 
{ 
  
// Function to return the decimal 
// value of a binary number 
static int binaryToDecimal(String n) 
{ 
    String num = n; 
    int dec_value = 0; 
  
    // Initializing base 
    // value to 1, i.e 2^0 
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
  
// find the binary representation 
// of the N-th number in sequence 
static int numberSequence(int n) 
{ 
    // base case 
    if (n == 1) 
        return 1; 
  
    // answer string 
    String s = ""; 
  
    // add n-1 1's 
    for (int i = 1; i < n; i++) 
        s += '1'; 
  
    // add 0 
    s += '0'; 
  
    // add n 1's at end 
    for (int i = 1; i <= n; i++) 
        s += '1'; 
  
    int num = binaryToDecimal(s); 
  
    return num; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int n = 4; 
  
    System.out.println(numberSequence(n)); 
} 
} 
  
// This code is contributed  
// by Arnab Kundu 

