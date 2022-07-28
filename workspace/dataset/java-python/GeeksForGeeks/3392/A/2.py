

# Python3 implementation of the approach 
  
# Function to find the optimal weights 
def findWeights(X): 
  
    sum = 0
  
    # Number of weights required 
    power = 0
  
    # Finding the value of required powers of 3 
    while (sum < X): 
        sum = pow(3, power + 1) - 1
        sum //= 2
        power += 1
  
    # Optimal Weights are powers of 3 
    ans = 1
    for i in range(1, power + 1): 
        print(ans, end = " ") 
        ans = ans * 3
  
# Driver code 
X = 2
  
findWeights(X) 
  
# This code is contributed by Mohit Kumar 

