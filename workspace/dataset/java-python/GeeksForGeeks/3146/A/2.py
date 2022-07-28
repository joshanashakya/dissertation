

# Function to get sum of digits  
  
def getSum(n): 
  
    sum = 0
  
    # Single line that calculates sum  
    while(n > 0): 
        sum += int(n%10) 
        n = int(n/10) 
  
    return sum
  
# Driver code 
  
n = 687
print(getSum(n)) 
  
# This code is contributed by 
# Smitha Dinesh Semwal 

