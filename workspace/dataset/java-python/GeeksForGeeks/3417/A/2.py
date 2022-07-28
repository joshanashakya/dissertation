

# This function returns true if n is 
# perfect square, else false 
def isPerfectSquare(n): 
  
    # the_sum is sum of all odd numbers. i is 
    # used one by one hold odd numbers 
    i = 1
    the_sum = 0
    while the_sum < n: 
        the_sum += i 
        if the_sum == n: 
            return True
        i += 2
    return False
  
# Driver code 
if __name__ == "__main__": 
    print('Yes') if isPerfectSquare(35) else print('NO') 
    print('Yes') if isPerfectSquare(49) else print('NO') 
  
# This code works only in Python 3 

