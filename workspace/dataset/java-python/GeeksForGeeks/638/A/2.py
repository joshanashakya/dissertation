

# A simple Python 3 program to check if 
# n-th Fibonacci number is multiple 
# of 10. 
  
def fibonacci(n): 
  
    a = 0
    b = 1
    if (n <= 1): 
        return n 
    for i in range(2, n + 1): 
      
        c = a + b 
        a = b 
        b = c 
      
    return c 
  
# Returns true if n-th Fibonacci  
# number is multiple of 10. 
def isMultipleOf10(n): 
    f = fibonacci(30) 
    return (f % 10 == 0) 
  
# Driver code 
if __name__ =="__main__": 
      
    n = 30
    if (isMultipleOf10(n)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by ita_c 

