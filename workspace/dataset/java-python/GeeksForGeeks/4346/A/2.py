

# Python3 Program to compute sum of 
# 1 + x / 2 ! + x ^ 2 / 3 ! +...+x ^ n/(n + 1)! 
  
# Method to find the factorial of a number 
def fact(n): 
    if n == 1: 
        return 1
    else: 
        return n * fact(n - 1) 
  
# Method to compute the sum 
def sum(x, n): 
    total = 1.0
  
    # Iterate the loop till n 
    # and compute the formula 
    for i in range (1, n + 1, 1): 
        total = total + (pow(x, i) / fact(i + 1)) 
  
    return total 
  
# Driver code 
if __name__== '__main__': 
      
    # Get x and n 
    x = 5
    n = 4
  
    # Print output 
    print ("Sum is: {0:.4f}".format(sum(x, n))) 
      
# This code is contributed by  
# SURENDRA_GANGWAR 

