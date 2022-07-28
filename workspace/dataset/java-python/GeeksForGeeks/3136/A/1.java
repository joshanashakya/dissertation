

// Java Program to reverse a string without 
// using temp variable 
import java.util.*; 
  
class GFG  
{ 
  
// Function to reverse string and 
// return revesed string 
static String reversingString(char []str, 
                               int start,  
                               int end) 
{ 
    // Iterate loop upto start not equal to end 
    while (start < end) 
    { 
        // XOR for swapping the variable 
        str[start] ^= str[end]; 
        str[end] ^= str[start]; 
        str[start] ^= str[end]; 
  
        ++start; 
        --end; 
    } 
    return String.valueOf(str); 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    String s = "GeeksforGeeks"; 
    System.out.println(reversingString 
                      (s.toCharArray(), 0, 12)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

