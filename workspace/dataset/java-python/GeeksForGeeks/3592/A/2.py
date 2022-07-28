

# Python3 implementation of the approach 
  
# Function to return the count of  
# required pairs 
def countPairs(n): 
  
    # Number which will give the Max  
    # value for ((n % i) % j) % n 
    num = ((n // 2) + 1) 
      
    # To store the Maximum possible value  
    # of ((n % i) % j) % n 
    Max = n % num 
  
    # To store the count of possible pairs 
    count = 0
  
    # Check all possible pairs 
    for i in range(1, n + 1): 
      
        for j in range(1, n + 1): 
  
            # Calculating the value of 
            # ((n % i) % j) % n 
            val = ((n % i) % j) % n 
  
            # If value is equal to Maximum 
            if (val == Max): 
                count += 1
          
    # Return the number of possible pairs 
    return count 
  
# Driver code 
n = 5
print(countPairs(n)) 
  
# This code is contributed 
# by Mohit Kumar 

