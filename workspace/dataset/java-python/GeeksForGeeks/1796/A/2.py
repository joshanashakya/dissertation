

# Python3 implementation of the approach  
  
# Function to return the sum of the  
# squares of first N natural numbers  
def squareSum(N):  
  
    Sum = (N * (N + 1) * (2 * N + 1)) // 6
    return Sum
  
# Function to return the maximum N such  
# that the sum of the squares of first N  
# natural numbers is not more than X  
def findMaxN(X): 
  
    low, high, N = 1, 100000, 0
  
    while low <= high: 
        mid = (high + low) // 2
  
        if squareSum(mid) <= X:  
            N = mid  
            low = mid + 1
          
        else: 
            high = mid - 1
      
    return N  
  
# Driver code  
if __name__ == "__main__":  
  
    X = 25
    print(findMaxN(X))  
  
# This code is contributed  
# by Rituraj Jain 

