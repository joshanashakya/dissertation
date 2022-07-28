

# Python 3 program to find the sum of  
# first n natural numbers which are  
# not positive powers of k  
  
# Function to return the sum of  
# first n natural numbers which are  
# not positive powers of k  
def find_sum(n, k): 
  
    # sum of first n natural numbers  
    total_sum = (n * (n + 1)) // 2
    power = k 
    while power <= n: 
  
        # subtract all positive powers  
        # of k which are less than n  
        total_sum -= power 
  
        # next power of k  
        power *= k 
    return total_sum 
  
# Driver code 
n = 11; k = 2
print(find_sum(n, k)) 
  
# This code is contributed  
# by Shrikant13 

