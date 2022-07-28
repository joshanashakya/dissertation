

# Python program for finding  
# the First digit of the  
# large factorial number 
import math 
def firstDigit(n) : 
    fact = 1
  
    for i in range(2, n + 1) : 
        fact = fact * i 
  
        # Removing trailing 0s  
        # as this does not  
        # change first digit. 
        while (fact % 10 == 0) :  
            fact = int(fact / 10) 
  
    # loop for divide the fact 
    # until it become the single 
    # digit and return the fact 
  
    while (fact >= 10) : 
        fact = int(fact / 10) 
      
    return math.floor(fact) 
  
# Driver Code 
n = 5
print (firstDigit(n)) 
  
# This code is contributed by  
# Manish Shaw(manishshaw1) 

