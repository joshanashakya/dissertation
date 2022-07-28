

# Python3 implementation of the approach 
  
# Function to return the count of 
# valid values of X 
def getCount(a, b, c): 
  
    count = 0
  
    # Iterate through all possible 
    # sum of digits of X 
    for i in range(1, 82): 
  
        # Get current value of X for 
        # sum of digits i 
        cr = b * pow(i, a) + c 
  
        tmp = cr 
        sm = 0
  
        # Find sum of digits of cr 
        while (tmp): 
            sm += tmp % 10
            tmp //= 10
          
        # If cr is a valid choice for X 
        if (sm == i and cr < 10**9): 
            count += 1
      
    # Return the count 
    return count 
  
# Driver code 
a, b, c = 3, 2, 8
print(getCount(a, b, c)) 
  
# This code is contributed by Mohit Kumar 

