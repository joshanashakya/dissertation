

# Python3 implementation of the approach  
  
# Function to return the  
# count of such numbers  
def countNumbers(n):  
  
    # If n is odd  
    if n % 2 == 1: 
        return 0
  
    return (9 * pow(10, n // 2 - 1))  
  
# Driver code  
if __name__ == "__main__": 
  
    n = 2
    print(countNumbers(n))  
  
# This code is contributed  
# by Rituraj Jain 

