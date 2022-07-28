

# Python3 implementation of  
# the above approach 
  
# The total number of ways  
# is equal to the (n+2)th  
# Fibonacci term, hence we  
# only need to find that. 
def nth_term(n) : 
      
    a = 1
    b = 1
    c = 1
      
    # Construct fibonacci upto  
    # (n+2)th term the first 
    # two terms being 1 and 1 
    for i in range(0, n) : 
        c = a + b 
        a = b 
        b = c 
    return c 
  
# Driver Code 
  
# Take input n 
n = 10
c = nth_term(n) 
  
# printing output 
print (c) 
# This code is contributed by  
# Manish Shaw (manishshaw1) 

