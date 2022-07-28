

# Python3 program to check whether  
# a number is Deserium number or not 
  
# Returns count of digits in n. 
def countDigits(n): 
  
    c = 0
    while (n != 0): 
        c += 1
        n = int( n / 10) 
      
    return c 
  
# Returns true if x is Diserium 
def isDeserium(x): 
  
    temp = x 
    p = countDigits(x) 
  
    # Compute powers of digits 
    # from right to left. 
    sum = 0
    while (x != 0):  
        digit = int(x % 10) 
        sum += pow(digit, p) 
        p -= 1
        x = int(x / 10) 
      
  
    # If sum of powers is same as 
    # given number. 
    return (sum == temp) 
  
# Driver code 
x = 135
if (isDeserium(x)): 
    print("Yes") 
else: 
    print("No") 
          
# This code is contributed by Smitha Dinesh Semwal. 

