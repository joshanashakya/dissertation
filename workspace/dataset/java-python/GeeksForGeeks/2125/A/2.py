

# Python3 implementation of above approach 
  
# Function to return the count of required numbers 
def getCount(N): 
  
    # If N is odd then return 0 
    if (N % 2 == 1): 
        return "0"
  
    result = "9"
  
    for i in range (1, N // 2 ): 
        result = result + "0"
  
    return result 
  
# Driver Code 
N = 4
print(getCount(N)) 
  
# This code is contributed by ihritik 

