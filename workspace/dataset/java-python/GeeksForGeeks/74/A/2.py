

# Python3 program to find if a number 
# can be expressed as x raised to 
# power y. 
import math 
  
def isPower(n): 
  
    # Find Log n in different  
    # bases and check if the  
    # value is an integer 
    for x in range(2,int(math.sqrt(n)) + 1):  
      
        f = math.log(n) / math.log(x); 
        if ((f - int(f)) == 0.0):  
            return True;      
      
    return False; 
  
# Driver code 
for i in range(2, 100): 
    if (isPower(i)): 
        print(i, end = " "); 
  
# This code is contributed by mits 

