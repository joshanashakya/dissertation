

# Python3 implementation of the approach 
  
# Function to return balancedBrackets String 
def balancedBrackets(Str): 
      
    # Initializing dep to 0 
    dep = 0
  
    # Stores maximum negative depth 
    minDep = 0
  
    for i in Str: 
        if (i == '('): 
            dep += 1
        else: 
            dep -= 1
  
        # if dep is less than minDep 
        if (minDep > dep): 
            minDep = dep 
  
    # if minDep is less than 0 then there 
    # is need to add '(' at the front 
    if (minDep < 0): 
        for i in range(abs(minDep)): 
            Str = '(' + Str
  
    # Reinitializing to check the updated String 
    dep = 0
  
    for i in Str: 
        if (i == '('): 
            dep += 1
        else: 
            dep -= 1
  
    # if dep is not 0 then there 
    # is need to add ')' at the back 
    if (dep != 0): 
        for i in range(dep): 
            Str = Str + ')'
  
    return Str
  
# Driver code 
Str = ")))()"
print(balancedBrackets(Str)) 
  
# This code is contributed by Mohit Kumar 

