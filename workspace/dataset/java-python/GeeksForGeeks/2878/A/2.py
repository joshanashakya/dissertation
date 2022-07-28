

# Python3 program to find nth term 
  
# utility function 
def findTerm(n) : 
  
    if n == 1 : 
        return n 
    else : 
          
        # since first element of the 
        # series is 7, we initailise 
        # a variable with 7 
        term = 7
  
        # Using iteration to find nth  
        # term 
        for i in range(2, n + 1) : 
            term = term * 2 + (i - 1);      
  
    return term; 
  
# driver function 
print (findTerm(5)) 
  
# This code is contributed by Saloni Gupta 

