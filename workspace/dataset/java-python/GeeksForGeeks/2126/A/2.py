

# Python3 implementation of the approach 
  
# Function to return the factorial of n 
def fact(n): 
  
    res = 1
    for i in range(2, n + 1): 
        res = res * i 
    return res 
  
# Function to return the 
# count of numbers possible 
def Count_number(N): 
    return (N * fact(N)) 
  
# Driver code 
N = 2
  
print(Count_number(N)) 
  
# This code is contributed by Mohit Kumar 

