

# Python3 implementation of the approach 
from math import ceil,sqrt 
MAX = 100000
  
# Map to store the divisor count 
divisors = [0] * MAX
  
# Function to generate the divisors 
# of all the array elements 
def generateDivisors(n): 
    for i in range(1,ceil(sqrt(n)) + 1): 
        if (n % i == 0): 
            if (n // i == i): 
                divisors[i]+=1
            else: 
                divisors[i] += 1
                divisors[n // i] += 1
  
# Function to find the maximum number 
# of multiples in an array before it 
def findMaxMultiples(arr, n): 
      
    # To store the maximum divisor count 
    ans = 0
    for i in range(n): 
  
        # Update ans if more number 
        # of divisors are found 
        ans = max(divisors[arr[i]], ans) 
  
        # Generating all the divisors of 
        # the next element of the array 
        generateDivisors(arr[i]) 
    return ans 
  
# Driver code 
arr = [8, 1, 28, 4, 2, 6, 7] 
n = len(arr) 
  
print(findMaxMultiples(arr, n)) 
  
# This code is contributed by mohit kumar 29 

