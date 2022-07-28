

// Java implementation of the approach 
class GFG 
{  
    // Function to get no of set  
    // bits in binary representation  
    // of positive integer n  
    static int countSetBits(int n)  
    {  
        int count = 0;  
        while (n > 0)  
        {  
            count += n & 1;  
            n >>= 1;  
        }  
        return count;  
    }  
  
// Function to return the value x 
// such that (x XOR a) is minimum 
// and the number of set bits in x 
// is equal to the number 
// of set bits in b 
static int minVal(int a, int b) 
{ 
    // Count of set-bits in bit 
    int setBits = countSetBits(b); 
    int ans = 0; 
  
    for (int i = 30; i >= 0; i--)  
    { 
        int mask = 1 << i; 
          
        // If i'th bit is set also set the 
        // same bit in the required number 
        if ((a & mask) > 0 && setBits > 0)  
        { 
            ans |= (1 << i); 
              
            // Decrease the count of setbits 
            // in b as the count of set bits 
            // in the required number has to be 
            // equal to the count of set bits in b 
            setBits--; 
        } 
    } 
    return ans; 
} 
  
// Driver Code  
public static void main(String[] args)  
{  
    int a = 3, b = 5; 
  
    System.out.println(minVal(a, b)); 
}  
} 
  
// This code is contributed by Rajput-Ji 

