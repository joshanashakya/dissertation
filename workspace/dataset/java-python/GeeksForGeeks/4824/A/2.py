

# Python3 Program to find the sum 
# of sum of squares of first n  
# natural number 
  
# Function to find sum of sum of 
# square of first n natural number 
def findSum(n): 
    summ = 0
    for i in range(1, n+1): 
        summ = (summ + ((i * (i + 1)  
                * (2 * i + 1)) / 6))  
    return summ  
  
# Driven Program 
n = 3
print(int(findSum(n))) 
  
  
# This code is contributed by  
# Prasad Kshirsagar 

