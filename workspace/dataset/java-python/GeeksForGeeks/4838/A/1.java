

// Java code for finding the  
// longest length integer 
import java.io.*; 
import java.util.*; 
import java.lang.*; 
  
class GFG 
{ 
static String longestInteger(String str, int l) 
{ 
    int count = 0, max = 0,  
        pos = -1, pre_pos,  
        pre_len, len = 0; 
      
    // Traverse the string 
    for (int i = 0; i < l; i++)  
    { 
        // Store the previous position 
        // and previous length of the 
        // digits encountered. 
        pre_pos = pos; 
        pre_len = len; 
        count = 0; 
        len = 0; 
  
        // If first digit occurs, 
        // store its position in pos 
        if (Character.isDigit(str.charAt(i))) 
            pos = i; 
  
        // Traverse the string  
        // till a character occurs. 
        while (Character.isDigit(str.charAt(i)))  
        { 
            count++; 
            i++; 
            len++; 
        } 
  
        // Check if the length of  
        // the string is greater 
        // than the previous ones  
        // or not. 
        if (count > max) 
        { 
            max = count; 
        } 
        else
        { 
            pos = pre_pos; 
            len = pre_len; 
        } 
    } 
    return (str.substring(pos, pos + len)); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    String str = "geeks100for1234geeks"; 
    int l = str.length(); 
    System.out.print(longestInteger(str, l)); 
} 
} 

