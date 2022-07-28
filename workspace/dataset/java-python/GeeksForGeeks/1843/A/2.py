

# Python3 implementation of the approach 
  
# Function to return the most significant bit 
def msb(x) : 
  
    ret = 0
    while ((x >> (ret + 1)) != 0) : 
        ret = ret + 1
    return ret 
  
# Function to return the required XOR 
def xorRange(l, r) : 
  
    # Finding the MSB 
    max_bit = msb(r) 
  
    # Value of the current bit to be added 
    mul = 2
  
    # To store the final answer 
    ans = 0
  
    # Loop for case 1 
    for i in range (1, max_bit + 1) :  
  
        # Edge case when both the integers 
        # lie in the same segment of continuous 
        # 1s 
        if ((l // mul) * mul == (r // mul) * mul) :  
            if ((((l & (1 << i)) != 0) and 
                 (r - l + 1) % 2 == 1)) : 
                ans = ans + mul 
            mul = mul * 2
            continue
          
        # To store whether parity of count is odd 
        odd_c = 0
  
        if (((l & (1 << i)) != 0) and l % 2 == 1) : 
            odd_c = (odd_c ^ 1) 
        if (((r & (1 << i)) != 0) and r % 2 == 0) : 
            odd_c = (odd_c ^ 1) 
  
        # Updating the answer if parity is odd 
        if (odd_c) : 
            ans = ans + mul 
  
        # Updating the number to be added 
        mul = mul * 2
      
    # Case 2 
    zero_bit_cnt = (r - l + 1) // 2
  
    if ((l % 2 == 1 ) and (r % 2 == 1)) : 
        zero_bit_cnt = zero_bit_cnt + 1
  
    if (zero_bit_cnt % 2 == 1): 
        ans = ans + 1
  
    return ans 
  
# Driver code 
l = 1
r = 4
  
# Final answer 
print(xorRange(l, r)) 
  
# This code is contributed by ihritik 

