

# Python3 code to count  
# solutions of a + b + c = n 
  
# Returns count of solutions 
# of a + b + c = n 
def countIntegralSolutions (n): 
  
    # Initialize result 
    result = 0
      
    # Consider all triplets and  
    # increment result whenever  
    # sum of a triplet is n. 
    for i in range(n + 1): 
        for j in range(n + 1): 
            for k in range(n + 1): 
                if i + j + k == n: 
                    result += 1
      
    return result 
      
# Driver code 
n = 3
print(countIntegralSolutions(n)) 
  
# This code is contributed by "Sharad_Bhardwaj". 

