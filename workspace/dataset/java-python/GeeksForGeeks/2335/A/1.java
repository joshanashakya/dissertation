

// Java implementation of above approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find the Nth smallest number 
static String find_number(int N, int K) 
{ 
    String r; 
  
    // If N is divisible by 100 then we 
    // multiply N + 1 otherwise, it will be 
    // divisible by 100 more than K times 
    if (N % 100 == 0)  
    { 
        N += 1; 
  
        // convert integer to string 
        r = String.valueOf(N); 
    } 
  
    // if N is not divisible by 100 
    else 
    { 
        // convert integer to string 
        r = String.valueOf(N); 
    } 
  
    // add 2*K 0's at the end to be divisible 
    // by 100 exactly K times 
    for (int i = 1; i <= K; i++) 
        r += "00"; 
  
    return r; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int N = 1000, K = 2; 
    String ans = find_number(N, K); 
    System.out.println(ans); 
} 
} 
  
/* This code is contributed by PrinciRaj1992 */

