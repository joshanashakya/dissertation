

# Python3 program to find number of ways to  
# representing a number as a sum of 1's and 2's 
  
# Function to multiply matrix. 
def multiply(F, M): 
  
    x = F[0][0] * M[0][0] + F[0][1] * M[1][0] 
    y = F[0][0] * M[0][1] + F[0][1] * M[1][1] 
    z = F[1][0] * M[0][0] + F[1][1] * M[1][0] 
    w = F[1][0] * M[0][1] + F[1][1] * M[1][1] 
  
    F[0][0] = x 
    F[0][1] = y 
    F[1][0] = z 
    F[1][1] = w 
  
# Power function in log n 
def power(F, n): 
  
    if( n == 0 or n == 1): 
        return
    M = [[1, 1],[1, 0]] 
  
    power(F, n // 2) 
    multiply(F, F) 
  
    if (n % 2 != 0): 
        multiply(F, M) 
  
#/* function that returns (n+1)th Fibonacci number 
# Or number of ways to represent n as sum of 1's 
# 2's */ 
def countWays(n): 
    F = [[1, 1], [1, 0]] 
    if (n == 0): 
        return 0
    power(F, n) 
  
    return F[0][0] 
  
# Driver Code 
n = 5
print(countWays(n)) 
  
# This code is contributed by mohit kumar 

