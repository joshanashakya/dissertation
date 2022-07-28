

# Python program to find 
# last digit of a number  
# obtained by dividing 
# factorial of a number 
# with factorial of another number. 
  
# Function which computes 
# the last digit 
# of resultant of B!/A! 
def computeLastDigit(A,B): 
  
    variable = 1
    if (A == B): # If A = B, B! = A! and B!/A! = 1 
        return 1
   
    # If difference (B - A) >= 5, answer = 0 
    elif ((B - A) >= 5):  
        return 0
   
    else:  
   
        # If non of the conditions 
        # are true, we 
        # iterate from  A+1 to B 
        # and multiply them.  
        # We are only concerned 
        # for the last digit, 
        # thus we take modulus of 10 
        for i in range(A + 1, B + 1): 
            variable = (variable * (i % 10)) % 10
   
        return variable % 10
      
# driver function 
  
print(computeLastDigit(2632, 2634)) 
  
# This code is contributed 
# by Anant Agarwal. 

