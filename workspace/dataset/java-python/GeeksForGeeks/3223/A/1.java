

// Java implementation of  
// above approach 
import java.io.*; 
  
class GFG  
{ 
  
// Function to count the number  
// of carry operations 
static int count_carry(String a, String b) 
{ 
    // Initialise the value  
    // of carry to 0 
    int carry = 0; 
  
    // Counts the number of 
    // carry operations 
    int count = 0; 
  
    // Initialise len_a and len_b  
    // with the sizes of strings 
    int len_a = a.length(),      
        len_b = b.length(); 
  
    while (len_a != 0 || len_b != 0)  
    { 
  
        // Assigning the ascii value  
        // of the character 
        int x = 0, y = 0; 
        if (len_a > 0)  
        { 
            x = a.charAt(len_a - 1) - '0'; 
            len_a--; 
        } 
        if (len_b > 0)  
        { 
            y = b.charAt(len_b - 1) - '0'; 
            len_b--; 
        } 
  
        // Add both numbers/digits 
        int sum = x + y + carry; 
  
        // If sum > 0, icrement count 
        // and set carry to 1 
        if (sum >= 10)  
        { 
            carry = 1; 
            count++; 
        } 
  
        // Else, set carry to 0 
        else
            carry = 0; 
    } 
  
    return count; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    String a = "9555", b = "555"; 
    int count = count_carry(a, b); 
    if (count == 0) 
        System.out.println("0\n"); 
    else if (count == 1) 
        System.out.println("1\n"); 
    else
        System.out.println(count); 
} 
} 
  
// This code is contributed by Shashank 

