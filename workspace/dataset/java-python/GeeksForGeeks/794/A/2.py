

# Python3 implementation of above approach 
  
# Boolean function to check  
# distinct digits of a number  
def checkDistinct(x):  
  
    # Take last digit  
    last = x % 10
  
    # Check if all other digits  
    # are same as last digit  
    while (x): 
          
        if (x % 10 != last): 
            return False
  
        # Remove last digit  
        x = x // 10
  
    return True
  
# Function to return the count of  
# integers that are composed of a  
# single distinct digit only  
def findCount(L, R): 
  
    count = 0
  
    for i in range(L, R + 1):  
  
        # If i has single distinct digit  
        if (checkDistinct(i)): 
            count += 1
  
    return count 
  
# Driver code  
L = 10
R = 50
  
print(findCount(L, R))  
  
# This code is contributed 
# by saurabh_shukla 

