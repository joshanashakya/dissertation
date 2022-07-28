

# Python3 implementation of the approach 
  
# Function to return sum 
def Sum(k, n): 
  
    Summ = 0
    for i in range(n + 1): 
        p = 1
  
        for j in range(n - i): 
            p = p * k 
  
        for j in range(i): 
            p = p * (k - 1) 
          
        Summ = Summ + p 
      
    return Summ 
  
# Driver code 
n = 3
K = 3
print(Sum(K, n)) 
  
# This code is contributed by mohit kumar 

