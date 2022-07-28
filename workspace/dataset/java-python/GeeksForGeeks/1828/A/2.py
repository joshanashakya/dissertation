

# function to calculate nth term of the series 
def nthTerm(n): 
  
    # variable nth will store the nth  
    # term of series 
    nth = 0
  
    # if n is even 
    if (n % 2 == 0): 
        nth = 2 * ((n * n) - n) 
  
    # if n is odd 
    else: 
        nth = (2 * n * n) - n 
  
    # return nth term 
    return nth 
  
# Driver code 
n = 5
  
print(nthTerm(n)) 
  
n = 25
print(nthTerm(n)) 
  
n = 25000000
print(nthTerm(n)) 
  
n = 250000007
print(nthTerm(n)) 
  
# This code is contributed by  
# Mohit kumar 29 

