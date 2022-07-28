

# Python3 implementation of the approach  
  
# Function to return the Nth term  
# of the given series  
def findNthTerm(x, y, n):  
  
    f = [0] * 6
  
    # First and second term of  
    # the series  
    f[0] = x  
    f[1] = y  
  
    # Find first 6 terms  
    for i in range(2, 6):  
        f[i] = f[i - 1] - f[i - 2]  
  
    # Return the Nth term  
    return f[n % 6]  
  
# Driver code  
if __name__ == "__main__": 
  
    x, y, n = 2, 3, 3
    print(findNthTerm(x, y, n)) 
  
# This code is contributed by 
# Rituraj Jain 

