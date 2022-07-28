

// Java implementation of the approach  
import java.util.*; 
class GfG  
{  
  
// Function to print kth character of  
// String s after decrypting it  
static Character findKthChar(String s, int k)  
{  
  
    // Get the length of string  
    int len = s.length();  
  
    // Initialise pointer to character  
    // of input string to zero  
    int i = 0;  
  
    // Total length of resultant string  
    int total_len = 0;  
  
    // Traverse the string from starting  
    // and check if each character is  
    // alphabet then increament total_len  
    while (i < len) 
    {  
        if (Character.isLetter(s.charAt(i))) 
        {  
  
            total_len++;  
  
            // If total_leg equal to k then  
            // return string else increment i  
            if (total_len == k)  
                return s.charAt(i);  
  
            i++;  
        }  
  
        else
        {  
  
            // Parse the number  
            int n = 0;  
            while (i < len && !Character.isLetter(s.charAt(i))) 
            {  
                n = n * 10 + (s.charAt(i) - '0');  
                i++;  
            }  
  
            // Update next_total_len  
            int next_total_len = total_len * n;  
  
            // Get the position of kth character  
            if (k <= next_total_len) 
            {  
                int pos = k % total_len;  
  
                // Position not found then update  
                // position with total_len  
                if (pos == 0) 
                {  
                    pos = total_len;  
                }  
  
                // Recursively find the kth position  
                return findKthChar(s, pos);  
            }  
            else 
            {  
  
                // Else update total_len  
                // by next_total_len  
                total_len = next_total_len;  
            }  
        }  
    }  
  
    // Return -1 if character not found  
    return ' ';  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    String s = "ab2c3";  
    int k = 5;  
  
    System.out.println(findKthChar(s, k));  
} 
}  
  
// This code is contributed by Prerna Saini. 

