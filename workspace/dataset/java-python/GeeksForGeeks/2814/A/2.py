

# Python3 implementation of the approach 
  
# Function to return the minimum 
# changes required 
def minChanges(str, n): 
      
    # To store the count of minimum changes, 
    # number of ones and the number of zeroes 
    count, zeros, ones = 0, 0, 0
  
    # First character has to be '1' 
    if (ord(str[0])!= ord('1')): 
        count += 1
        ones += 1
  
    for i in range(1, n): 
        if (ord(str[i]) == ord('0')): 
            zeros += 1
        else: 
            ones += 1
  
        # If condition fails 
        # changes need to be made 
        if (zeros > ones): 
            zeros -= 1
            ones += 1
            count += 1
  
    # Return the required count 
    return count 
  
# Driver code 
if __name__ == '__main__': 
    str = "0000"
    n = len(str) 
    print(minChanges(str, n)) 
  
# This code contributed by PrinciRaj1992 

