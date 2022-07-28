

# Python 3 program to find count of  
# all numbers that multiples 
  
# Returns count of all numbers  
# smaller than or equal to n and  
# multples of 3 or 7 or both 
def countMultiples(n): 
    return n / 3 + n / 7 - n / 21; 
  
# Driver code 
n = ((int)(countMultiples(25))); 
print("Count =", n); 
  
# This code is contributed  
# by Shivi_Aggarwal 

