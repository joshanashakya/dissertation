

# Python3 program to find  
# if string is a perfect  
# square or not. 
import math; 
def isPerfectSquareString(str): 
    sum = 0; 
      
    # calculating the length 
    # of the string 
    l = len(str); 
      
    # calculating the ASCII  
    # value of the string 
    for i in range(l): 
        sum = sum + ord(str[i]); 
      
    # Find floating point value 
    # of square root of x. 
    squareRoot = math.sqrt(sum); 
      
    # If square root is an integer 
    return ((squareRoot -
             math.floor(squareRoot)) == 0); 
  
# Driver code 
str = "d"; 
  
if (isPerfectSquareString(str)): 
    print("Yes"); 
else: 
    print("No"); 
  
# This code is contributed by mits 

