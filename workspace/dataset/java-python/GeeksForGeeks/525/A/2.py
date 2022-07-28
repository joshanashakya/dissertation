

# Python 3 implementation of the approach 
  
# Function to check whether the product 
# of integers of the range [a, b] 
# is positive, negative or zero 
def solve(a,b): 
      
    # If both a and b are positive then 
    # the product will be positive 
    if (a > 0 and b > 0): 
        print("Positive") 
  
    # If a is negative and b is positive then 
    # the product will be zero 
    elif (a <= 0 and b >= 0): 
        print("Zero") 
  
    # If both a and b are negative then 
    # we have to find the count of integers 
    # in the range 
    else: 
          
        # Total integers in the range 
        n = abs(a - b) + 1
  
        # If n is even then the resultant 
        # product is positive 
        if (n % 2 == 0): 
            print("Positive") 
              
        # If n is odd then the resultant 
        # product is negative 
        else: 
            print("Negative") 
  
# Driver code 
if __name__ == '__main__': 
    a = -10
    b = -2
  
    solve(a, b) 
      
# This code is contributed by 
# Surendra_Gangwar 

