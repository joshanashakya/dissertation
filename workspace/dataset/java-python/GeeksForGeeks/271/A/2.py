

# Python 3 implementation to check 
# if the number is plus perfect  
# or not 
import math 
  
# function to check plus perfect number 
def checkplusperfect(x) : 
    temp = x 
      
    # calculating number of digits 
    n = 0
    while (x != 0) : 
        x = x // 10
        n = n + 1
      
      
    # calculating plus perfect number 
    x = temp 
    sm = 0
    while (x != 0) : 
        sm = sm + (int)(math.pow(x % 10, n)) 
        x = x // 10
      
      
    # checking whether number  
    # is plus perfect or not 
    return (sm == temp) 
  
  
# driver program 
x = 9474
if (checkplusperfect(x)) : 
    print("Yes") 
else : 
    print("No") 
      
  
# This code is contributed by Nikita Tiwari. 

