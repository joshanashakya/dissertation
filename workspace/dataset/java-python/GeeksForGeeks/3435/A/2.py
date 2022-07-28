

# Python 3 program to print GP. 
  
def printGP(a, r, n):  
    for i in range(0, n):  
        curr_term = a * pow(r, i) 
        print(curr_term, end =" ") 
      
  
# Driver code 
  
a = 2 # starting number 
r = 3 # Common ratio 
n = 5 # N th term to be find 
  
printGP(a, r, n) 
  
# This code is contributed by 
# Smitha Dinesh Semwal 

