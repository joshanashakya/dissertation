

# Python program to print Greatest 
# Common Divisor of number formed  
# by N repeating x times and y times 
  
# Return the Greatest common Divisor 
# of two numbers. 
def gcd(a, b): 
      
    if (a == 0): 
        return b 
      
    return gcd(b % a, a) 
  
# Prints Greatest Common Divisor of 
# number formed by n repeating x times 
# and y times. 
def findgcd(n, x, y): 
  
    # Finding GCD of x and y. 
    g = gcd(x, y) 
  
    # Print n, g times. 
    for i in range(g): 
        print(n) 
  
# Driver code 
n = 123
x = 5
y = 2
  
findgcd(n, x, y) 
  
# This code is contributed by Anant Agarwal. 

