

# Python3 code find MDAS_Factorial 
def MDAS_Factorial( N ): 
      
    if N <= 2: 
        return N 
  
    if N <= 4: 
        return N + 3
          
    if (N - 4) % 4 == 0: 
        return N + 1
  
    elif (N - 4) % 4 <= 2: 
         return N + 2
  
    else: 
         return N - 1
  
# Driver code 
N = 4  
print(MDAS_Factorial( N ) ) 
  
N = 10 
print(MDAS_Factorial( N ) ) 

