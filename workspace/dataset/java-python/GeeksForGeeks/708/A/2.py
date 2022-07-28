

# Python3 implementation of the approach 
  
# Function to return the maximum bitwise 
# OR of any pair from the given range 
def max_bitwise_or(L, R): 
    v1 = [] 
    v2 = [] 
    v3 = [] 
    z = 0
    i = 0
    ans = 0
    cnt = 1
  
    # Converting L to its binary representation 
    while (L > 0): 
        v1.append(L % 2) 
        L = L // 2
  
    # Converting R to its binary representation 
    while (R > 0): 
        v2.append(R % 2) 
        R = R // 2
  
    # In order to make the number 
    # of bits of L and R same 
    while (len(v1) != len(v2)): 
  
        # Push 0 to the MSB 
        v1.append(0) 
  
    for i in range(len(v2) - 1, -1, -1): 
  
        # When ith bit of R is 1 
        # and ith bit of L is 0 
        if (v2[i] == 1 and 
            v1[i] == 0 and z == 0): 
            z = 1
            continue
  
        # From MSB side set all bits of L to be 1 
        if (z == 1): 
  
            # From (i+1)th bit, all bits 
            # of L changed to be 1 
            v1[i] = 1
  
    for i in range(len(v2)): 
        v3.append(v2[i] | v1[i]) 
  
    for i in range(len(v2)): 
        if (v3[i] == 1): 
            ans += cnt 
        cnt *= 2
  
    return ans 
  
# Driver code 
L = 10
R = 20
  
print(max_bitwise_or(L, R)) 
  
# This code is contributed by Mohit Kumar 

