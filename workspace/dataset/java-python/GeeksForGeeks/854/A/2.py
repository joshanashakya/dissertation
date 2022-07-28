

# Python Code to  find the Nth number 
# with exactly two bits set 
  
  
# Function to find the Nth number 
# with exactly two bits set 
def findNthNum(N): 
  
    bit_L = 1; 
    last_num = 0; 
  
    # Keep incrementing until 
    # we reach the partition of 'N' 
    # stored in bit_L 
    while (bit_L * (bit_L + 1) / 2 < N): 
        last_num = last_num + bit_L; 
        bit_L+=1; 
      
  
    # set the rightmost bit 
    # based on bit_R 
    bit_R = N - last_num - 1; 
  
    print((1 << bit_L) + (1 << bit_R)); 
  
  
# Driver code 
if __name__ == '__main__': 
    N = 13; 
  
    findNthNum(N); 
  
  
# This code contributed by PrinciRaj1992 

