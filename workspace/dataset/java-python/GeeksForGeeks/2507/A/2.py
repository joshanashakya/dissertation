

# Python 3 program to Count the numbers 
# within a given range in which when you 
# subtract a number from its reverse, 
# the difference is a product of k 
  
def isRevDiffDivisible(x, k) : 
    # function to check if the number 
    # and its reverse have their  
    # absolute difference divisible by k 
    n = x; m = 0
    while (x > 0) : 
  
        # Reverse the number 
        m = m * 10 + x % 10
        x = x // 10
          
    return (abs(n - m) % k == 0) 
  
def countNumbers(l, r, k) : 
    count = 0
    for i in range(l, r + 1) : 
  
        if (isRevDiffDivisible(i, k)) : 
            count = count + 1
      
    return count 
      
      
# Driver code 
l = 20; r = 23; k = 6
print(countNumbers(l, r, k)) 
  
  
# This code is contributed by Nikita Tiwari. 

