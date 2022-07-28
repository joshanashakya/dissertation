

# Python3 implementation of the approach 
  
# Function to return the required sum 
def sum( arr, n): 
  
    # Find the sum of the array elements 
    sum = 0
    for i in arr :  
        sum += i 
      
    # Every element appears 2^(n-1) times 
    sum = sum * pow(2, n - 1) 
    return sum
  
# Driver code 
arr = [ 2, 1, 5, 6 ] 
n = len(arr) 
  
print(sum(arr, n)) 
  
# This code is contributed by Arnab Kundu  

