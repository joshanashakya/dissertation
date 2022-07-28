

# Python3 implementation of the approach 
  
# Function to return the sum 
# of digits of n 
def sumOfDigits(n): 
  
    Sum = 0
  
    while (n != 0): 
  
        # Add the last digit to the Sum 
        Sum = Sum + n % 10
  
        # Remove the last digit 
        n = n // 10
      
    # Return the Sum of the digits 
    return Sum
  
# Function to return the count of numbers 
# from the range [l, r] whose digit Sum 
# is equal to y 
def countTheNumbers(l, r, y): 
  
    # Initialise the count to zero 
    count = 0
  
    # Loop for each number from the range 
    for i in range(l, r + 1): 
  
        # If digit sum = y 
        if (sumOfDigits(i) == y): 
            count += 1
  
    # Return the required count 
    return count 
  
# Driver code 
l, r, y = 0, 10, 1
print(countTheNumbers(l, r, y)) 
  
# This code is contributed by mohit kumar 

