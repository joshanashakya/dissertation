

# Python3 implementation of the approach  
  
# Recursive function to generate all the  
# divisors from the prime factors  
def generateDivisors(curIndex, curDivisor, arr): 
      
    # Base case i.e. we do not have more  
    # primeFactors to include  
    if (curIndex == len(arr)): 
        print(curDivisor, end = ' ') 
        return
      
    for i in range(arr[curIndex][0] + 1): 
        generateDivisors(curIndex + 1, curDivisor, arr)  
        curDivisor *= arr[curIndex][1] 
      
# Function to find the divisors of n  
def findDivisors(n): 
      
    # To store the prime factors along  
    # with their highest power  
    arr = [] 
      
    # Finding prime factorization of n  
    i = 2
    while(i * i <= n): 
        if (n % i == 0): 
            count = 0
            while (n % i == 0): 
                n //= i  
                count += 1
                  
            # For every prime factor we are storing  
            # count of it's occurenceand itself.  
            arr.append([count, i])  
      
    # If n is prime  
    if (n > 1): 
        arr.append([1, n])  
      
    curIndex = 0
    curDivisor = 1
      
    # Generate all the divisors  
    generateDivisors(curIndex, curDivisor, arr)  
  
# Driver code  
n = 6
findDivisors(n)  
  
# This code is contributed by SHUBHAMSINGH10 

