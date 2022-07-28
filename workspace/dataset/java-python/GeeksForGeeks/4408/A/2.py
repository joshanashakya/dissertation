

# Python3 Program to find sum of series  
# 1^2 - 2^2 +3^3 -4^4 + ...  
  
# Function to find sum of series  
def sum_of_series(n) : 
  
    result = 0
  
    # If n is even  
    if (n % 2 == 0) :  
        result = -(n * (n + 1)) // 2
      
    # If n is odd  
    else : 
        result = (n * (n + 1)) // 2
      
    # return the result  
    return result 
  
# Driver Code  
if __name__ == "__main__" : 
  
    # Get n  
    n = 3
  
    # Find the sum  
    print(sum_of_series(n))  
  
    # Get n  
    n = 10
  
    # Find the sum  
    print(sum_of_series(n))  
  
# This code is contributed by Ryuga 

