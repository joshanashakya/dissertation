

# Python 3 implementation of the approach 
from math import sqrt 
  
# Function that returns true if arr[] 
# contains all the divisors of some integer 
def checkDivisors(a,n): 
    # Maximum element from the array 
    X = max(a) 
  
    # Vector to store divisors 
    # of the maximum element i.e. X 
    b = [] 
  
    # Store all the divisors of X 
    for i in range(1,int(sqrt(X))+1): 
        if (X % i == 0): 
            b.append(i) 
            if (X // i != i): 
                b.append(X // i) 
  
    # If the lengths of a[] 
    # and b are different 
    # return false 
    if (len(b) != n): 
        return False
  
    # Sort a[] and b 
    a.sort(reverse = False) 
    b.sort(reverse = False) 
  
    for i in range(n): 
        # If divisors are not 
        # equal return false 
        if (b[i] != a[i]): 
            return False
    return True
  
# Driver code 
if __name__ == '__main__': 
    arr = [8, 1, 2, 12, 48,6, 4, 24, 16, 3] 
  
    N = len(arr) 
  
    if (checkDivisors(arr, N)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by 
# Surendra_Gangwar 

