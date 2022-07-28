

# Python3 program to find total possible  
# numbers with n digits and weight w 
  
# Function to find total possible  
# numbers with n digits and weight w 
def findNumbers(n, w): 
  
    x = 0;  
    sum = 0; 
  
    # When Weight of an integer 
    # is Positive 
    if (w >= 0 and w <= 8): 
        # Subtract the weight from 9 
        x = 9 - w; 
      
    # When weight of an integer 
    # is negative 
    elif (w >= -9 and w <= -1): 
          
        # add the weight to 10 to 
        # make it positive 
        x = 10 + w; 
      
    sum = pow(10, n - 2); 
    sum = (x * sum); 
      
    return sum; 
  
# Driver code 
  
# number of digits in an 
# integer and w as weight 
n = 3;  
w = 4; 
  
# print the total possible numbers 
# with n digits and weight w 
print(findNumbers(n, w)); 
  
# This code is contributed  
# by mits 

