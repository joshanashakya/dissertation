

# Python code to find last two  
# digits of n-th Fibonacci number 
  
def precomput(f): 
      
    # 0th and 1st number of the series  
    # are 0 and 1 
    f.append(0) 
    f.append(1) 
      
    # Add the previous 2 numbers in the series 
    # and store last two digits of result 
    for i in range(2,300): 
        f.append((f[i-1] + f[i-2]) % 100) 
  
# Returns last two digits of  
# n'th Fibonacci Number      
def findLastDigit(f,n): 
    return f[n%300] 
      
# driver code 
f = list() 
precomput(f) 
n = 1
print(findLastDigit(f, n)) 
n = 61
print(findLastDigit(f, n)) 
n = 7
print(findLastDigit(f, n)) 
n = 67
print(findLastDigit(f, n)) 
  
# This code is contributed by "Abhishek Sharma 44" 

