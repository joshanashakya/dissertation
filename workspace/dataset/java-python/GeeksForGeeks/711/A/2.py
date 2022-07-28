

# Python3 Program to find the bitwise  
# OR of all the intgers in range L-R  
  
# Returns the Most Significant Bit  
# Position (MSB)  
def MSBPosition(N) :  
   
    msb_p = -1
    while (N) : 
        N = N >> 1 
        msb_p += 1 
   
    return msb_p  
   
  
# Returns the Bitwise OR of all  
# integers between L and R  
def findBitwiseOR(L, R) : 
  
    res = 0
  
    # Find the MSB position in L  
    msb_p1 = MSBPosition(L) 
  
    # Find the MSB position in R  
    msb_p2 = MSBPosition(R)  
  
    while (msb_p1 == msb_p2) : 
        res_val = (1 << msb_p1) 
  
        # Add this value until msb_p1 and  
        # msb_p2 are same;  
        res += res_val 
  
        L -= res_val 
        R -= res_val 
  
        # Calculate msb_p1 and msb_p2  
        msb_p1 = MSBPosition(L)  
        msb_p2 = MSBPosition(R)  
       
    # Find the max of msb_p1 and msb_p2  
    msb_p1 = max(msb_p1, msb_p2)  
  
    # Set all the bits from msb_p1 upto  
    # 0th bit in the result  
    for i in range(msb_p1, -1, -1) :  
        res_val = (1 << i) 
        res += res_val 
      
    return res  
   
  
# Driver Code  
if __name__ == "__main__" : 
   
    L , R= 12 ,18 
    print(findBitwiseOR(L, R))  
  
# This code is contributed by Ryuga 

