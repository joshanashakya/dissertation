

# Python3 implementation of the approach  
  
# Numbers are in range of pow(3, 32)  
arr = [0] * 32
  
# Conversion of ternary into balanced ternary as  
# start iterating from Least Significant Bit (i.e 0th),  
# if encountered 0 or 1, safely skip and pass carry 0  
# further 2, replace it to -1 and pass carry 1 further  
# 3, replace it to 0 and pass carry 1 further  
def balTernary(ter):  
   
    carry, base, i = 0, 10, 31 
    while ter > 0: 
        rem = (ter % base) + carry  
          
        if rem == 0:   
            arr[i] = 0 
            carry, i = 0, i-1 
           
        elif rem == 1:   
            arr[i] = 1 
            carry, i = 0, i-1 
           
        elif rem == 2:   
            arr[i] = -1 
            carry, i = 1, i-1 
           
        elif rem == 3:   
            arr[i] = 0 
            carry, i = 1, i-1 
           
        ter = ter // base  
       
    if carry == 1: 
        arr[i] = 1 
   
# Similar to binary conversion  
def ternary(number):  
   
    ans, rem, base = 0, 1, 1 
    while number > 0: 
        rem = number % 3 
        ans = ans + rem * base  
        number //= 3 
        base = base * 10 
       
    return ans  
   
# Driver code  
if __name__ == "__main__":  
   
    number = 3056 
    ter = ternary(number)  
    balTernary(ter)  
  
    i = 0 
  
    # Moving on to first occupied bit  
    while arr[i] == 0:   
        i += 1
       
    # Printing  
    for j in range(i, 32):   
  
        # Print 'Z' in place of -1  
        if arr[j] == -1:  
            print('Z', end = "")  
        else: 
            print(arr[j], end = "")  
       
# This code is contributed by Rituraj Jain 

