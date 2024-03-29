

# Python3 implementation of the approach 
  
# Function to return the  
# reverse of a number 
def reverse(n): 
    rev = 0
    while (n != 0): 
        rev = (rev * 10) + (n % 10) 
        n //= 10
    return rev 
  
# Function to find the sum of the odd 
# and even positioned digits in a number 
def getSum(n): 
  
    n = reverse(n) 
    sumOdd = 0
    sumEven = 0
    c = 1
  
    while (n != 0): 
  
        # If c is even number then it means 
        # digit extracted is at even place 
        if (c % 2 == 0): 
            sumEven += n % 10
        else: 
            sumOdd += n % 10
        n //= 10
        c += 1
  
    print("Sum odd =", sumOdd) 
    print("Sum even =", sumEven) 
  
# Driver code 
n = 457892
getSum(n) 
  
# This code is contributed  
# by mohit kumar 

