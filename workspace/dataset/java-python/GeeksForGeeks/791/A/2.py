

# Python3 implementation of the approach  
# Function to return the required sum  
def getSum(n, d):  
    sum = 0
    while (d <= n):  
        sum += d 
        d += 10
    return sum
  
# Driver code  
n = 30
d = 3
print(getSum(n, d)) 
  
# This code is contributed  
# by sahishelangia 

