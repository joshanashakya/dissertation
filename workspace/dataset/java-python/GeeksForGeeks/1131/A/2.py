

# Python3 solution to count  
# solutions of a + b + c = n 
  
# Returns count of solutions 
# of a + b + c = n 
def countIntegralSolutions (n): 
    return int(((n + 1) * (n + 2)) / 2) 
      
# Driver code 
n = 3
print(countIntegralSolutions(n)) 
  
# This code is contributed by "Sharad_Bhardwaj". 

