

# Python3 Program to find double 
# factorial of given number 
  
# Function to find double  
# factorial of given number 
def doublefactorial(n): 
    res = 1; 
    for i in range(n, -1, -2): 
        if(i == 0 or i == 1): 
            return res; 
        else: 
            res *= i; 
      
# Driver Code 
print("Double factorial is",  
        doublefactorial(5)); 
  
# This code is contributed by mits 

