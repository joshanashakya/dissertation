

# Python3 implementation of the approach 
  
# Function to return the minimum  
# number divisible by 3 formed by  
# the given digits 
def printSmallest(a, n): 
  
    sum0, sum1 = 0, 0
  
    # Sort the given array in ascending 
    a = sorted(a) 
  
    # Check if any single digit is 
    # divisible by 3 
    for i in range(n): 
        if (a[i] % 3 == 0): 
            return a[i] 
  
    # Check if any two digit number  
    # formed by the given digits is  
    # divisible by 3 starting from  
    # the minimum 
    for i in range(n): 
        for j in range(n): 
              
            # Generate the two digit number 
            num = (a[i] * 10) + a[j] 
            if (num % 3 == 0): 
                return num 
  
    # If none of the above is true, we can 
    # form three digit number by taking a[0] 
    # three times. 
    return a[0] * 100 + a[0] * 10 + a[0] 
  
# Driver code 
arr = [7, 7, 1 ] 
n = len(arr) 
  
print(printSmallest(arr, n)) 
  
# This code is conteibuted 
# by mohit kumar 29 

