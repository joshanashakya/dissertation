

# Recursive Python program to count 
# number of digits in a number 
  
def countDigit(n): 
    if n == 0: 
        return 0
    return 1 + countDigit(n // 10) 
  
# Driver Code     
n = 345289467
print ("Number of digits : % d"%(countDigit(n))) 
  
# This code is contributed by Shreyanshi Arun 

