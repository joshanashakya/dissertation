

# Python 3 program to check if a number  
# is Trojan Number or not 
from math import sqrt, pow
  
# Function to check if a number 
# can be expressed as x^y 
def isPerfectPower(n): 
    if (n == 1): 
        return True
  
    # Try all numbers from 2 to  
    # sqrt(n) as base 
    for x in range(2, int(sqrt(n)) + 1): 
        y = 2
        p = pow(x, y) 
  
        # Keep increasing y while power  
        # 'p' is smaller than n. 
        while (p <= n and p > 0): 
            if (p == n): 
                return True
            y += 1
            p = pow(x, y) 
  
    return False
  
# Function to check if a number  
# is Strong 
def isStrongNumber(n): 
    count = {i:0 for i in range(n)} 
    while (n % 2 == 0): 
        n = int(n / 2) 
        count[2] += 1
  
    # count the number for each 
    # prime factor 
    for i in range(3,int(sqrt(n)) + 1, 2): 
        while (n % i == 0): 
            n = int(n / i) 
            count[i] += 1
  
    if (n > 2): 
        count[n] += 1
  
    flag = 0
  
    for ket,value in count.items(): 
          
        # minimum number of prime  
        # divisors should be 2 
        if (value == 1): 
            flag = 1
            break
      
    if (flag == 1): 
        return False
    else: 
        return True
  
# Function to check if a number 
# is Trojan Number 
def isTrojan(n): 
    if (isPerfectPower(n) == False and
        isStrongNumber(n)): 
        return True
    else: 
        return False
  
# Driver Code 
if __name__ == '__main__': 
    n = 108
  
    if (isTrojan(n)): 
        print("YES") 
    else: 
        print("NO") 
  
# This code is contributed by 
# Surendra_Gangwar 

