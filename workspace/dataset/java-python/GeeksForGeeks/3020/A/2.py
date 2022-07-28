

# function to find double  
# factorial of given number 
def doublefactorial(n): 
  
    if (n == 0 or n == 1): 
        return 1; 
    return n * doublefactorial(n - 2); 
  
# Driver Code 
print("Double factorial is",  
       doublefactorial(5)); 
  
# This code is contributed 
# by Smitha 

