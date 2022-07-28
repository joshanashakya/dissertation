

# Python3 program to find sum of series 
# 1^2 - 2^2 + 3^3 - 4^4 + ... 
  
# Function to find sum of series 
def sum_of_series(n): 
  
    result = 0
    for i in range(1, n + 1) : 
  
        # If i is even 
        if (i % 2 == 0): 
            result = result - pow(i, 2) 
  
        # If i is odd 
        else: 
            result = result + pow(i, 2) 
  
    # return the result 
    return result 
  
# Driver Code 
if __name__ == "__main__": 
  
    # Get n 
    n = 3
  
    # Find the sum 
    print(sum_of_series(n)) 
  
    # Get n 
    n = 10
  
    # Find the sum 
    print(sum_of_series(n)) 
  
# This code is contributed  
# by ChitraNayal 

