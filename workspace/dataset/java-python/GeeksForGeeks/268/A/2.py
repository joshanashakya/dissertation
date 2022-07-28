

# Python3 program to find if str1ing is a 
# perfect cube or not. 
from math import ceil 
  
def isPerfectCubeString(str1): 
    sum = 0
  
    # Finding ASCII values of each 
    # character and finding its sum 
    for i in range(len(str1)): 
        sum += ord(str1[i]) 
  
    # Find the cube root of sum 
    cr = ceil((sum)**(1/3)) 
  
    # Check if sum is a perfect cube 
    return (cr * cr * cr == sum) 
  
# Driver code 
str1 = "ll"
  
if (isPerfectCubeString(str1)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by mohit kumar 29 

