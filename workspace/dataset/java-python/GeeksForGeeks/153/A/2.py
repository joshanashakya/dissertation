

# Python3 implementation of the approach 
from bisect import bisect as upper_bound 
from bisect import bisect_left as lower_bound 
from math import floor 
N = 1000005
MAX = 10**18
  
# Vector to store powers greater than 3 
powers = [] 
  
# Set to store perfect squares 
squares = dict() 
  
# Set to store powers other than perfect squares 
s = dict() 
  
def powersPrecomputation(): 
  
    for i in range(2, N): 
  
        # Pushing squares 
        squares[i * i] = 1
  
        # if the values is already a perfect square means 
        # present in the set 
        if (i not in squares.keys()): 
            continue
  
        temp = i 
  
        # Run loop until some power of current number 
        # doesn't exceed MAX 
        while (i * i <= (MAX // temp)): 
            temp *= (i * i) 
  
            # Pushing only odd powers as even power of a number 
            # can always be expressed as a perfect square 
            # which is already present in set squares 
            s[temp]=1
  
    # Inserting those sorted 
    # values of set into a vector 
    for x in s: 
        powers.append(x) 
  
def calculateAnswer(L, R): 
  
    # Precompute the powers 
    powersPrecomputation() 
  
    # Calculate perfect squares in 
    # range using sqrtl function 
    perfectSquares = floor((R)**(.5)) - floor((L - 1)**(.5)) 
  
    # Calculate upper value of R 
    # in vector using binary search 
    high = upper_bound(powers,R) 
  
    # Calculate lower value of L 
    # in vector using binary search 
    low = lower_bound(powers,L) 
  
    # Calculate perfect powers 
    perfectPowers = perfectSquares + (high - low) 
  
    # Compute final answer 
    ans = (R - L + 1) - perfectPowers 
  
    return ans 
  
  
# Driver Code 
  
L = 13
R = 20
print(calculateAnswer(L, R)) 
  
# This code is contributed by mohit kumar 29 

