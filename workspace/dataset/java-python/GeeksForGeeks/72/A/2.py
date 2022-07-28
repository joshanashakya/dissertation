

# Python3 code to check if a number 
# can be expressed as  
# 2 ^ x + 2 ^ y  
  
# Utility function to check if 
# a number is power of 2 or not 
def isPowerOfTwo( n): 
    return (n and (not(n & (n - 1))) ) 
              
      
# Utility function to determine the 
# value of previous power of 2         
def previousPowerOfTwo( n ):     
    while( n & n-1 ): 
        n = n & n - 1
    return n  
      
# function to check if 
# n can be expressed as 
# 2 ^ x + 2 ^ y or not 
def checkSum(n): 
  
        # if value of n is 0 or 1 
        # it can not be expressed as  
        # 2 ^ x + 2 ^ y  
        if (n == 0 or n == 1 ): 
            return False
              
        # if n is power of two then 
        # it can be expressed as 
        # sum of 2 ^ x + 2 ^ y 
        elif(isPowerOfTwo(n)): 
            print(n//2, n//2) 
            return True
              
        # if the remainder after  
        # subtracting previous power of 2 
        # is also a power of 2 then 
        # it can be expressed as 
        # 2 ^ x + 2 ^ y 
        else: 
                x = previousPowerOfTwo(n) 
                y = n-x; 
                if (isPowerOfTwo(y)): 
                    print(x, y) 
                    return True
                else:                     
                    return False
                      
# driver code 
n1 = 20
if (checkSum(n1)): 
  print("No") 
  
n2 = 11
if (checkSum(n2)): 
  print("No") 

