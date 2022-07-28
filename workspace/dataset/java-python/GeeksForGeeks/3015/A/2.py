

# Python 3 Program to find the  
# sum of fourth powers of first 
# n odd natural numbers 
  
# calculate the sum of fourth  
# power of first n odd natural 
#numbers 
def oddNumSum(n): 
  
    return (n * (2 * n + 1) * 
      (24 * n * n * n - 12 * n 
      * n - 14 * n + 7)) / 15
  
# Driven Program 
n = 4
print(int(oddNumSum(n)))  
  
# This code is contributed by 
# Smitha Dinesh Semwal. 

