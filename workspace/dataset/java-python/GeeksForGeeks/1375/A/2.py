

# Python3 implementation of the approach 
MAX = 1000000
  
prime = [True for i in range(MAX + 1)] 
  
def sieve(): 
  
    prime[0], prime[1] = False, False
  
    for p in range(2, MAX + 1): 
        if p * p > MAX: 
            break
        if (prime[p] == True): 
            for i in range(2 * p, MAX + 1, p): 
                prime[i] = False
  
# Function to return the distinct sums 
# that can be obtained by adding prime 
# numbers from the given arrays 
def distinctSum(arr1, arr2, m, n): 
    sieve() 
  
    # Set to store distinct sums 
    sumSet = dict() 
  
    for i in range(m): 
        for j in range(n): 
            if (prime[arr1[i]] and 
                prime[arr2[j]]): 
                sumSet[arr1[i] + arr2[j]] = 1
  
    return len(sumSet) 
  
# Driver code 
arr1 = [2, 3 ] 
arr2 = [2, 2, 4, 7 ] 
m = len(arr1) 
n = len(arr2) 
print(distinctSum(arr1, arr2, m, n)) 
  
# This code is contributed by mohit kumar 

