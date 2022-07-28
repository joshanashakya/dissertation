

# Python3 implementation of the approach 
  
# Function to return the rightmost non-zero 
# digit in the multiplication 
# of the array elements 
def rightmostNonZero(a, n): 
      
    # To store the count of times 5 can 
    # divide the array elements 
    c5 = 0
  
    # Divide the array elements by 5 
    # as much as possible 
    for i in range(n): 
        while (a[i] > 0 and a[i] % 5 == 0): 
            a[i] //= 5
              
            # increase count of 5 
            c5 += 1
  
    # Divide the array elements by 
    # 2 as much as possible 
    for i in range(n): 
        while (c5 and a[i] > 0 and (a[i] & 1) == 0): 
            a[i] >>= 1
  
            # Decrease count of 5, because a '2' and 
            # a '5' makes a number with last digit '0' 
            c5 -= 1
  
    ans = 1
    for i in range(n): 
        ans = (ans * a[i] % 10) % 10
  
    # If c5 is more than the multiplier 
    # should be taken as 5 
    if (c5): 
        ans = (ans * 5) % 10
  
    if (ans): 
        return ans 
  
    return -1
  
# Driver code 
a = [7, 42, 11, 64] 
n = len(a) 
  
print(rightmostNonZero(a, n)) 
  
# This code is contributed by Mohit Kumar 

