

# Python3 implementation to find the N 
# numbers such that their 
# sum is a perfect cube 
  
# Function to find the N 
# numbers such that their 
# sum is a perfect cube 
def findNumbers(n): 
    i = 1
  
    # Loop to find the Ith term 
    # of the Centered Hexagonal number 
    while (i <= n): 
        print((3 * i * (i - 1) + 1), end=" ") 
        i += 1
  
# Driver Code 
n = 4
  
# Function Call 
findNumbers(n) 
  
# This code is contributed by mohit kumar 29 

