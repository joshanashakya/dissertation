

# Maximum possible sum of array after  
# repeated subtraction operation. 
  
def GCD(a, b): 
  
    if (b == 0): return a 
    return GCD(b, a % b) 
  
def findMaxSumUtil(arr, n): 
  
    finalGCD = arr[0] 
    for i in range(1, n): 
        finalGCD = GCD(arr[i], finalGCD) 
  
    return finalGCD 
  
# This function basically calls 
# findMaxSumUtil() to find GCD of 
# all array elements, then it returns 
# GCD * (Size of array) 
def findMaxSum(arr, n): 
  
    maxElement = findMaxSumUtil(arr, n) 
    return (maxElement * n) 
  
# Driver code 
arr = [8, 20, 12, 36] 
n = len(arr) 
print(findMaxSum(arr, n)) 
  
# This code is contributed by Anant Agarwal. 

