

# Python3 implementation of the approach 
  
# Function to return the count 
# of the required subsequences 
def countSubSeq(strr, lenn): 
      
    # To store the final answer 
    ans = 0
  
    # Multiplier 
    mul = 1
  
    # Loop to find the answer 
    for i in range(lenn): 
  
        # Condition to update the answer 
        if (strr[i] == '0'): 
            ans += mul 
              
        # updating multiplier 
        mul *= 2
  
    return ans 
  
# Driver code 
strr = "10010"
lenn = len(strr) 
  
print(countSubSeq(strr, lenn)) 
  
# This code is contributed by Mohit Kumar 

