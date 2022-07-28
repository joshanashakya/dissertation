

# Python3 code to find smallest n digit  
# number which is divisible by x, y and z. 
from fractions import gcd 
import math 
  
# LCM for x, y, z 
def LCM( x , y , z ): 
    ans = int((x * y) / (gcd(x, y))) 
    return int((z * ans) / (gcd(ans, z))) 
      
# returns smallest n digit number  
# divisible by x, y and z 
def findDivisible (n, x, y, z): 
      
    # find the LCM 
    lcm = LCM(x, y, z) 
      
    # find power of 10 for least number 
    ndigitnumber = math.pow(10, n-1) 
      
    # reminder after 
    reminder = ndigitnumber % lcm 
      
    # If smallest number itself  
    # divides lcm. 
    if reminder == 0: 
        return ndigitnumber 
          
    # add lcm- reminder number for 
    # next n digit number 
    ndigitnumber += lcm - reminder 
      
    # this condition check the n digit 
    # number is possible or not 
    # if it is possible it return 
    # the number else return 0 
    if ndigitnumber < math.pow(10, n): 
        return int(ndigitnumber) 
    else: 
        return 0
  
# driver code 
n = 4
x = 2
y = 3
z = 5
res = findDivisible(n, x, y, z) 
  
# if number is possible then  
# it print the number 
if res != 0: 
    print( res) 
else: 
    print("Not possible") 
      
# This code is contributed by "Sharad_Bhardwaj".  

