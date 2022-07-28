

# Python 3 implementation of the approach 
  
# Function to return the count of total 
# binary prefix which are divisible by x 
def CntDivbyX(arr, n, x): 
      
    # Initialize with zero 
    number = 0
    count = 0
  
    for i in range(n): 
          
        # Convert all prefixes to decimal 
        number = number * 2 + arr[i] 
  
        # If number is divisible by x 
        # then increase count 
        if ((number % x == 0)): 
            count += 1
  
    return count 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 0, 1, 0, 1, 1, 0] 
    n = len(arr) 
    x = 2
    print(CntDivbyX(arr, n, x)) 
  
# This code is contributed by 
# Surendra_Gangwar 

