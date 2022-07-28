

# Python program to find the 
# smallest values of x and y that 
# satisfy "ax - by = 0" 
  
# To find GCD using Eculcid's algorithm 
def gcd(a, b): 
    if (b == 0): 
        return a 
    return(gcd(b, a % b)) 
  
# Prints smallest values of x and y that 
# satisfy "ax - by = 0" 
def findSmallest(a, b): 
  
    # Find LCM 
    lcm = (a * b)/gcd(a, b) 
    print("x =", lcm / a, "\ny = ", lcm / b) 
  
# Driver code 
a = 25
b = 35
findSmallest(a, b) 
  
# This code is contributed 
# by Anant Agarwal. 

