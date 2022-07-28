

# Python3 implementation of 
# above approach 
  
# Function to find the value of F(n) 
def findF_N(n): 
  
    ans = 0
    for i in range(n): 
        ans = ans + (i + 1) * (n - i - 1) 
  
    return ans 
  
# Driver code 
n = 3
print(findF_N(n)) 
  
# This code is contributed by 
# Sanjit_Prasad 

