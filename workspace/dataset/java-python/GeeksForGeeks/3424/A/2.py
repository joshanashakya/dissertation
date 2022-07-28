

# Python 3 program to check the sum after  
# Removing all zeroes is true or not  
  
# Function to remove zeroes  
def removeZero(n):  
      
    # Initialize result to zero holds the  
    # Result after removing zeroes from no  
    res = 0
  
    # Initialize variable d to 1 that  
    # holds digits of no  
    d = 1
  
    # Loop while n is greater then zero  
    while (n > 0): 
          
        # Check if n mod 10 is not equal  
        # to zero  
        if (n % 10 != 0): 
              
            # store the result by removing  
            # zeroes And increment d by 10  
            res += (n % 10) * d  
            d *= 10
  
        # Go to the next digit  
        n //= 10
  
    # Return the result  
    return res 
  
# Function to check if sum is true  
# after Removing all zeroes.  
def isEqual(a, b):  
      
    # Call removeZero() for both sides  
    # and check whether they are equal  
    # After removing zeroes.  
    if (removeZero(a) + 
        removeZero(b) == removeZero(a + b)): 
        return True
  
    return False
  
# Driver code  
a = 105
b = 106
if(isEqual(a, b)): 
    print("Yes") 
else: 
    print("No")  
  
# This code is contributed 
# by sahishelangia 

