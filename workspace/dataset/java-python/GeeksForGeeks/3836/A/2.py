

# Python 3 program to find the minimum positive 
# x such that the given equation holds true 
  
# This function gives the required answer 
def minimumX(n, k): 
      
      
    ans = 10 ** 18
      
    # Iterate over all possible remainders 
    for i in range(k - 1, 0, -1): 
        if n % i == 0: 
            ans = min(ans, i + (n / i) * k) 
    return ans 
  
# Driver Code 
n, k = 4, 6
  
print(minimumX(n, k)) 
  
n, k = 5, 5
  
print(minimumX(n, k)) 
  
# This code is contributed 
# by Mohit Kumar 

