

// Java program to find permutation  
// of n which is divisible by 3  
// but not divisible by 6 
import java.lang.*; 
import java.util.*; 
  
class GFG 
{ 
// Function to find the permutation 
static int findPermutation(int n) 
{ 
    // length of integer 
    int len = (int)Math.ceil(Math.log10(n)); 
  
    for (int i = 0; i < len; i++)  
    { 
        // if integer is even 
        if (n % 2 != 0)  
        { 
            // return odd integer 
            return n; 
        } 
        else
        { 
            // rotate integer 
            n = (n / 10) + (n % 10) *  
                (int)Math.pow(10, len - i - 1); 
            continue; 
        } 
    } 
  
    // return -1 in case no required 
    // permutation exists 
    return -1; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int n = 132; 
  
    System.out.println(findPermutation(n)); 
} 
} 
  
// This code is contributed 
// by Akanksha Rai(Abby_akku) 

