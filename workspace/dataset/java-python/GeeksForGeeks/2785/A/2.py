

# Python3 implementation of the approach 
  
# Function to return the count 
# of required numbers 
def countNumbers(L, R, K): 
  
    if (K == 9): 
        K = 0
  
    # Count of numbers present 
    # in given range 
    totalnumbers = R - L + 1
  
    # Number of groups of 9 elements 
    # starting from L 
    factor9 = totalnumbers // 9
  
    # Left over elements not covered 
    # in factor 9 
    rem = totalnumbers % 9
  
    # One Number in each group of 9 
    ans = factor9 
  
    # To check if any number in rem 
    # satisfy the property 
    for i in range(R, R - rem, -1): 
        rem1 = i % 9
        if (rem1 == K): 
            ans += 1
      
    return ans 
  
# Driver code 
L = 10
R = 22
K = 3
print(countNumbers(L, R, K)) 
  
# This code is contributed  
# by mohit kumar 

