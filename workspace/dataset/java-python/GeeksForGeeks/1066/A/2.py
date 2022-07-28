

# Python3 implementation of the approach  
  
# Function that returns true if the number represented  
# by the given array is divisible by y  
def isDivisible(arr, n, y): 
    d, i = 0, 0
      
    # While there are digits left  
    while i < n: 
          
        # Select the next part of the number  
        # i.e. the maximum number which is <= y  
        while d < y and i < n: 
            d = d * 10 + arr[i] 
            i += 1
          
        # Get the current remainder  
        d = d % y 
          
    # If the final remainder is 0  
    if d == 0: 
        return True
    return False
  
# Driver code  
if __name__ == "__main__": 
    arr = [ 1, 2, 1, 5, 6 ] 
    x = len(arr) 
    y = 4
    if (isDivisible(arr, x, y)): 
        print("Yes")  
    else:  
        print("No") 
      
# This code is contributed by 
# sanjeev2552 

