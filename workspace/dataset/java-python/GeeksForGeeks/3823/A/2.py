

# Python3 code to find x y z that 
# satisfies 2/n = 1/x + 1/y + 1/z... 
  
# function to find x y and z that 
# satisfy given equation. 
def printXYZ( n ): 
    if n == 1: 
        print(-1) 
    else: 
        print("x is " , n ) 
        print("y is " ,n + 1) 
        print("z is " ,n * (n + 1)) 
  
# driver code to test the above function 
n = 7
printXYZ(n) 
  
# This code is contributed by "Sharad_Bhardwaj". 

