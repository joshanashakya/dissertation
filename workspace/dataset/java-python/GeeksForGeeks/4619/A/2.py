

# Python3 program to count Fibonacci  
# numbers in given range 
  
# Returns count of fibonacci  
# numbers in [low, high] 
def countFibs(low, high): 
      
    # Initialize first three  
    # Fibonacci Numbers 
    f1, f2, f3 = 0, 1, 1
  
    # Count fibonacci numbers in  
    # given range 
    result = 0
  
    while (f1 <= high): 
        if (f1 >= low): 
            result += 1
        f1 = f2 
        f2 = f3 
        f3 = f1 + f2 
  
    return result 
  
# Driver Code 
low, high = 10, 100
print("Count of Fibonacci Numbers is",  
                 countFibs(low, high)) 
  
# This code is contributed  
# by mohit kumar 

