

# Python3 program to check if  
# a given number is  
# Non-Hypotenuse number or not.  
  
# From math lib import sqrt function 
from math import sqrt 
  
# Function to find prime factor  
# and check if it is of the form  
# 4k+1 or not  
def isNonHypotenuse(n) : 
      
    # 2 is a prime number but not of  
    # the form 4k+1 so, keep Dividing  
    # n by 2 until n is divisible by 2  
    while (n % 2 == 0) :  
        n = n // 2
  
    # n must be odd at this point. So we  
    # can skip one element (Note i = i +2)  
    for i in range(3, int(sqrt(n)) + 1, 2) : 
  
        # if i divides n check if i  
        # is of the form 4k+1 or not  
        if (n % i == 0) : 
            if ((i - 1) % 4 == 0) : 
                return False
  
            # while i divides n divide n  
            # by i and update n  
            while (n % i == 0) :  
                n = n // i  
              
    # This condition is to handle the case  
    # when n is a prime number greater than 2  
    if (n > 2 and (n - 1) % 4 == 0) : 
        return False
  
    else : 
        return True
  
def test(n) : 
    print("Testing for", n, ":", end = " ")  
  
    if (isNonHypotenuse(n)) : 
        print("YES") 
  
    else : 
        print("NO") 
  
# Driver code  
if __name__ == "__main__" : 
  
    n = 11
    test(n)  
  
    n = 10
    test(n)  
  
# This code is contributed by Ryuga 

