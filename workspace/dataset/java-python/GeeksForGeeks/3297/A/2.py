

# Python3 implementation of the approach 
  
# Function to return the count 
# of the required substrrings 
def countSubStr(strr, lenn): 
      
    # To store the final answer 
    ans = 0
  
    # Loop to find the answer 
    for i in range(lenn): 
  
        # Condition to update the answer 
        if (strr[i] == '0'): 
            ans += (i + 1) 
  
    return ans 
  
# Driver code 
strr = "10010"
lenn = len(strr) 
  
print(countSubStr(strr, lenn)) 
  
# This code is contributed by Mohit Kumar 

