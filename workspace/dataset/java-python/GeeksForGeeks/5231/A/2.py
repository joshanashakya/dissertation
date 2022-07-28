

# Python3 implementation of the approach 
  
# Function to return the count of total 
# binary prefix which are divisible by x 
def CntDivbyX(arr, n, x): 
  
    number = 0
  
    count = 0
  
    for i in range (0, n): 
          
        # Instead of converting all prefixes  
        # to decimal, take reminder with x 
        number = ( number * 2 + arr[i] ) % x 
      
        # If number is divisible by x  
        # then reminder = 0 
        if number == 0: 
            count += 1
      
    return count 
  
# Driver code 
arr = [1, 0, 1, 0, 1, 1, 0] 
n = 7
x = 2
print( CntDivbyX(arr, n, x) ) 

