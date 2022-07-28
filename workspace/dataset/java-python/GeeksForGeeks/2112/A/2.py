

# Python 3 program to count numbers 
# from 1 to n with 0 as a digit 
  
# Returns 1 if x has 0, else 0 
def has0(x) : 
      
    # Traverse through all digits  
    # of x to check if it has 0. 
    while (x != 0) : 
          
        # If current digit is 0, 
        # return true 
        if (x % 10 == 0) : 
            return 1
  
        x = x // 10
      
    return 0
  
  
# Returns count of numbers  
# from 1 to n with 0 as digit 
def getCount(n) : 
      
    # Initialize count of numbers 
    # having 0 as digit. 
    count = 0
  
    # Travers through all numbers 
    # and for every number check  
    # if it has 0. 
    for i in range(1, n + 1) : 
        count = count + has0(i) 
  
    return count 
  
  
# Driver program 
n = 107
print("Count of numbers from 1", " to ", 
                n , " is " , getCount(n)) 
  
  
# This code is contributed by Nikita tiwari. 

