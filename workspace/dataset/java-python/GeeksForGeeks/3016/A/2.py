

# Python program to find 
# last non-zero digit in n! 
  
# Initialize values of 
# last non-zero digit of 
# numbers from 0 to 9 
dig= [1, 1, 2, 6, 4, 2, 2, 4, 2, 8] 
   
def lastNon0Digit(n): 
    if (n < 10): 
        return dig[n] 
   
     # Check whether tens (or second last) digit 
     # is odd or even 
     # If n = 375, So n/10 = 37 and (n/10)%10 = 7 
     # Applying formula for even and odd cases. 
    if (((n//10)%10)%2 == 0): 
        return (6*lastNon0Digit(n//5)*dig[n%10]) % 10
    else: 
        return (4*lastNon0Digit(n//5)*dig[n%10]) % 10
    return 0
  
# driver code 
n = 14
  
print(lastNon0Digit(n)) 
  
# This code is contributed 
# by Anant Agarwal. 

