

# Python3 code to determine Length of  
# longest consecutive zeroes in the 
# binary representation of a number.  
def maxZeros(N): 
  
    # variable to store the length  
    # of longest consecutive 0's 
    maxm = -1
  
    # to temporary store the  
    # consecutive 0's 
    cnt = 0
    while(N): 
        if(not(N & 1)): 
            cnt += 1
            N >>= 1
            maxm = max(maxm,cnt) 
        else: 
            maxm = max(maxm,cnt) 
            cnt = 0
            N >>= 1
  
    return maxm 
  
# Driver Code 
N = 14
print(maxZeros(N)) 
  
# This code is written by Shrikant13 

