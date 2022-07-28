

# Python3 program to find whether a number 
# is power of 2 or not 
  
# Function to check whether a 
# number is power of 2 or not 
def ispowerof2(num): 
  
    if((num & (num - 1)) == 0): 
        return 1
    return 0
  
# Driver function 
if __name__=='__main__': 
    num = 549755813888
    print(ispowerof2(num)) 
      
# This code is contributed by 
# Sanjit_Prasad 

