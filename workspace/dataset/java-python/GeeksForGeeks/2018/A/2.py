

# Python3 code for above implementation 
TEN = 10
  
# Function to return the 
# sum of digits of n 
def digitSum(n): 
    sum = 0
    while (n > 0): 
  
        # Add last digit to the sum 
        sum += n % TEN 
  
        # Remove last digit 
        n //= TEN 
  
    return sum
  
# Function to return the nth term 
# of the required series 
def getNthTerm(n): 
    sum = digitSum(n) 
  
    # If sum of digit is already 
    # a multiple of 10 then append 0 
    if (sum % TEN == 0): 
        return (n * TEN) 
  
    # To store the minimum digit 
    # that must be appended 
    extra = TEN - (sum % TEN) 
  
    # Return n after appending 
    # the required digit 
    return ((n * TEN) + extra) 
  
# Function to print the first n terms 
# of the requried series 
def firstNTerms(n): 
    for i in range(1, n + 1): 
        print(getNthTerm(i), end = " ") 
  
# Driver code 
n = 10
  
firstNTerms(n) 
  
# This code is contributed by Mohit Kumar 

