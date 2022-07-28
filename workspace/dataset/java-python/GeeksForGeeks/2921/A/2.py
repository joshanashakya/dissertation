

# Python3 implementation of the approach 
  
# Function to return the nth term of the given series 
def term(n): 
      
    # Common difference 
    d = 2
      
    # First term 
    a1 = 0
      
    # nth term 
    An = a1 +(n-1)*d 
      
    # nth term of the given series 
    An = An**3
    return An; 
  
      
# Driver code 
n = 5
print(term(n)) 

