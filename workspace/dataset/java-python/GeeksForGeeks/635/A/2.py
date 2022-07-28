

# Python 3 program to  
# check if M-th fibonacci  
# divides N-th fibonacci 
  
def check(n, m): 
  
    # exceptional case for F(2) 
    if (n == 2 or m == 2 or
        n % m == 0) : 
        print( "Yes" ) 
      
    # if none of the above  
    # cases, hence not divisible 
    else : 
        print( "No" ) 
  
# Driver Code 
m = 3
n = 9
check(n, m) 
  
# This code is contributed 
# by Smitha 

