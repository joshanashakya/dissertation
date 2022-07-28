

# Python program to count 
# pair in range of natural 
# number having GCD equal 
# to given number. 
  
# Return the GCD of two numbers. 
def gcd(a,b): 
  
    return gcd(b, a % b) if b>0 else a 
  
   
# Return the count of pairs 
# having GCD equal to g. 
def countGCD(L,R,g): 
  
    # Setting the value of L, R. 
    L = (L + g - 1) // g 
    R = R// g 
   
    # For each possible pair 
    # check if GCD is 1. 
    ans = 0
    for i in range(L,R+1): 
        for j in range(L,R+1): 
            if (gcd(i, j) == 1): 
                ans=ans +1
   
    return ans 
  
# Driver code 
  
L = 1
R = 11
g = 5
  
print(countGCD(L, R, g)) 
  
# This code is contributed 
# by Anant Agarwal. 

