

# Python 3 program to find sum  
# of matrix in which each element  
# is absolute difference of its  
# corresponding row and column  
# number row.  
  
# Return the sum of matrix in  
# which each element is absolute  
# difference of its corresponding 
# row and column number row  
def findSum(n): 
    sum = 0
    for i in range(n): 
        sum += i * (n - i) 
    return 2 * sum
  
# Driver code 
n = 3
print(findSum(n)) 
  
# This code is contributed by Shrikant13 

