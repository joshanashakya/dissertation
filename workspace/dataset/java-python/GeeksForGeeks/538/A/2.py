

# Python 3 implementation of the above approach 
from math import sqrt 
  
# Function to count the pair 
def countPair(a, n): 
      
    # Find the maximum element of the array 
    maxm = a[0] 
    for i in range(len(a)): 
        if(a[i] > maxm): 
            maxm = a[i] 
    prime = [0 for i in range(maxm + 1)] 
  
    # Find primes upto maximum 
    prime[0] = prime[1] = 1; 
  
    for i in range(2, int(sqrt(maxm)) + 1, 1): 
        if (prime[i] == 0): 
            for j in range(2 * i, maxm + 1, i): 
                prime[j] = 1
  
    # Count pairs with at least prime 
    count = 0
    for i in range(n): 
        for j in range(i + 1, n, 1): 
            if (prime[a[i]] == 0 or 
                prime[a[j]] == 0): 
                count += 1
  
    return count 
  
# Driver code 
if __name__ == '__main__': 
    arr = [2, 3, 5, 4, 7] 
    n = 5
  
    print(countPair(arr, n)) 
  
# This code is contributed by 
# Sanjit_Prasad 

