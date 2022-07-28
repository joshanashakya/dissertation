

# Python 3 program to find two numbers 
# whose sum and GCD is given 
from math import gcd as __gcd 
  
# Function to find two numbers 
# whose sum and gcd is given 
def findTwoNumbers(sum, gcd): 
      
    # sum != gcd checks that both the 
    # numbers are positive or not 
    if (__gcd(gcd, sum - gcd) == gcd and
                          sum != gcd): 
        print("a =", min(gcd, sum - gcd),  
              ", b =", sum - min(gcd, sum - gcd)) 
    else: 
        print(-1) 
          
# Driver code 
if __name__ == '__main__': 
    sum = 8
    gcd = 2
  
    findTwoNumbers(sum, gcd) 
  
# This code is contributed by 
# Surendra_Gangwar 

