

# Python3 program to find the Nth term 
# of Fibonacci series 
  
# Fibonacci Series using Recursion 
def fib(n): 
  
  
    # Base case 
    if (n <= 1): 
        return n 
  
    # recursive calls 
    return fib(n - 1) + fib(n - 2) 
  
# Driver Code 
if __name__=='__main__': 
    n = 6
    print (fib(n)) 
   
# This code is contributed by  
# Shivi_Aggarwal 

