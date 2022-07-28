

# Python3 implementation of the approach 
pie = 3.1415926535897
  
# Function to return the time when 
# the glass will be empty 
def findsolution(d, h, m, n): 
  
    k = (4 * m) / (pie * d * d) 
  
    # Check the condition when the 
    # glass will never be empty 
    if (n > k): 
        return -1
  
    # Find the time 
    ans = (h / (k - n)) 
    return round(ans, 5) 
  
# Driver code 
d = 1
h = 1
m = 1
n = 1
  
print(findsolution(d, h, m, n)) 
  
# This code is contributed by Mohit Kumar 

