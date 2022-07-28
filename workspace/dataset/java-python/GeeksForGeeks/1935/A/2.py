

# Python3 program to find  
# i’th Index character in 
# a binary string obtained 
# after n iterations 
  
# Function to find  
# the i-th character 
def KthCharacter(m, n, k): 
  
    # distance between two  
    # consecutive elements 
    # after N iterations 
    distance = pow(2, n) 
    Block_number = int(k / distance) 
    remaining = k % distance 
  
    s = [0] * 32
    x = 0
  
    # binary representation of M 
    while(m > 0) : 
        s[x] = m % 2
        m = int(m / 2) 
        x += 1
          
    # kth digit will be derived 
    # from root for sure 
    root = s[x - 1 - Block_number] 
      
    if (remaining == 0): 
        print(root) 
        return
      
    # Check whether there  
    # is need to flip root 
    # or not 
    flip = True
    while (remaining > 1): 
        if (remaining & 1):  
            flip = not(flip) 
          
        remaining = remaining >> 1
      
    if (flip) : 
        print(not(root)) 
      
    else : 
        print(root) 
      
# Driver Code 
m = 5
k = 5
n = 3
KthCharacter(m, n, k) 
  
# This code is contributed  
# by smita 

