

# python3 program to find the minimum difference  
# between any two terms of two tables  
import math as mt 
    
# Utility function to find GCD of a and b  
def gcd(a,b): 
  
    while (b != 0): 
        t = b  
        b = a % b  
        a = t  
  
    return a  
   
# Returns minimum difference between  
# any two terms of shifted tables of 'a'  
# and 'b'. 'x' is shift in table of 'a'  
# and 'y' is shift in table of 'b'.  
def findMinDiff (a, b, x, y):  
    # Calculate gcd of a nd b  
    g  = gcd(a,b)  
    
    # Calculate difference between x and y  
    diff = abs(x-y) % g  
    
    return min(diff, g - diff)  
    
# Driver Code  
a,b,x,y = 20,52,5,7 
  
print(findMinDiff(a, b, x, y)) 
#This code is contributed by Mohit kumar 29 

