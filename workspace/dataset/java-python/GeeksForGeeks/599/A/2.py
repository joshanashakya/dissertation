

# Python implementation of  
# above idea 
  
# Prefix Array 
Prefix = [0] 
  
# Function to check if  
# the given number has  
# repeated digit or not  
def repeated_digit(n): 
    a = [] 
      
    # Traversing through each digit 
    while n != 0: 
        d = n%10
          
        # if the digit is present 
        # more than once in the 
        # number 
        if d in a: 
              
            # return 0 if the number 
            # has repeated digit 
            return 0
        a.append(d) 
        n = n//10
      
    # return 1 if the number has no 
    # repeated digit 
    return 1
  
# Function to pre calculate 
# the Prefix array 
def pre_calculation(MAX): 
      
    # To use to global Prefix array 
    global Prefix 
    Prefix.append(repeated_digit(1)) 
      
    # Traversing through the numbers 
    # from 2 to MAX 
    for i in range(2,MAX+1): 
          
        # Generating the Prefix array  
        Prefix.append( repeated_digit(i) +
                       Prefix[i-1] ) 
  
# Calclute Function 
def calculate(L,R): 
      
    # Answer 
    return Prefix[R]-Prefix[L-1] 
  
  
# Driver Code 
  
# Maximum  
MAX = 1000
  
# Pre-calculating the Prefix array. 
pre_calculation(MAX) 
  
# Range 
L=1
R=100
  
# Calling the calculate function 
# to find the total number of number 
# which has no repeated digit 
print(calculate(L, R)) 

