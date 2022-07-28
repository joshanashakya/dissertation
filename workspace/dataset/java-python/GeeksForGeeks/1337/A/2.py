

# Python 3 program to find integer having  
# maximum number of prime factor in first  
# N natural numbers. 
from math import sqrt 
  
# Return smallest number having maximum 
# prime factors. 
def maxPrimefactorNum(N): 
    arr = [0 for i in range(N + 5)] 
  
    # Sieve of eratosthenes method to 
    # count number of prime factors. 
    for i in range(2, int(sqrt(N)) + 1, 1): 
        if (arr[i] == 0): 
            for j in range(2 * i, N + 1, i): 
                arr[j] += 1
  
        arr[i] = 1
  
    maxval = 0
    maxint = 1
  
    # Finding number having maximum  
    # number of prime factor. 
    for i in range(1, N + 1, 1): 
        if (arr[i] > maxval): 
            maxval = arr[i] 
            maxint = i 
      
    return maxint 
  
# Driver Code 
if __name__ == '__main__': 
    N = 40
    print(maxPrimefactorNum(N)) 
  
# This code is contributed by 
# Sahil_Shelangia 

