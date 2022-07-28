

// Java implementation of the approach 
class GFG  
{ 
static int MAX = 64; 
  
// Function to return the maximum bitwise OR 
// possible among all the possible pairs 
static int maxOR(int L, int R) 
{ 
  
    // If there is only a single value 
    // in the range [L, R] 
    if (L == R)  
    { 
        return L; 
    } 
  
    int ans = 0; 
  
    // Loop through each bit from MSB to LSB 
    for (int i = MAX - 1; i >= 0; i--) 
    { 
        int p, lbit, rbit; 
        p = 1 << i; 
        lbit = (L >> i) & 1; // bit of left limit 
        rbit = (R >> i) & 1; // bit of right limit 
  
        // MSBs where the bits differ, 
        // all bits from that bit are set 
        if ((rbit == 1) && (lbit == 0))  
        { 
            ans += (p << 1) - 1; 
            break; 
        } 
  
        // If MSBs are same, then ans 
        // bit is same as that of 
        // bit of right or left limit 
        if (rbit == 1)  
        { 
            ans += p; 
        } 
    } 
    return ans; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int L = 4, R = 5; 
  
    System.out.println(maxOR(L, R)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

