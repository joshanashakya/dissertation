

# Python 3 implementation of the  
# above approach 
  
# Return the number of odd numbers 
# in the range [L, R] 
def countOdd(L, R): 
  
    N = (R - L) // 2
  
    # if either R or L is odd 
    if (R % 2 != 0 or L % 2 != 0): 
        N += 1
  
    return N 
  
# Driver code 
if __name__ == "__main__": 
      
    L = 3
    R = 7
  
    odds = countOdd(L, R) 
    evens = (R - L + 1) - odds 
    print("Count of odd numbers is", odds) 
    print("Count of even numbers is", evens) 
  
# This code is contributed by ita_c 

