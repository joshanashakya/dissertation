

# Python3 program to  
# make a number odd 
  
def makeOdd(n): 
      
    # Return 1 if  
    # already odd 
    if n % 2 != 0: 
        return 1; 
          
    # Check on dividing  
    # with a number when 
    # the result becomes 
    # odd Return that number 
    for i in range(2, n): 
          
        # If n is divided by 
        # i and n/i is odd 
        # then return i 
        if (n % i == 0 and 
           (int)(n / i) % 2 == 1): 
            return i; 
  
# Driver code 
n = 36; 
print(makeOdd(n)); 
  
# This code is contributed  
# by mits 

