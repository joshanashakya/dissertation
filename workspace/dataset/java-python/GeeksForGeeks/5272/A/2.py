

# Python3 implementation of the above approach 
  
# Function to return the sum of 
# all the proper factors of n 
def sumOfFactors(n): 
  
    sum = 0
    for f in range(1, n // 2 + 1):  
  
        # f is the factor of n 
        if (n % f == 0): 
            sum += f 
          
    return sum
  
# Function to return the required sum 
def getSum(arr, n): 
      
    # To store the sum 
    sum = 0
    for i in range(n): 
  
        # If current element is non-zero and equal 
        # to the sum of proper factors of itself 
        if (arr[i] > 0 and 
            arr[i] == sumOfFactors(arr[i])) : 
            sum += arr[i] 
      
    return sum
  
# Driver code 
arr = [17, 6, 10, 6, 4] 
  
n = len(arr) 
print(getSum(arr, n)) 
  
# This code is contributed by Mohit Kumar 

