

# Python 3 implementation of the approach 
  
def minimumMoves(k, l, r): 
    # Total elements in the range 
    count = r - l + 1
  
    # If total elements are already divisible by k 
    if (count % k == 0): 
        return 0
  
    # Value that must be added to count 
    # in order to make it divisible by k 
    return (k - (count % k)) 
  
# Driver Program to test above function 
if __name__ == '__main__': 
    k = 3
    l = 10
    r = 10
    print(minimumMoves(k, l, r)) 
  
# This code is contributed by 
# Surendra_Gangwar 

