

# Python program to find  
# number of digits in nth  
# Fibonacci number 
import math 
  
# storing value of  
# golden ratio aka phi 
phi = (1 + 5**.5) / 2
  
# function to find number  
# of digits in F(n) This  
# function returns the number  
# of digitsin nth Fibonacci  
# number after ceiling it 
# Formula used (n * log(phi) -  
# (log 5) / 2) 
def numberOfDig (n) : 
    if n == 1 : 
        return 1
    return math.ceil((n * math.log10(phi) - 
                      .5 * math.log10(5))) 
  
// Driver Code 
for i in range(1, 11) : 
    print("Number of Digits in F(" + 
                   str(i) + ") - " + 
                str(numberOfDig(i))) 
  
# This code is contributed by SujanDutta 

