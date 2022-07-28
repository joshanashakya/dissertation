

# Implementation of factorial function 
def factorial(n): 
    if n == 1 or n == 0: 
        return 1
    else: 
        return factorial(n - 1) * n 
  
# Function to find GCD of factorial  
# of elements from array 
def gcdOfFactorial(arr, n): 
  
    # find the minimum element  
    # of array 
    minm = arr[0] 
    for i in range(1, n): 
        if minm > arr[i]: 
            minm = arr[i] 
        else: 
            arr[i] = minm 
  
    # return the factorial of  
    # minimum element 
    return factorial(minm) 
  
# Driver Code 
arr = [9, 12, 122, 34, 15 ] 
n = len(arr) 
print(gcdOfFactorial(arr, n)) 
  
# This code is contributed  
# by mohit kumar 

