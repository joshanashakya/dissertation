

# Python3 implementation of the approach  
  
MAX = 64;  
  
# Function to return the maximum bitwise OR  
# possible among all the possible pairs  
def maxOR(L, R) :  
  
    # If there is only a single value  
    # in the range [L, R]  
    if (L == R) : 
        return L;  
  
    ans = 0;  
  
    # Loop through each bit from MSB to LSB  
    for i in range(MAX - 1, -1, -1) : 
        p = 1 << i;  
        lbit = (L >> i) & 1; # bit of left limit  
        rbit = (R >> i) & 1; # bit of right limit  
  
        # MSBs where the bits differ,  
        # all bits from that bit are set  
        if ((rbit == 1) and (lbit == 0)) : 
            ans += (p << 1) - 1;  
            break;  
  
        # If MSBs are same, then ans  
        # bit is same as that of  
        # bit of right or left limit  
        if (rbit == 1) : 
            ans += p;  
   
    return ans;  
  
# Driver code  
if __name__ == "__main__" :  
  
    L = 4; R = 5;  
  
    print(maxOR(L, R));  
  
    # This code is contributed by kanugargng 

