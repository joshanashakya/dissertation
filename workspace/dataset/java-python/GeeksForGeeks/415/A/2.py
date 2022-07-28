

# Python3 implementation of above approach 
  
# Returns factorial of n 
def fact(n): 
    res = 1
    for i in range(2, n + 1): 
        res = res * i 
    return res 
  
# Returns nCr for the 
# given values of r and n 
def nCr(n, r): 
    return fact(n) // (fact(r) * fact(n - r)) 
  
def number_of_subsequences(arr, k, n): 
  
    s = 0
  
    # Map to store the frequencies 
    # of each elements 
    m = dict() 
   
    # Loop to store the 
    # frequencies of elements 
    # in the map 
    for i in arr: 
        m[i] = m.get(i, 0) + 1
  
    for j in m: 
  
        # Using nCR formula to 
        # calculate the number 
        # of subsequences of a 
        # given length 
        s = s + nCr(m[j], k) 
  
    return s 
  
# Driver Code 
arr = [1, 1, 1, 1, 2, 2, 2] 
k = 2
n = len(arr) 
  
# Function calling 
print(number_of_subsequences(arr, k, n)) 
  
# This code is contributed by Mohit Kumar 

