

# Python 3 program 
# to Count numbers in 
# range L-R that are  
# divisible by all of 
# its non-zero digits 
  
  
# check if the number is  
# divisible by the digits. 
def check(n) : 
    m = n 
    while (n != 0) : 
        r = n % 10
        if (r > 0) : 
            if ((m % r) != 0) : 
                return False    
        n = n // 10
      
    return True
      
  
# function to calculate the 
# number of numbers 
def count(l, r) : 
    ans = 0
    for i in range(l, r+1) : 
        if (check(i)) : 
            ans = ans + 1
    return ans 
  
# Driver function 
l = 10
r = 20
print(count(l, r)) 
  
# This code is contributed by Nikita Tiwari. 

