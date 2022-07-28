

# Python3 code for naive implementation 
import math as mt 
  
# Function for checking the condition 
# with 2 loops 
def printNonDivisible(A, B, n, m): 
  
    for i in range(m): 
        j = 0
        for j in range(n): 
            if(B[i] % A[j] == 0): 
                break
  
        # If none of the elements in A[] 
        # divided B[i] 
        if (j == n - 1): 
            print(B[i]) 
  
# Driver code 
A = [100, 200, 400, 100] 
n = len(A) 
B = [190, 200, 87, 600, 800] 
m = len(B) 
printNonDivisible(A, B, n, m) 
  
# This code is contributed by# 
# mohit kumar 29 

