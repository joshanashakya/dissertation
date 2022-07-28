

# Python 3 program to find sum of series  
# 1 + x^2/2 + x^3/3 + ....+ x^n/n 
  
# Python 3 code to print the  
# sum of the series 
def sum(x, n): 
  
    total = 1.0
    multi = x  
    for i in range(1, n+1):  
        total = total + multi / i  
        multi = multi * x  
      
    return total  
  
  
# Driver code 
x = 2
n = 5
print(round(sum(x, n), 2))  
  
# This code is contributed by 
# Smitha Dinesh Semwal 

