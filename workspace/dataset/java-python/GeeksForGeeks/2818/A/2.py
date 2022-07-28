

# Python3 implementation of the approach 
  
# Function to return the count of 
# minimum operations required 
def minOperations(str, n): 
    count = 0
    for i in range(n - 1): 
  
        # Increment count when consecutive 
        # characters are different 
        if (str[i] != str[i + 1]): 
            count += 1
  
    # Answer is rounding off the 
    # (count / 2) to lower 
    return (count + 1) // 2
  
# Driver code 
str = "000111"
n = len(str) 
  
print(minOperations(str, n)) 
  
# This code is contributed 
# by Mohit Kumar 

