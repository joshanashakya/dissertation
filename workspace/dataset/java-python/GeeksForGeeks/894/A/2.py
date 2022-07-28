

# Python3 implementation to find the sum 
# of the product of proper divisors of 
# all the numbers lying in the range [L, R] 
  
mod = 1000000007
  
# Vector to store the product 
# of the proper divisors of a number 
ans = [1]*(100002) 
  
# Variable to store the prefix 
# sum of the product array 
pref = [0]*100002
  
# Function to precompute the product 
# of proper divisors of a number at 
# it's corresponding index 
def preCompute(): 
  
    # Modificatino of sieve to store the 
    # product of the proper divisors 
    for i in range(2,100000//2+1):  
        for j in range(2*i,100000+1,i):  
  
            # Multiplying the existing value 
            # with i because i is the 
            # proper divisor of ans[j] 
            ans[j] = (ans[j] * i) % mod 
          
    # Loop to store the prefix sum of the 
    # previously computed product array 
    for i in range(1,100002):  
  
        # Computing the prefix sum 
        pref[i] = pref[i - 1]+ ans[i] 
        pref[i] %= mod 
      
# Function to prthe sum 
# for each query 
def printSum(L, R): 
  
    print(pref[R] - pref[L - 1],end=" ") 
  
# Function to prte sum of product 
# of proper divisors of a number in 
# [L, R] 
def printSumProper(arr, Q): 
  
    # Calling the function that 
    # pre computes 
    # the sum of product 
    # of proper divisors 
    preCompute() 
  
    # Iterate over all Queries 
    # to prthe sum 
    for i in range(Q):  
        printSum(arr[i][0], arr[i][1]) 
      
# Driver code 
if __name__ == '__main__': 
    Q = 2
    arr= [ [ 10, 20 ], 
            [ 12, 16 ] ] 
  
    printSumProper(arr, Q) 
  
# This code is contributed by mohit kumar 29 

