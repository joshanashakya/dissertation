

# Python3 code to find Even  Fibonacci 
# Series using normal Recursion 
   
# Function which return  
#nth even fibonnaci number  
def evenFib(n) : 
    if (n < 1) : 
        return n 
    if (n == 1)  : 
        return 2
   
    # calculation of  
    # Fn = 4*(Fn-1) + Fn-2 
    return ((4 * evenFib(n-1)) + evenFib(n-2))   
  
  
# Driver Code  
n = 7
print(evenFib(n)) 
  
  
# This code is contributed by Nikita Tiwari. 

