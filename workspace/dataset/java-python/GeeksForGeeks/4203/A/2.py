

# Efficient Python3 program to  
# count passing cars  
  
# Returns count of passing cars  
def getPassingCars(A, n): 
  
    # Initialize count of 1s  
    # from right and result  
    countOne = 0; result = 0
    while n >= 1: 
        if A[n - 1] == 1: 
            countOne += 1
        else: 
            result += countOne 
        n -= 1
    return result 
  
# Driver code 
A = [0, 1, 0, 1, 1] 
n = len(A) 
print(getPassingCars(A, n)) 
  
# This code is contributed 
# by Shrikant13  

