

# Python3 implementation to Find the  
# conjugate of a complex number  
  
# Function to find conjugate  
# of a complex number  
def solve(s): 
    z = s 
    l = len(s)  
    i = 0
    if (s.find('+') != -1): 
    
        # store index of '+'  
        i = s.find('+') 
    
        s = s.replace('+', '-') 
    else: 
        # store index of '-'  
        i = s.find('-') 
  
        s = s.replace('-', '+',1) 
    
    # print the result  
    print("Conjugate of ",z," = ",s) 
  
  
# Driver code  
  
# initialise the complex number  
s = "3-4i"
solve(s) 
  
# This code is contributed by Sanjit_Prasad 

