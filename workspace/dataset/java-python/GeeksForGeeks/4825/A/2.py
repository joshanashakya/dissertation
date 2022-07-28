

# Python3 Program to find the sum  
# of sum of squares of first n  
# natural number 
  
# Function to find sum of sum of 
# square of first n natural number 
def findSum(n): 
    return ((n * (n + 1) * (n + 1) 
                 * (n + 2)) / 12) 
  
# Driven Program 
n = 3
print(int(findSum(n))) 
  
# This code is contributed by  
# Prasad Kshirsagar 

