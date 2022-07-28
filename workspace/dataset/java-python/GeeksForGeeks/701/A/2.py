

# Python3 implementation of the approach 
  
# Function to return the count of 
# trailing zeroes 
def getTrailingZeroes(n): 
  
    count = 0
    val, powerTwo = 1, 2
  
    # Implementation of the Legendre's  
    # formula 
    while (val != 0): 
        val = n //powerTwo 
        count += val 
        powerTwo *= 2
  
    # Count has the highest power of 2 
    # that divides n! in base 10 
    return (count // 4) 
  
# Driver code 
n = 6
print(getTrailingZeroes(n)) 
  
# This code is contributed  
# by Mohit Kumar 

